var x;
var y;
function doAction(){
    var x = 1;
    var y = 1;
    z = 3;
    var sum = x + y;
    
    console.log(sum);
    
    console.log(plus(x, y));

    console.log(z);
    
    // 함수 표현식, 표현식 함수
    var subtract = function(x, y){
        return x - y;
    };    

    console.log(subtract(x, y));
    
    // 함수를 선언, 선언식 함수(함수 선언식)
    // function declaration
    function plus(x, y){
        return x + y;
    }

    var z;
}

doAction();