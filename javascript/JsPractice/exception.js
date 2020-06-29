"use strict";
(function(){
    console.log(1);
    errorHandler();
    console.log(2); // 1
    function errorHandler(){
        try{
            x = 0 / 3;
        }catch(e){
            console.log(e);
            throw e;
        }finally{
            console.log("finally");
        }
    }
})();

