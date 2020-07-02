(function(){
    var obj = {age:15, address:"순천시 장천동"};
    with(obj){
        console.log(age);
        console.log(address);
    }
    // console.log(age);
})();

