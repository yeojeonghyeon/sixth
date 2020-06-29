function calculate(command, x, y){
    return command(x, y);
}

console.log(calculate((x, y) => x+y, 1, 1));
calculate((x, y) => x-y, 1, 1);