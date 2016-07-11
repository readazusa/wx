Date.prototype.addDay=function(source){

    if(source){
        var year = this.getFullYear();
        console.info("year: "+ year);
        var month = this.getMonth()+1;
        console.info("moth: "+ month);
        var day = this.getDate();
        console.info("day:  "+ day);
        var newDay = day+source;
        return year+"-"+month+"-"+newDay;
    }

}

