// IIFE ( immediately invoked function expression ) : 이퓌
// 즉시 실행 함수 표현
(function(x, y){
    var isNameChecked = true;
    var isAgeChecked = false;
    console.log(isNameChecked);
    console.log(isAgeChecked);
    console.log(x, y);
    var x=1;
    var y=2;
    console.log(x, y);
    var x=2;
    var y=3;
    console.log(x, y);
    console.log(x > y);
    console.log(4 > 1);
    if ( isNameChecked ){
      console.log("isNamChecked");
    }
})(5, 5);
// 

(function(x, y){
  var z;
  for(var i=0; i<10; i++){
    var temp = temp + i;
    console.log(i);
  }
  console.log(temp);
})(1, 2);
  