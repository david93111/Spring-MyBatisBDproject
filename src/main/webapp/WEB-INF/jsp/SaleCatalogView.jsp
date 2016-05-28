<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sales wizard</title>
</head>
<body>
<div class="block-flat container">
	<div class="row">
		<h1>Sales wizard</h1>
	</div>
	<div class="row">
		<a class="btn btn-default" href="salesManagment.html?from=salesCatalog">Go Back</a>
	</div>
	<div class="row">
		<br>
		<div class="panel panel-default">
		  <div class="panel-body">
		    	<div class="input-group">
				  <span class="input-group-addon" id="basic-addon1"> 
				  	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
				  </span>
				  <input id="customer-selection-field" type="text" class="form-control" placeholder="Autocomplete client name" aria-describedby="basic-addon1">
				</div>
		  </div>
		</div>
	</div>
</div>
<script>
var context="${context}";
init();

function init(){
	
	jQuery("#customer-selection-field").autocomplete({
	    source: function( request, response ) {
	    	var matcher = new RegExp( $.ui.autocomplete.escapeRegex(request.term), "i" );
	    	jQuery.ajax({
	            dataType: "json",
	            type : 'Get',
	            url: context+"/saleCatalog/getClientsList.html",
	            data:{term: request.term},
	            success: function(data) {
	            	jQuery('#customer-selection-field').removeClass('ui-autocomplete-loading'); 
	            	if(data!=undefined&&data!=null&&data.arrayResults!=undefined){
	                // hide loading image
	            		response(data.arrayResults);
	                }
	            },
	            error: function(data) {
	            	jQuery('#customer-selection-field').removeClass('ui-autocomplete-loading');
	            	if(data!=undefined&&data!=null){
	            		
	            	}
	            }
	        });
	    },
	    minLength: 3,
	    open: function() {},
	    close: function() {},
	    focus: function(event,ui) {},
	    select: function(event, ui) {
	    	var id = this.id;
	    }
	});

}
</script>
</body>
</html>