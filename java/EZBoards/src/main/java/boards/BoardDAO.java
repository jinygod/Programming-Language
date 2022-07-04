package boards;

import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDAO {
	private DataSource dataFactory;
	Connection conn;
	PreparedStatement pstmt;

	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List selectAllArticles(Map pagingMap){
		List articlesList = new ArrayList();
		int section = (Integer)pagingMap.get("section");
		int pageNum=(Integer)pagingMap.get("pageNum");
		try{
		   conn = dataFactory.getConnection();
		   String query ="SELECT * FROM ( "
						+ "SELECT ROWNUM  as recNum,"+"LVL,"
							+"articleNO,"
							+"parentNO,"
							+"title,"
							+"mid,"
							+"writeDate"
				                  +" FROM (SELECT LEVEL as LVL, "
								+"articleNO,"
								+"parentNO,"
								+"title,"
								+"mid,"
								 +"writeDate"
							   +" FROM ezboard" 
							   +" START WITH  parentNO=0"
							   +" CONNECT BY PRIOR articleNO = parentNO"
							  +"  ORDER SIBLINGS BY articleNO DESC)"
					+") "                        
					+" WHERE recNum between(?-1)*100+(?-1)*10+1 and (?-1)*100+?*10";                
		   System.out.println(query);
		   pstmt= conn.prepareStatement(query);
		   pstmt.setInt(1, section);
		   pstmt.setInt(2, pageNum);
		   pstmt.setInt(3, section);
		   pstmt.setInt(4, pageNum);
		   ResultSet rs =pstmt.executeQuery();
		   while(rs.next()){
		      int level = rs.getInt("lvl");
		      int articleNO = rs.getInt("articleNO");
		      int parentNO = rs.getInt("parentNO");
		      String title = rs.getString("title");
		      String mid = rs.getString("mid");
		      Date writeDate= rs.getDate("writeDate");
		      ArticleVO article = new ArticleVO();
		      article.setLevel(level);
		      article.setArticleNO(articleNO);
		      article.setParentNO(parentNO);
		      article.setTitle(title);
		      article.setMid(mid);
		      article.setWriteDate(writeDate);
		      articlesList.add(article);	
		   } //end while
		   rs.close();
		   pstmt.close();
		   conn.close();
	  }catch(Exception e){
	     e.printStackTrace();	
	  }
	  return articlesList;
    } 
	
	public List selectAllArticles() {
		List articlesList = new ArrayList();
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT LEVEL, articleNO, parentNO, title, content, mid,writeDate FROM ezboard"
					+ " START WITH  parentNO=0 CONNECT BY PRIOR articleNO=parentNO"
					+ " ORDER SIBLINGS BY articleNO DESC";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int level = rs.getInt("level");
				int articleNO = rs.getInt("articleNO");
				int parentNO = rs.getInt("parentNO");
				String title = rs.getString("title");
				String content = rs.getString("content");
				String mid = rs.getString("mid");
				Date writeDate = rs.getDate("writeDate");
				ArticleVO article = new ArticleVO();
				article.setLevel(level);
				article.setArticleNO(articleNO);
				article.setParentNO(parentNO);
				article.setTitle(title);
				article.setContent(content);
				article.setMid(mid);
				article.setWriteDate(writeDate);
				articlesList.add(article);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return articlesList;
	}


	private int getNewArticleNO() {
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT max(articleNO) FROM ezboard ";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			
			ResultSet rs = pstmt.executeQuery(query);
			if (rs.next()) { 
				return (rs.getInt(1) + 1);
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insertNewArticle(ArticleVO article) {
		int articleNO = getNewArticleNO();
		try {
			conn = dataFactory.getConnection();
			int parentNO = article.getParentNO();
			String title = article.getTitle();
			String content = article.getContent();
			String mid = article.getMid();
			String imageFileName = article.getImageFileName();
			String query = "INSERT INTO ezboard (articleNO, parentNO, title, content, imageFileName, mid) VALUES (?, ?, ?, ?, ?, ?)";
			System.out.println(query);
			System.out.printf("# BoardDAO.insertNewArticle:(%d)(%d)(%s)(%s)(%s)(%s)%n", articleNO, parentNO, title, content, imageFileName, mid); 
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			pstmt.setInt(2, parentNO);
			pstmt.setString(3, title);
			pstmt.setString(4, content);
			pstmt.setString(5, imageFileName);
			pstmt.setString(6, mid);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		return articleNO;
	}

	public ArticleVO selectArticle(int articleNO) {
		ArticleVO article = new ArticleVO();
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT articleNO,parentNO,title,content, NVL(imageFileName, 'null') as imageFileName, mid, writeDate FROM ezboard WHERE articleNO=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int _articleNO = rs.getInt("articleNO");
			int parentNO = rs.getInt("parentNO");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String imageFileName = URLEncoder.encode(rs.getString("imageFileName"), "UTF-8");
			if(imageFileName.equals("null")) {
				imageFileName = null;
			}
			
			String mid = rs.getString("mid");
			Date writeDate = rs.getDate("writeDate");

			article.setArticleNO(_articleNO);
			article.setParentNO(parentNO);
			article.setTitle(title);
			article.setContent(content);
			article.setImageFileName(imageFileName);
			article.setMid(mid);
			article.setWriteDate(writeDate);
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return article;
	}

	public void updateArticle(ArticleVO article) {
		int articleNO = article.getArticleNO();
		String title = article.getTitle();
		String content = article.getContent();
		String imageFileName = article.getImageFileName();
		try {
			conn = dataFactory.getConnection();
			String query = "UPDATE ezboard SET title=?,content=?";
			if (imageFileName != null && imageFileName.length() != 0) {
				query += ", imageFileName=?";
			}
			query += " WHERE articleNO=?";

			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			if (imageFileName != null && imageFileName.length() != 0) {
				pstmt.setString(3, imageFileName);
				pstmt.setInt(4, articleNO);
			} else {
				pstmt.setInt(3, articleNO);
			}
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteArticle(int articleNO) {
		try {
			conn = dataFactory.getConnection();
			String query = "DELETE FROM ezboard ";
			query += " WHERE articleNO in (";
			query += "  SELECT articleNO FROM  ezboard ";
			query += " START WITH articleNO = ?";
			query += " CONNECT BY PRIOR  articleNO = parentNO )";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Integer> selectRemovedArticles(int articleNO) {
		List<Integer> articleNOList = new ArrayList<Integer>();
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT articleNO FROM ezboard  ";
			query += " START WITH articleNO = ?";
			query += " CONNECT BY PRIOR  articleNO = parentNO";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				articleNO = rs.getInt("articleNO");
				articleNOList.add(articleNO);
			}
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return articleNOList;
	}

	public int selectTotArticles() {
		try {
			conn = dataFactory.getConnection();
			String query = "SELECT count(articleNO) FROM ezboard ";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return (rs.getInt(1));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
