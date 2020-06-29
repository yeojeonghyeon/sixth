var obj = {age:1, name:"임꺽정"};
var obj1 = new Object();
obj1.age = 1;
obj1.name = "홍길동";

var methodObj = {
    version:1.2,
    author:"hello sydney",
    showInfo:function(){
        console.log(this.author, this.version);
    },
    say(){
        console.log(this.version, this.author);
    }
};

var methodB = {
    version:1.3,
    author:"david"
};

methodB.say = methodObj.say;
methodB.showInfo = methodObj.showInfo;
methodB.say();
methodB.showInfo();

var say = methodObj.say;
say();

methodObj.showInfo();
methodObj["say"]();