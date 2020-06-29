// 선언식 함수는 선언된 위치와 상관없이 실행 가능
foo();
// 선언식 함수(function declaration)
/*
foo => {
    __proto__ :Function.prototype,
    prototype:{constructor:foo, __proto__:Object.prototype}
}
*/
function foo(age){
    this.age = age;
}
/*
foo => {
    __proto__ :Function.prototype,
    prototype:{constructor:foo, __proto__:Object.prototype, showAge:function...}
}
*/
foo.prototype.showAge = function(){
    return this.age;
};
foo.apply({age:15}, null);

// 새로운 객체가 생성 
// this <= {__proto__: foo.prototype}
// this <= {__proto__: foo.prototype, age: age};
var f = new foo(15);
console.log(f);
console.log(f.showAge());

bar();
// 표현식 함수(function expression)
var bar = function(){
};

bar();