var x;
var y;

console.log(foo(1, 2));
// 표현식 함수는 할당문을 만나기 전에 실행이 불가능.
//console.log(func(1, 2));

// 표현식 함수
var func = function(x, y){
    return x + y;
};
// 선언식 함수
function foo(x){
    return x--;
}
