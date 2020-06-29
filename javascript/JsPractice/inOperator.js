// IIFE(즉시실행 함수)
(function(){
    var obj = {color:"white", size:"small", price:50000, brand:"xyz"};
    console.log("color" in obj);

    for(var del in obj){
        console.log(del, obj[del]);
    }

    var arr = [1, 2, 3, 4, 5];
    for(var element of arr){
        console.log(element);
    }
})();
