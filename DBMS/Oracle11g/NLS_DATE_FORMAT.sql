-- 날짜 포맷(형식) 변경

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY/MM/DD';

DESC nls_session_parameters;
SELECT * FROM nls_session_parameters;
SELECT parameter, value FROM nls_session_parameters;

SELECT parameter, value FROM nls_session_parameters WHERE upper(parameter) = 'NLS_DATE_FORMAT';