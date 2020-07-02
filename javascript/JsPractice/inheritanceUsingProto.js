function Person(name, birth){
    this.name = name;
    this.birth = birth;
    this.method = function(){
        console.log("Person's method");
    };
}
Person.prototype.showInfo = function(){
    console.log(`이름 : ${this.name}, 나이: ${this.birth}`)
};

Student.prototype = new Person("name", "birth");
//{name:"name", birth:"birth", method:function(){}, __proto__:Person.prototype}
function Student(name, birth, classInfo){
    Person.apply(this, [name, birth]); // 생성자 빌려 쓰기
    this.classInfo = classInfo;
}

let stu1 = new Student("kim", "1999-01-01", {className:"수학의 정석"});
let stu2 = new Student("keum", "2010-03-23", {className:"즐거운 생활"});
stu1.showInfo();
stu2.showInfo();
