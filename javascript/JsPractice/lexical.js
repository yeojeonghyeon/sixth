(function(){
    var funcArr = [];
    for(var i=1; i<10; i++){
      funcArr[i-1] = function(){
        console.log(i);
      }
    }
  
    funcArr[0](); // ?
    funcArr[1](); // ?
    funcArr[2](); // ?
})();

