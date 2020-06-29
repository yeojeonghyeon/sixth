var parent = {
    name: 'parent',
    sayHi: function() {
      console.log('Hi! ' + this.name);
    }
};

var child = Object.create(parent);
//child.name = 'child';

child.sayHi();

// ecmascript6
const child6 = {
    // child 객체의 프로토타입 객체에 parent 객체를 바인딩하여 상속을 구현한다.
    __proto__: parent
};

child6.sayHi();