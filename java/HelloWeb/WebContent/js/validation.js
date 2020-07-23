(function(global){
	function filterModule(){
		var filterArr = [];
		filterArr[0] = {
				filterName: "isNotEmpty",
				func: function(value){
					return !!value;
				}
		};
		filterArr[1] = {
				filterName: "isNumeric",
				func: function(value){
					var regexp = /^\d+/;				
					return regexp.test(value);
				}
		};
		function validCheck(filterArr, candidateArr){
			var resultArr = [];
			for(var candidate of candidateArr){
				var applyFilter = candidate.dataset.filter.split("|");
				var result = {id:candidate.id, resultArr:[]};
				filterArr.forEach(function(filter){
					if ( applyFilter.includes(filter.filterName) ){
						result.resultArr.push({filterName:filter.filterName, done:filter.func(candidate.value)});
					}
				});
				resultArr.push(result);
			}
			return resultArr;
		}
		var showResultRef;
		function test(containerId, candidateArr, showFlag = true){
			var resultArr = validCheck(filterArr, candidateArr);
			if ( showFlag ){
				showResultDiv(containerId, resultArr);
			}
			showResultRef = showResultDiv.bind(null, containerId, resultArr);			
			return resultArr;
		}
		function showResult(){
			showResultRef();
		};
		function showResultDiv(containerId, resultArr){
			var resultDiv, closeBtn;
			var container = document.getElementById(containerId);
			var previousDiv = container.querySelector("div.show");
			if ( previousDiv ){
				container.removeChild(previousDiv);
			}
			if ( !resultDiv ){
				resultDiv = document.createElement("div");
				resultDiv.classList.add("show");
				resultDiv.id = makeId();
				closeBtn = document.createElement("input");
				closeBtn.type = "button";
				closeBtn.value = "close";
				closeBtn.classList.add("closeBtn");
				closeBtn.addEventListener("click", function(){
					resultDiv.classList.remove("show");
					resultDiv.classList.add("hide");
					setTimeout(function(){
						container.removeChild(resultDiv);
					}, 1500);
				});
				resultDiv.appendChild(closeBtn);
			}
			var ul, li;
			ul = document.createElement("ul");
			for(var result of resultArr){
				li = document.createElement("li");
				li.innerText = `id : ${result.id} ${result.resultArr.map(v=>`${v.filterName} ${v.done}`).join(',')}`;
				ul.appendChild(li);
			}
			resultDiv.appendChild(ul);
			document.getElementById(containerId).appendChild(resultDiv);
		}
		var makeId = function () {
			return '_' + Math.random().toString(36).substr(2, 9);
		};
		return {test:test, showResult:showResult};
	}
	global.FilterModule = filterModule;
})(window||this);