/**
 * http://usejsdoc.org/
 */
const targetStr = "AA BB ZZ Aa Bb Cc dd bAb abcd";
const regex = /[A-Z]+/g;

const regexr = /[A-Za-z]+/g;

console.log(targetStr.match(regex));
console.log(regex.test(targetStr));

console.log(targetStr.match(regexr));