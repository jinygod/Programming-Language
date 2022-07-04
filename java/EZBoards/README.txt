[README.txt]


(커스텀 태그 라이브러리)
> JSTL(JSP Standard Tag Library)
> https://tomcat.apache.org/download-taglibs.cgi
  - Impl:   taglibs-standard-impl-1.2.5.jar
  - Spec:   taglibs-standard-spec-1.2.5.jar
  - EL:     taglibs-standard-jstlel-1.2.5.jar
  - Compat: taglibs-standard-compat-1.2.5.jar


(Oracle JDBC)
ojdbc6.jar

(파일 업로드 라이브러리)
> jakarta.apache.org/Commons/Fileupload
> http://commons.apache.org/proper/commons-fileupload/
  - commons-fileupload-1.3.3.jar(권고)
  - commons-fileupload-1.4.jar(최신)
  
> https://commons.apache.org/proper/commons-io/download_io.cgi  
  - commons-io-2.6.jar(권고)
  - commons-io-2.11.0.jar(최신)
  
(JSON 라이브리러)
> https://code.google.com/archive/p/json-simple/downloads  
  - json-simple-1.1.1.jar(권고)
  

(Servers/context.xml)  
	<Resource auth="Container" 
		driverClassName="oracle.jdbc.OracleDriver" 
		maxActive="50" 
		maxWait="-1" 
		name="jdbc/oracle"
		username="SOLUSER" 
		password="SOLUSER" 
		type="javax.sql.DataSource" 
		url="jdbc:oracle:thin:@localhost:1521:orcl" />
  