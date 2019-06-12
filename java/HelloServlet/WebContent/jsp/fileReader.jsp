<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.io.*" %>    
<%@ page import="java.io.BufferedReader" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	BufferedReader br = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/input.txt");
		br = new BufferedReader(new FileReader(filePath));
		while(true){
			String line = br.readLine();
			out.println(line+"<br>");
			if(line==null) break;
		}
	}catch(FileNotFoundException fe){
		fe.printStackTrace();
	}catch(IOException ie){
		ie.printStackTrace();		
	}finally{
		br.close();
	}
%>
</body>
</html>