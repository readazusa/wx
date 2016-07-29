exports.add = function() {
    var sum = 0;

    var length =arguments.length;
     if(length){
         for( var index = 0;index<length;index++ ){
                sum += arguments[index];
         }
     }
    return sum;
};