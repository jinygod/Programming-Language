--날짜 포맷(형식) 변경

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD';

DESC nls_session_parameters;
select * from nls_session_parameters;
select parameter, value from nls_session_parameters;
select parameter, value from nls_session_parameters where upper(parameter) = 'NLS_DATE_FORMAT';
