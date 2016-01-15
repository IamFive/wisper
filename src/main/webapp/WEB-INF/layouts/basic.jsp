<%@ page trimDirectiveWhitespaces="true" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/common/includes.jspf"  %>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sso - </title>
<meta name="Keywords" content="">
<meta name="Description" content="">
<script>
	var ctx = "${ctx}";
	var imgHost = "${imgHost}";
	var env = "${env}";
	var v= "${v}";
	var UEDITOR_HOME_URL = ctx + '/asserts/js/libs/ueditor/';
</script>
<!-- css here -->
<link href="${ctx}/asserts/styles/css/basic.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${ctx}/asserts/styles/css/front.css" />
<link href="${ctx}/asserts/styles/css/common.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${ctx}/asserts/js/libs/string.js"></script>
<!-- jQuery, dont want to use requirejs's map, so just put jQuery import here. -->
<script type="text/javascript" src="${ctx}/asserts/js/libs/jquery/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="${ctx}/asserts/js/libs/jquery/jquery-migrate-1.2.1.min.js"></script>
<script type="text/javascript" src="${ctx}/asserts/js/common/jquery.extends.js"></script>
<script type="text/javascript" src="${ctx}/asserts/js/libs/json3.min.js"></script>
<script type="text/javascript" src="${ctx}/asserts/js/libs/underscore/underscore-1.6.min.js"></script>
<!-- require js -->
<script type="text/javascript" src="${ctx}/asserts/js/rc.js"></script>
<Script data-main='<sitemesh:write property="body.data-main" />'  type="text/javascript" 
	src="${ctx}/asserts/js/libs/require/require.js"></script>
</head>
<body>
<em data-main='<sitemesh:write property="body.data-main" />'  type="text/javascript" 
	src="${ctx}/asserts/js/libs/require/require.js"></em>
	<sitemesh:write property='body' />
	<script type="text/javascript">
		require(['domReady!', 'common/css-fix', 'common/directives'], 
			function(doc, Fix, Directives) {
				Directives.initPlacehodler();
				Directives.initNumeric();
			});
	</script>
</body>
</html>