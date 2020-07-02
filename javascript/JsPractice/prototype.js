function foo(){
}
// Foo.prototype = {constructor:Foo, __proto__:Object.prototype}
// this <= {__proto__ : Foo.prototype}
function Foo(stuName, score, classArr){
    this.stuName = stuName;
    this.score = score;
    this.classArr = classArr;
    this.showInfo = function(){
        console.log(`학생이름 : ${this.stuName}`);
        console.log(`score : ${score}`);
        for(var ele of this.classArr){
            console.log(`클래스 이름 : ${ele.className}, 강의장소:${ele.place}`);
        }
    };
//    return this;
}
// Foo.prototype = {constructor:Foo, __proto__:Object.prototype, showInfoInPrototype:function(){}}
Foo.prototype.showInfoInPrototype = function(){
    console.log(`학생이름 : ${this.stuName}`);
    console.log(`score : ${score}`);    
    for(var ele of this.classArr){
        console.log(`클래스 이름 : ${ele.className}, 강의장소:${ele.place}`);
    }    
};

var stu1 = new Foo("ellis", 0, [{className:"java", place:"2강의실"}, {className:"캐드", place:"1강의실"}]);
var stu2 = new Foo("john wick", 0, [{className:"killer의 기술", place:"2강의실"}, {className:"사격술", place:"제1사격장"}]);
stu1.showInfo();
stu1.showInfoInPrototype();
stu2.showInfo();
stu2.showInfoInPrototype();

// 객체.함수(), ["함수"]()
// call, apply, bind this 전달
// 생성자 함수 호출, new 생성자 this <= 새로 생성된 객체가 this에 바인딩
// global, undefined
