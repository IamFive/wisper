<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/includes.jspf"%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>首页</title>
</head>
<body data-main="modules/site/zindex">
	Welcome,
	<shiro:principal></shiro:principal>
	<shiro:authenticated>
		<a href="${ctx}/logout">logout</a>
	</shiro:authenticated>
	
	<%@ include file="/common/message.jspf" %>
	
</body>
</html>
