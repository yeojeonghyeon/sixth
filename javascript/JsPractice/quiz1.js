var x = 1;
var y = "abc";

function f(){
    console.log("f invoked");
}

function y(x, y){
    return x*y;
}

var foo = function(x, y){
    return x+y;
};

var p = foo;

console.log(p(1,2));