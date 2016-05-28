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
	<div class="row" id="alert-messages">
		
	</div>
	<div class="row">
		<h1>Sales wizard</h1>
	</div>
	<div class="row" id="actions-panel">
		<a class="btn btn-default" href="salesManagment.html?from=salesCatalog">Go Back</a>
		<input type="hidden" id="orderId" name="orderId" val="${orderId}">
	</div>
	<br>
	<div class="row" id="catalog-container">
	
	   <div id="panel-client-autocomplete">
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
		
		<div class="col-md-8 col-xs-12" id="products-grid">
			
		</div>
		
		<ul class="cd-pricing-list col-md-4 col-xs-12" id="price-list-details" style="float:right;">
						
		</ul>
		
		
	</div>
</div>
<script>
var context="${context}";
initAutoComplete();

function initAutoComplete(){	
	jQuery("#customer-selection-field").autocomplete({
	    source: function( request, response ) {
	    	var matcher = new RegExp( $.ui.autocomplete.escapeRegex(request.term), "i" );
	    	jQuery.ajax({
	            dataType: "json",
	            type : 'Get',
	            url: context+"/saleCatalog/getClientsList.html",
	            data:{term: request.term},
	            success: function(data) {
	            	// hide loading image
	            	jQuery('#customer-selection-field').removeClass('ui-autocomplete-loading');
	            	if(data!=undefined&&data!=null&&data.arrayResults!=undefined){
	            		if(data.error!=undefined||data.warning!=undefined){
	            			if(data.error!=undefined){
	            				createErrorMessage(data.error);
	            			}
	            			if(data.warning!=undefined){
	            				createWarningMessage(data.warning);
	            			}
		            		
		            	}else{
		            		response(data.arrayResults);	
		            	}
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
	    	var reqId = ui.item.value;
	    	createSaleAfterClientSelect(reqId);
	    	this.value = ui.item.label;
	    }
	});
}

function createSaleAfterClientSelect(clientId){
	jQuery.ajax({
        dataType: "json",
        type : 'Get',
        url: context+"/saleCatalog/processClientAndSale.html",
        data:{clientId: clientId},
        success: function(data) {
        	if(data.error!=undefined||data.warning!=undefined){
    			if(data.error!=undefined){
    				createErrorMessage(data.error);
    			}
    			if(data.warning!=undefined){
    				createWarningMessage(data.warning);
    			}        		
        	}else{
        		jQuery("#orderId").val(data.saleId);
        		createSuccessMessage(data.sucess);
        		renderProductsInCatalog(data.productsArray);
        	}
        },
        error: function(data) {
        	createErrorMessage('There was an unexpected error in the process please contact the administrador to review the problem.');
        }
    });
}

function createWarningMessage(message){
	var html = "";
	html +=	'<div class="alert alert-warning alert-dismissible" role="alert">';
	html +=	'<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
	html +=	'<strong>Warning!</strong> '+message;
	html +=	'</div>';
	jQuery("#alert-messages").append(html);

}

function createErrorMessage(message){
	var html = "";
	html +=	'<div class="alert alert-danger alert-dismissible" role="alert">';
	html +=	'<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
	html +=	'<strong>Error!</strong> '+message;
	html +=	'</div>';
	jQuery("#alert-messages").append(html);

}

function createSuccessMessage(message){
	var html = "";
	html +=	'<div class="alert alert-success alert-dismissible" role="alert">';
	html +=	'<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>';
	html +=	'<strong>Sucess!</strong> '+message;
	html +=	'</div>';
	jQuery("#alert-messages").append(html);

}

function renderAutoCompleteReload(){
	createWarningMessage('The previous sale has been stoped,A new sale will be created');
	jQuery("#change-client-action").remove();
	jQuery("#products-grid").html('');
	jQuery("#products-grid").css('display','none');
	jQuery("#price-list-details").html('');
	jQuery("#price-list-details").css('display','none');
	
	var html=	'<div class="panel panel-default">';
		html+= '<div class="panel-body">';
		html+= '<div class="input-group">';
		html+= '<span class="input-group-addon" id="basic-addon1">';
		html+= '  	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>';
		html+= '	  </span>';
		html+= '	  <input id="customer-selection-field" type="text" class="form-control" placeholder="Autocomplete client name" aria-describedby="basic-addon1">';
		html+= '	</div>';
		html+= '</div>';
		html+= '</div>';
		jQuery("#panel-client-autocomplete").html(html);
		jQuery("#panel-client-autocomplete").css('display','block');
		initAutoComplete();
}

function renderProductsInCatalog(productsArray,detailsArray,totalPriceSale){
	jQuery("#panel-client-autocomplete").html('');
	jQuery("#panel-client-autocomplete").css('display','none');
	var htmlProducts='';
	for(i=0;i<productsArray.length;i++){
		htmlProducts+='<div class="event">';
		htmlProducts+='<span>('+productsArray[i].code+')</span>';
		htmlProducts+='		<div class="info">';
		htmlProducts+='Available '+productsArray[i].inventory+'<br>';
		htmlProducts+=productsArray[i].name;
		htmlProducts+='		</div>';
		htmlProducts+='	 <div class="price">';
		htmlProducts+=productsArray[i].price;
		htmlProducts+='		</div>';
		htmlProducts+='<a class="cd-select" onclick="AddProductToSale('+productsArray[i].prodId+')">add it</a>';
		htmlProducts+='</div>';
	}
		
		var htmlDetails='';
		var quantities = 0;
		htmlDetails+='<li class="cd-popular is-ended">';
		htmlDetails+='		<header class="cd-pricing-header">';
		htmlDetails+='			<h2>Sale total</h2>	';
		htmlDetails+='			<div class="cd-price">';
		htmlDetails+='				<span class="cd-currency">$</span>';
		if(totalPriceSale!=undefined){
			htmlDetails+='				<span class="cd-value">'+totalPriceSale+'</span>';
		}else{
			htmlDetails+='				<span class="cd-value">0</span>';
		}			
		
		htmlDetails+='			</div>';
		htmlDetails+='		</header>';	
		htmlDetails+='		<div class="cd-pricing-body">';
		htmlDetails+='			<ul class="cd-pricing-features">';
		
		if(detailsArray!=undefined){

				for(i=0;i<detailsArray.length;i++){
					htmlDetails+='	<li id=price_details_'+detailsArray.detailId[i]+'><em>'+detailsArray.name[i]+'</em> / Quantity'+detailsArray[i].quantity+' <button type="button" onclick="removeDetailFromSale('+detailsArray.detailId[i]+')" class="close" aria-label="Close"><span aria-hidden="true">&times;</span></button></li>';
					quantities+=detailsArray[i].quantity;
				}			
		}
		
		htmlDetails+='			</ul>';
		htmlDetails+='		</div>		';
		htmlDetails+='		<footer class="cd-pricing-footer">';
		htmlDetails+='			<div class="cd-price">';			
		htmlDetails+='				<span class="cd-value">Total units</span><br><span class="cd-value">'+quantities+'</span>';
		htmlDetails+='			</div>';
		htmlDetails+='		</footer> ';
		htmlDetails+='	</li>';
		
		jQuery("#price-list-details").html(htmlDetails);
		
		jQuery("#products-grid").html(htmlProducts);
		
		jQuery("#products-grid").css('display','block');
		jQuery("#price-list-details").css('display','block');
		
		jQuery("#actions-panel").append('<a class="btn btn-default" id="change-client-action" onclick="renderAutoCompleteReload()">Change client</a>');
}

function AddProductToSale(productId){
	jQuery.ajax({
        dataType: "json",
        type : 'Get',
        url: context+"/saleCatalog/processClientAndSale.html",
        data:{orderId: orderId,productId: productId},
        success: function(data) {
        	if(data.error!=undefined||data.warning!=undefined){
    			if(data.error!=undefined){
    				createErrorMessage(data.error);
    			}
    			if(data.warning!=undefined){
    				createWarningMessage(data.warning);
    			}        		
        	}else{
        		createSuccessMessage(data.sucess);
        		renderProductsInCatalog(data.productsArray);
        	}
        },
        error: function(data) {
        	createErrorMessage('There was an unexpected error in the process please contact the administrador to review the problem.');
        }
    });
}

function removeDetailFromSale(detailId){
	
}
</script>
</body>
<style>
/* -------------------------------- 

Primary style

-------------------------------- */
*, *::after, *::before {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

ol, ul.cd-pricing-list {
	list-style: none;
}

ul.cd-pricing-features{
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
}

html {
  font-size: 62.5%;
}

html * {
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

a {
  color: #e97d68;
  text-decoration: none;
}

/* -------------------------------- 

Main Components 

-------------------------------- */
.cd-header {
  height: 100px;
  line-height: 170px;
  position: relative;
}
.cd-header h1 {
  text-align: center;
  color: #FFFFFF;
  font-size: 2.2rem;
}
@media only screen and (min-width: 768px) {
  .cd-header {
    height: 160px;
    line-height: 280px;
  }
  .cd-header h1 {
    font-size: 3.6rem;
    font-weight: 300;
  }
}

.cd-pricing-container {
  width: 90%;
  max-width: 1170px;
  margin: 4em auto;
}
@media only screen and (min-width: 768px) {
  .cd-pricing-container {
    margin: 6em auto;
  }
  .cd-pricing-container.cd-full-width {
    width: 100%;
    max-width: none;
  }
}

.cd-pricing-list {
  margin: 2em 0 0;
}
.cd-pricing-list > li {
  position: relative;
  margin-bottom: 1em;
  background-color: #FFFFFF;
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
  /* Firefox bug - 3D CSS transform, jagged edges */
  outline: 1px solid transparent;
}
.cd-pricing-list > li::after {
  /* subtle gradient layer on the right - to indicate it's possible to scroll */
  content: '';
  position: absolute;
  top: 0;
  right: 0;
  height: 100%;
  width: 50px;
  pointer-events: none;
  background: -webkit-linear-gradient( right , #FFFFFF, rgba(255, 255, 255, 0));
  background: linear-gradient(to left, #FFFFFF, rgba(255, 255, 255, 0));
}
.cd-pricing-list > li.is-ended::after {
  /* class added in jQuery - remove the gradient layer when it's no longer possible to scroll */
  display: none;
}
@media only screen and (min-width: 768px) {
  .cd-pricing-list {
    margin: 3em 0 0;
  }
  .cd-pricing-list:after {
    content: "";
    display: table;
    clear: both;
  }
  .cd-pricing-list > li {
    width: 100%;
    float: left;
  }
  .cd-pricing-list > li::before {
    /* separator between pricing tables - visible when number of tables > 3 */
    content: '';
    position: absolute;
    z-index: 6;
    left: -1px;
    top: 50%;
    bottom: auto;
    -webkit-transform: translateY(-50%);
    -moz-transform: translateY(-50%);
    -ms-transform: translateY(-50%);
    -o-transform: translateY(-50%);
    transform: translateY(-50%);
    height: 50%;
    width: 1px;
    background-color: #b1d6e8;
  }
  .cd-pricing-list > li::after {
    /* hide gradient layer */
    display: none;
  }
  .cd-pricing-list > li.cd-popular {
    box-shadow: inset 0 0 0 3px #e97d68;
  }
  .cd-pricing-list > li.cd-popular::before {
    /* hide table separator for .cd-popular table */
    display: none;
  }
  .cd-pricing-list > li.cd-popular + li::before {
    /* hide table separator for tables following .cd-popular table */
    display: none;
  }
  .cd-has-margins .cd-pricing-list > li, .cd-has-margins .cd-pricing-list > li.cd-popular {
    box-shadow: 0 1px 5px rgba(0, 0, 0, 0.1);
  }
  .cd-secondary-theme .cd-pricing-list > li {
    background: #3aa0d1;
    background: -webkit-linear-gradient( bottom , #3aa0d1, #3ad2d1);
    background: linear-gradient(to top, #3aa0d1, #3ad2d1);
  }
  .cd-secondary-theme .cd-pricing-list > li.cd-popular {
    background: #e97d68;
    background: -webkit-linear-gradient( bottom , #e97d68, #e99b68);
    background: linear-gradient(to top, #e97d68, #e99b68);
    box-shadow: none;
  }
  .cd-pricing-list:nth-of-type(1)::before {
    /* hide table separator for the first table */
    display: none;
  }
  .cd-has-margins .cd-pricing-list > li {
    width: 32.3333333333%;
    float: left;
    margin-right: 1.5%;
    border-radius: 4px 4px 6px 6px;
  }
  .cd-has-margins .cd-pricing-list > li:last-of-type {
    margin-right: 0;
  }
  .cd-has-margins .cd-pricing-list > li::before {
    display: none;
  }
}
@media only screen and (min-width: 1500px) {
  .cd-full-width .cd-pricing-list > li {
    padding: 2.5em 0;
  }
}

@media only screen and (min-width: 768px) {
  .cd-popular .cd-pricing-wrapper > li::before {
    /* hide table separator for .cd-popular table */
    display: none;
  }
}
.cd-pricing-header {
  position: relative;
  z-index: 1;
  height: 80px;
  padding: 1em;
  pointer-events: none;
  background-color: #3aa0d1;
  color: #FFFFFF;
}
.cd-pricing-header h2 {
  margin-bottom: 3px;
  font-weight: 700;
  text-transform: uppercase;
}
.cd-popular .cd-pricing-header {
  background-color: #e97d68;
}
@media only screen and (min-width: 768px) {
  .cd-pricing-header {
    height: auto;
    padding: 1.9em 0.9em 1.6em;
    pointer-events: auto;
    text-align: center;
    color: #173d50;
    background-color: transparent;
  }
  .cd-popular .cd-pricing-header {
    color: #e97d68;
    background-color: transparent;
  }
  .cd-secondary-theme .cd-pricing-header {
    color: #FFFFFF;
  }
  .cd-pricing-header h2 {
    font-size: 1.8rem;
    letter-spacing: 2px;
  }
}

.cd-currency, .cd-value {
  font-size: 3rem;
  font-weight: 300;
}

.cd-duration {
  font-weight: 700;
  font-size: 1.3rem;
  color: #8dc8e4;
  text-transform: uppercase;
}
.cd-popular .cd-duration {
  color: #f3b6ab;
}
.cd-duration::before {
  content: '/';
  margin-right: 2px;
}

@media only screen and (min-width: 768px) {
  .cd-value {
    font-size: 7rem;
    font-weight: 300;
  }

  .cd-currency, .cd-duration {
    color: rgba(23, 61, 80, 0.4);
  }
  .cd-popular .cd-currency, .cd-popular .cd-duration {
    color: #e97d68;
  }
  .cd-secondary-theme .cd-currency, .cd-secondary-theme .cd-duration {
    color: #2e80a7;
  }
  .cd-secondary-theme .cd-popular .cd-currency, .cd-secondary-theme .cd-popular .cd-duration {
    color: #ba6453;
  }

  .cd-currency {
    display: inline-block;
    margin-top: 10px;
    vertical-align: top;
    font-size: 2rem;
    font-weight: 700;
  }

  .cd-duration {
    font-size: 1.4rem;
  }
}
.cd-pricing-body {
  overflow-x: auto;
  -webkit-overflow-scrolling: touch;
}
@media only screen and (min-width: 768px) {
  .cd-pricing-body {
    overflow-x: visible;
  }
}

.cd-pricing-features {
  width: 600px;
}
.cd-pricing-features:after {
  content: "";
  display: table;
  clear: both;
}
.cd-pricing-features li {
  width: 100px;
  float: left;
  padding: 1.6em 1em;
  font-size: 1.4rem;
  text-align: center;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}
.cd-pricing-features em {
  display: block;
  margin-bottom: 5px;
  font-weight: 600;
}
@media only screen and (min-width: 768px) {
  .cd-pricing-features {
    width: auto;
  }
  .cd-pricing-features li {
    float: none;
    width: auto;
    padding: 1em;
  }
  .cd-popular .cd-pricing-features li {
    margin: 0 3px;
  }
  .cd-pricing-features li:nth-of-type(2n+1) {
    background-color: rgba(23, 61, 80, 0.06);
  }
  .cd-pricing-features em {
    display: inline-block;
    margin-bottom: 0;
  }
  .cd-has-margins .cd-popular .cd-pricing-features li, .cd-secondary-theme .cd-popular .cd-pricing-features li {
    margin: 0;
  }
  .cd-secondary-theme .cd-pricing-features li {
    color: #FFFFFF;
  }
  .cd-secondary-theme .cd-pricing-features li:nth-of-type(2n+1) {
    background-color: transparent;
  }
}

.cd-pricing-footer {
  position: absolute;
  z-index: 1;
  top: 0;
  left: 0;
  /* on mobile it covers the .cd-pricing-header */
  height: 80px;
  width: 100%;
}
.cd-pricing-footer::after {
  /* right arrow visible on mobile */
  content: '';
  position: absolute;
  right: 1em;
  top: 50%;
  bottom: auto;
  -webkit-transform: translateY(-50%);
  -moz-transform: translateY(-50%);
  -ms-transform: translateY(-50%);
  -o-transform: translateY(-50%);
  transform: translateY(-50%);
  height: 20px;
  width: 20px;
  background: url(../img/cd-icon-small-arrow.svg);
}
@media only screen and (min-width: 768px) {
  .cd-pricing-footer {
    position: relative;
    height: auto;
    padding: 1.8em 0;
    text-align: center;
  }
  .cd-pricing-footer::after {
    /* hide arrow */
    display: none;
  }
  .cd-has-margins .cd-pricing-footer {
    padding-bottom: 0;
  }
}

.cd-select {
  position: relative;
  z-index: 1;
  display: block;
  height: 100%;
  /* hide button text on mobile */
  overflow: hidden;
  text-indent: 100%;
  white-space: nowrap;
  color: transparent;
}
@media only screen and (min-width: 768px) {
  .cd-select {
    position: static;
    display: inline-block;
    height: auto;
    padding: 1.3em 3em;
    color: #FFFFFF;
    border-radius: 2px;
    background-color: #0c1f28;
    font-size: 1.4rem;
    text-indent: 0;
    text-transform: uppercase;
    letter-spacing: 2px;
  }
  .no-touch .cd-select:hover {
    background-color: #112e3c;
  }
  .cd-popular .cd-select {
    background-color: #e97d68;
  }
  .no-touch .cd-popular .cd-select:hover {
    background-color: #ec907e;
  }
  .cd-secondary-theme .cd-popular .cd-select {
    background-color: #0c1f28;
  }
  .no-touch .cd-secondary-theme .cd-popular .cd-select:hover {
    background-color: #112e3c;
  }
  .cd-has-margins .cd-select {
    display: block;
    padding: 1.7em 0;
    border-radius: 0 0 4px 4px;
  }
}

.event {
  width: 45%;
  height: 350px;
  background: #fff;
  border: 1px solid #CCC;
  border-radius: 2px;
  margin: 1em;
  float:left;
}
.event:before {
  content: '';
  display: block;
  width: 295px;
  height: 70px;
  background: #fff;
  border: 1px solid #CCC;
  border-radius: 2px; 
  transform: rotate(2deg);
  position: relative;
  top: 12px;
  left: 2px;
  z-index: -1;
}
.event:after {
  content: '';
  display: block;
  width: 295px;
  height: 75px;
  background: #fff;
  border: 1px solid #CCC;
  border-radius: 2px; 
  transform: rotate(-2deg);
  position: relative;
  top: -136px;
  z-index: -2;  
}
.event > span {
  display: block;
  width: 12%;
  background: #232323;  
  position: relative;
  top: -55px;
  left: -15px;
  
  /* Text */
  color: #fff;
  font-size: 10px;
  padding: 2px 7px;
  text-align: right;
}
.event > .info {
  display: inline-block;
  position: relative;
  top: -75px;
  left: 40px;
  
  /* Text */
  color: #232323;
  font-weight: 600;
  line-height: 25px;
}
.event > .info:first-line {
  text-transform: uppercase;
  font-size: 10px;
  margin: 10px 0 0 0;
  font-weight: 700;
}
.event > .price {
  display: inline-block;
  width: 60px;
  position: relative;
  top: -85px;
  left: 115px; 
  
  /* Text */
  color: #E35354;
  text-align: center;
  font-weight: 700;
}

</style>
</html>