
function outer(){
    var index = 0;
    return function(){
        console.log(index++);
    };
}

var usingClosure1 = outer();
var usingClosure2 = outer();

usingClosure1();
usingClosure1();
usingClosure1();

usingClosure2();
usingClosure2();
usingClosure2();

(function foo(){
    if ( true ){
        var x = 1;
    }
    console.log(`function scoped x's value = ${x}`);
})();

var obj = {name:"홍길동"};
var obj2 = {name:"임꺽정"};
var x = obj||obj2;
console.log(x);

for (var prop in obj){
    console.log(prop);
}