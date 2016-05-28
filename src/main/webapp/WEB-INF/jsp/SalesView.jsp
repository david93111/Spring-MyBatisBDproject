<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Order Managment</title>
</head>
<body>
<div class="block-flat container">
	<div class="row">
		<h1>Order Managment</h1>
	</div>
	<div class="row">
		<div class="panel panel-default">
		  <div class="panel-body">
				<table id="orders_table" class="display">
				    <thead>
				        <tr>
				            <th>Order number</th>
				            <th>Total value</th>
				            <th>Sale status</th>
				        </tr>
				    </thead>
				    <tbody>
						<c:forEach var="saleItem" items="${sales}">
					        <tr>
					            <td><a href="salesDetail.html?&orderId=${saleItem.SALE_ID}">${saleItem.SALE_ID}</a></td>
					            <td>${saleItem.TOTAL_PRICE}</td>
					            <td>${saleItem.SALE_STATUS}</td>
					        </tr>
					    </c:forEach>
				    </tbody>
				 </table>
			</div>
		</div>
	</div>	
	<div class="row text-center">
		<a class="btn btn-primary" href="saleCatalog.html?from=orderManagment">New sale</a>
	</div>
</div>
<script>
	jQuery('#orders_table').DataTable(
			{
				responsive:true
			} );
</script>
</body>
</html>