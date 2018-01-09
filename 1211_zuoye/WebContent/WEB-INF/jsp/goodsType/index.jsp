<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 引入easyui的环境 -->
<jsp:include page="easyui.jsp"></jsp:include>

<script type="text/javascript">

$(function(){
	$('#goodsType_datagrid').datagrid({    
	    url:'<%=request.getContextPath()%>/GoodsType_List',
	    pageList:[2,3,4,5,6],
	    pagination:true,
	    columns:[[    
	        {field:'id',title:'类型编号',width:100},    
	        {field:'name',title:'类型名称',width:100},    
	        {field:'price',title:'Price',width:100,align:'right'}    
	    ]]    
	});
});

</script>


<title>Insert title here</title>
</head>
<body class="easyui-layout">   
    <div data-options="region:'north',title:'North Title'" style="height:100px;"></div>   
    <div data-options="region:'west',title:'West'" style="width:180px;"></div>   
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
    	
    	<table id="goodsType_datagrid"></table>  
    
    </div>   
</body> 
</html>