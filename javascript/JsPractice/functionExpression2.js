"use strict";
function printAll(x, y, ...args){
    for(const ele of args){
        console.log(ele);
    }
}

printAll(1, 2, 3, 4, 5);

["가", "나", "다", "라", "마"].forEach(function(v, index, array){
    console.log(v, index, array);
    console.log(this);
});

["a", "b", "c", "d", "e", "f"].forEach((v, index, array) => {
    console.log(v, index, array);
});