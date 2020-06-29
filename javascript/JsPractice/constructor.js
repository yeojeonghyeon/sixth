// javascript의 함수는 객체, Function 생성자 함수로 만들어진 함수 객체
// Function.prototype
// foo.__proto__ => Function.prototype = {
//                                         constructor:Function,
//                                         apply:function(){},
//                                         __proto__:Object.prototype
//                                       };
// foo.prototype
// 객체의 property에 접근하면 해당 객체 내부의 자신의 property가 없을 때 prototype chain 따라서 탐색
function foo(){

}
// Foo.prototype = {construnctor:Foo, __proto__:Object.prototype}
// Foo.__proto__ => Function.prototype
function Foo(name, age){
    this.name = name; // {__proto__:Foo.prototype, name:"홍길동"}
    this.age = age; // {__proto__:Foo.prototype, name:"홍길동", age:19}
    // 생성자 함수로 호출 시에는 새로생성된 객체(this)가 반환된다
    this.increase = function(){
        return ++age;
    };
}
Foo.prototype.address = "순천시 중앙동";
// 생성자 함수 호출, 내부적으로 {__proto__:Foo.prototype} 객체가 생성되고 this에 바인딩됨
var hong = new Foo("홍길동", 19);
var lim = new Foo("임꺽정", 35);
console.log(hong.increase());
console.log(hong.increase());
console.log(lim.increase());
console.log(lim.increase());
