var x = 1;
var y = x;
console.log(x, y);

x = 2;
///////////////////////////////////////////////////
var t = true;
var f = t;

t = false;
//////////////////////////////////////////////////
var obj = {class:"math", place:"5 floor", info:"information"};
var ref = obj;
ref.class = "korean";
var infoRef = ref.info;
infoRef = "no comment";
console.log(obj, ref);
//////////////////////////////////////////////////