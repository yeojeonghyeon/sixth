<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	int sum = 0;
	for(int i=0; i<=100; i++){
		sum += i;
	}
	request.setAttribute("result", new Integer(sum));
%>
<jsp:forward page="forwarded.jsp" />