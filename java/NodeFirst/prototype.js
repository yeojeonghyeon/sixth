/**
 * http://usejsdoc.org/
 */
function A(a) {
  this.varA = a;
}

// A의 정의에서 this.varA는 항상 A.prototype.varA가 가려버리는데
// prototype에 varA를 다시 넣는 이유는 무엇인가?
A.prototype = {
  varA: null,  // 아무것도 안하면서 varA를 쓰는 이유가 있을까?
      // 아마도 숨겨진 클래스의 할당 구조를 최적화 하려는 것인가?
      // https://developers.google.com/speed/articles/optimizing-javascript#Initializing-instance-variables
      // 모든 객체의 varA가 동일하게 초기화 되어야 상기 링크 내용이 유효할 수 있다.
  doSomething: function() {
	  console.dir(this);
  }
};

function B(a, b) {
  A.call(this, a);
  this.varB = b;
}
B.prototype = Object.create(A.prototype, {
  varB: {
    value: null, 
    enumerable: true, 
    configurable: true, 
    writable: true 
  },
  doSomething: { 
    value: function() { // override
      A.prototype.doSomething.apply(this, arguments); // call super
      // ...
    },
    enumerable: true,
    configurable: true, 
    writable: true
  }
});
B.prototype.constructor = B;

var b = new B(1, 2);
b.doSomething();
console.log(A.prototype.constructor);