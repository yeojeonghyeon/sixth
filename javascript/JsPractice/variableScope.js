//global scope
var globalScopeVar = 1;

function sum(x, y){
    globalScopeVar++;
    return x + y;
}

function sumUsingGlobalVar(x, y){
    return globalScopeVar + x + y;
}

function sumUsingLocalVar(x, y){
    var globalScopeVar = 3;
    return globalScopeVar + x + y;
}

console.log(sum(1, 2));
console.log(sumUsingGlobalVar(1, 2));
console.log(sumUsingLocalVar(1, 2));