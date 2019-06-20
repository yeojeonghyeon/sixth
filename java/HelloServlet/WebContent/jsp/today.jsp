<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.GregorianCalendar" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:scriptlet>
	GregorianCalendar now = new GregorianCalendar();
</jsp:scriptlet>
<jsp:expression>String.format("%TY년 %Tm월 %Td일", now, now, now)</jsp:expression>

<span>${param.param1} ${param.param2}</span>