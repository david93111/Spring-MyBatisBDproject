<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.12/css/dataTables.bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script type="text/javascript" charset="utf8" src="//cdn.datatables.net/1.10.12/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.12/js/dataTables.bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Details</title>
</head>
<body>
<div class="block-flat container">
	<div class="row">
		<h1>Order details of sale ${sale.SALE_ID}</h1>
	</div>
	<div class="row">
		<a class="btn btn-default" href="salesManagment.html">Go Back</a>
	</div>
	<div class="row">
		<br>
		<table id="order_details_table" class="display">
		    <thead>
		        <tr>
		            <th>Sale detail id</th>
		            <th>Product</th>
		            <th>Quantity</th>
		            <th>Value</th>
		            <th>Total detail value</th>
		        </tr>
		    </thead>
		    <tbody>
				<c:forEach var="saleDetailItem" items="${salesDetail}">
			        <tr>
			            <td>${saleDetailItem.SALE_DETAIL_ID}</td>
			            <td>${saleDetailItem.PRODUCT_NAME} (${saleDetailItem.PRODUCT_CODE})</td>
			            <td>${saleDetailItem.PRICE}</td>
			            <td>${saleDetailItem.QUANTITY}</td>
			            <td>${saleDetailItem.PRICE * saleDetailItem.QUANTITY}</td>
			        </tr>
			    </c:forEach>
		    </tbody>
		</table>
	</div>
</div>
<script>
jQuery('#order_details_table').DataTable(
		{
			responsive:true
		} );
</script>
</body>
</html>