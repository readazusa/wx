(function($){
    $.xyValalidateForm= function(form){
        var elements = form.elements;
        elements.forEach(function(e){
            var type = $(e).attr()
        });
    }





    var getRegex =function(type){
        var regex = null;
        switch(type){
            case 'email':
                 regex=/^\w{1,}@\w\.\W+|\W+\.\W+]$/i;
                break;
            case "tel":
                regex=/^1[34578][0-9]{9}$/i
                break;
            case "required":
                regex=/^\S/i;
                break;
        }
        return regex;
    }

})($)