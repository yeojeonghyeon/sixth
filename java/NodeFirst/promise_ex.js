/**
 * http://usejsdoc.org/
 */
new Promise(function(resolve, reject){
	setTimeout(function(){
		resolve(1);
	}, 3000);
})
.then(function(result){
	console.log(result);
	return result+1;
})
.then(function(result){
	console.log(result);
});