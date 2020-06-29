function operator(x, y, op){
    return op(x, y);
}

console.log(operator(1, 2, (x,y)=>x+y));
console.log(operator(1, 2, (x,y)=>x-y));
console.log(operator(1, 2, (x,y)=>x*y));
console.log(operator(1, 2, (x,y)=>x/y));

var arr = [1, 2, 3, 4, 5, 6, 7];
const addedValue = arr.reduce((accumulator, currentValue)=>{
    return accumulator+currentValue;
});

console.log(addedValue);

