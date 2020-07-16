<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
   .photo_box iframe {
      width: 100% !important;
      height: 100% !important;
   }
</style>
</head>

<body>

<div class="contents">
                     
                     <div class="tab_box">
                        <ul class="tab">
                           <li class="on"><a href="#" title="선택됨">여행지</a></li>
                           <li><a href="#" title="33">숙박</a></li>
                           <li><a href="#" title="33">맛집</a></li>
                        </ul>
    <script type="text/javascript">
            document.querySelector(".tab").addEventListener("click", function(e){
                e.target.title = "선택됨";
                e.target.parentElement.classList.add("on");
                var children = this.children;
                // for(var li of children){
                //     if ( e.target.parentElement === li ) continue;
                //     li.classList.remove("on");
                //     li.firstElementChild.title = "";
                // }
                for(var i=0; i < children.length; i++){
                    var li = children[i];
                    if ( e.target.parentElement === li ) continue;
                    li.classList.remove("on");
                    li.firstElementChild.title = "";
                }                
            });
     </script>
</div>
</body>
</html>