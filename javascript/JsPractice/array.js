(function(){
    var arr = [];
    var arr1 = new Array();
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = {prop:"객체"};

    arr.push(1234);
    console.log(arr.pop());

    arr1[0] = 1;
    arr1[1] = [1, 2, 3];
    showElements(arr);
    showElements(arr1);
    function showElements(arr){
        for(var ele of arr){
            console.log(ele);
        }
    }
    var unsortedArr = [10, 5, 3, 7, 9, 15, 27];
    unsortedArr.sort((a,b) => b-a);
    console.log(unsortedArr);
    unsortedArr.sort(function(a,b){
        return a-b;
    });
    console.log(unsortedArr);
    unsortedArr.prop = 1;
    console.log(unsortedArr.hasOwnProperty("sort"));
    console.log(unsortedArr.hasOwnProperty("prop"));
})();