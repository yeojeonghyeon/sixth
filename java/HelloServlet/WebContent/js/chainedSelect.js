/**
 * http://usejsdoc.org/
 */
(function(global, $){
	var ChainModule = function(selectIds, menuData, isOrdered=false){
		menuData = menuData||{					
			"data":[
			        { "id" : "1000", "pid" : "", "name" : "전라남도"},
			        { "id" : "2000", "pid" : "", "name" : "전라북도"},
					{ "id" : "1001", "pid" : "1000", "name" : "여수시"},
			        { "id" : "1002", "pid" : "1000", "name" : "순천시"},
			        { "id" : "2001", "pid" : "2000", "name" : "정읍시"},
			        { "id" : "2101", "pid" : "2001", "name" : "삼례"},			        
			        { "id" : "2002", "pid" : "2000", "name" : "전주시"},
					{ "id" : "1101", "pid" : "1001", "name" : "소호동"},			        
					{ "id" : "11011", "pid" : "1101", "name" : "소호동 1길"},					
					{ "id" : "1102", "pid" : "1001", "name" : "종화동"},					
					{ "id" : "1201", "pid" : "1002", "name" : "조례동"},			        
					{ "id" : "1202", "pid" : "1002", "name" : "연향동"},					
					{ "id" : "1211", "pid" : "1202", "name" : "연향 1길"},					
					{ "id" : "1212", "pid" : "1202", "name" : "연향 2길"}					
					]
		};
		
		this.init = function(){
			clearSelect(0);
			var rootItems = findChildItems("");
			setSelectWithItems(selectIds[0], rootItems);
			for(var selectId of selectIds){
				$("#"+selectId).on("change", function(){
					var btnIndex = selectIds.indexOf(this.id);
					if ( btnIndex == selectIds.length-1 ) return;
					if (this.value){
						var childItems = findChildItems(this.value);
						setSelectWithItems(selectIds[btnIndex+1], childItems);
						clearSelect(btnIndex+2);
					}else{
						clearSelect(btnIndex+1);
					}
				});
			}
		};
		
		const initialChar = "-선택-";
		function clearSelect(index){
			selectIds.forEach(function(ele, i){
				if ( i >= index ){
					$("#"+ele+" > option").remove();
					$("#"+ele).append('<option value="">'+initialChar+'</option>');
				}
			});
		}
		
		function findChildItems(id){
			return menuData.data.filter((ele, i)=>id==ele.pid);
		}
		
		function setSelectWithItems(selectId, items){
			var selectObj = document.getElementById(selectId);
			selectObj.options.length = 1;
			items.forEach(function(ele){
				var opt = document.createElement("option");
				opt.value = ele.id;
				opt.innerText = ele.name;
				selectObj.appendChild(opt);
			});
		}
	};
	global.ChainModule = ChainModule;
})(typeof window!=="undefined"?window:this, jQuery);