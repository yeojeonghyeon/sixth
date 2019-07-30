<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<input type="text" id="sender" value="${sessionScope.member.m_id}" style="display: block;">
		<input type="text" id="messageinput">
	</div>
	<div>
		<button type="button" onclick="openSocket();"> Open</button>
		<button type="button" onclick="send();">Send</button>
		<button type="button" onclick="closeSocket();">Close</button>
	</div>
	
	<div id="messages"></div>
	
	<script type="text/javascript">
		var ws;
		var messages=document.getElementById("messages");
		
		function openSocket(){
			ws = new WebSocket("ws://localhost:8080/chat/echo.do");
			if(ws!==undefined && ws.readyState!==WebSocket.CLOSED){
				writeResponse("WebSocket is alredy opend.");
				ws.onopen = function(event){
					if(event.data==undefined) return;
					
					writeResponse(event.data);
				};
				ws.onmessage = function(event){
					console.dir(event);
					writeResponse(event.data);
				};
				ws.onclose = function(event){
					writeResponse("Connection closed");
				}
			}
		}
		
		function send(){
			var text = document.getElementById("messageinput").value+","+document.getElementById("sender").value;
			ws.send(text);
			text="";
		}
		
		function closeSocket(){
			ws.close();
		}
		
		function writeResponse(text){
			messages.innerHTML+="<br/>"+text;
		}
	</script>

</body>
</html>