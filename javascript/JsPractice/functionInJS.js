var x = 1;
// internal property [[scope]] <= invoking global function's E.C(Execution Context: this, LexicalEnvironment, VariableEnvironment)
function zoo(){
    return ++x;
}

// Execution context = 
// {
//  thisBinding,
//  LexicalEnviront: {outer reference: [[scope]] } 
//  
// }
console.log(zoo());
console.log(zoo());

function outer(x){
    // [[scope]] <= 현재 실행되는 outer 함수의 E.C 식별자 정보를 담고 있는 컴포넌트(LexicalEnvionment)
    function inner(){
        return ++x;
    }
    return inner;
}

var c1 = outer(10);
var c2 = outer(20);

c1();
c1();

c2();
c2();