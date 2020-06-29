(function(x, y){
    var p = {id:"helloNimo", name:"홍길동"};
    var p1 = {id:"hiThere", name:"david"};
    // Function 생성자 함수를 통해서 만들어짐
    function showInfo(){
        console.log("showInfo", this.id, this.name);
    }
    showInfo.apply(p, null);
    showInfo.apply(p1, null);
})(1, 2);