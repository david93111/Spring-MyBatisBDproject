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