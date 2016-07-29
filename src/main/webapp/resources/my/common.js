(function($){
    $.add=function(x,y){
        return x+y;
    }

    $.test = function (obj) {
        obj.name;
        obj.success(4);
        alert("name: "+ name);
    }
})(smc);

(function($){
    var TY = {};
    TY.doAdd = function(x,y){
        alert(x+y);
    }
    window.TY= TY;
})(window);


