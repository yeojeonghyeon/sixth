var obj = {};
var counter = (count) => (
    (i = 0) => ({
        next: () => (
            (i++ < count) ?
            { value: i, done: false } :
            { value: 0, done: true }
        )
    })
);
var ref = counter(5);
console.dir(ref);
obj[Symbol.iterator] = counter(3);
console.log([...obj]) // [1, 2, 3];

for(var ele of obj){
    console.log(ele);
}