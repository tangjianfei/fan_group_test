<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<base href="<%=basePath%>">
	
    <script src="<%=basePath %>/js/jquery-1.8.3.min.js" type="text/javascript"></script>
    
    <title>接口方法测试</title>
    
    <script type="text/javascript">
    	function addField() {
    		var num=1;
    		
    		var tr_html = '<tr><td>key 1:</td><td><input type="text" name="key_1" value="" /></td></tr><tr><td>value 1:</td><td><input type="text" name="value_1" value="" /></td></tr>'
    	}
    	
    	function submitTest() {
    		
    	}
    </script>

  </head>
  
  <body>
	<form action="">
		<table width="300px" border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td>方法名：</td>
				<td>
					<input type="text" name="method" value="" />
				</td>
			</tr>
		</table>
		
		<br/>
		
		<table width="300px" border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td colspan="2">参数 1</td>
			</tr>
			<tr>
				<td>key 1:</td>
				<td>
					<input type="text" name="key_1" value="" />
				</td>
			</tr>
			<tr>
				<td>value 1:</td>
				<td>
					<input type="text" name="value_1" value="" />
				</td>
			</tr>
		</table>
		<input type="button" value="添加参数" onclick="addField()"/>
		<input type="button" value="提交结果" onclick="submitTest()"/>
	</form>
  </body>
  
</html>
