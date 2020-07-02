(function(){
    var funcArr = [];
    for(var i=0; i<10; i++){
        funcArr.push(function(){
            return i;
        });
    }
    for(var func of funcArr){
        console.log(func());
    }
})();

(function(){
    var funcArr = [];
    for(var i=0; i<10; i++){
        funcArr.push((function(i){
            return function(){
                return i;
            };
        })(i));
    }
    for(var func of funcArr){
        console.log(`IIFE => ${func()}`);
    }
})();

(function(){
    var funcArr = [];
    for(let i=0; i<10; i++){
        funcArr.push(function(){
            return i;
        });
    }
    for(let func of funcArr){
        console.log(`let(block scope) ${func()}`);
    }
})();