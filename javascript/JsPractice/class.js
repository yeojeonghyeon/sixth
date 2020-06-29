class Person{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    speak(){
        console.log(`${this.name} hello`);
    }
}

const ellie = new Person("ellie", 20);
console.log(ellie);
ellie.speak();
ellie['speak']();