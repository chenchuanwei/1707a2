<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<form action="<%=path%>/getJobList" method="post" id="s">
		<input type="hidden" name="pageNum">
		<input type="hidden" name="pageSize">
		影视名称:<input type="text" name="jname" value="${j.jname}">
		上线日期:<input type="date" name="bdate" value="${j.bdate}">~
		<input type="date" name="edate" value="${j.edate}">
		排序:<select name="orderl">
			<option value="jid">影视编号</option>
			<option value="jdate">上线日期</option>
			<option value="price">投资资金</option>
		</select>
		<select name="ordergz">
			<option value="asc">升序</option>
			<option value="desc">降序</option>
		</select>
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>影视编号</td>
			<td>影视名称</td>
			<td>上线日期</td>
			<td>投资资金(万)</td>
			<td>亮点编号</td>
			<td>亮点名称</td>
		</tr>
	<c:forEach items="${page.list}" var="j">
		<tr>
			<td>${j.jid}</td>
			<td>${j.jname}</td>
			<td>${j.jdate}</td>
			<td>${j.price}</td>
			<td>${j.lid}</td>
			<td>${j.lname}</td>
		</tr>
	</c:forEach>
	</table>
	<div align="center">
		<select id="size">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>			
		</select>条/页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="text" id="num" value="${page.pageNum}">/${page.pages}
		<input type="button" value="Go" onclick="fy1()">
		<input type="button" value="首页" onclick="fy2(1)">
		<input type="button" value="上一页" onclick="fy2(${page.pageNum==1?1:page.pageNum-1})">
		<input type="button" value="下一页" onclick="fy2(${page.pageNum==page.pages?page.pages:page.pageNum+1})">
		<input type="button" value="尾页" onclick="fy2(${page.pages})">
	</div>
</body>
<script type="text/javascript">
	
	function fy1(){
		var pageSize=$("#size>option:selected").val();
		var pageNum=$("#num").val();
		$("[name='pageSize']").val(pageSize);
		$("[name='pageNum']").val(pageNum);
		$("#s").submit();
	}
	
	function fy2(pageNum){
		var pageSize=$("#size>option:selected").val();
		$("[name='pageSize']").val(pageSize);
		$("[name='pageNum']").val(pageNum);
		$("#s").submit();
	}

	var size="${page.pageSize}";
	$("#size>option[value='"+size+"']").attr("selected",true);

	var orderl="${j.orderl}";
	$("[name='orderl']>option[value='"+orderl+"']").attr("selected",true);
	
	var ordergz="${j.ordergz}";
	$("[name='ordergz']>option[value='"+ordergz+"']").attr("selected",true);

</script>
</html>