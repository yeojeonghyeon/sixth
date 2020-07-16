<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/user/common/user_common.jsp"%>

<jsp:include page="/WEB-INF/jsp/user/layout/user_header.jsp" />
<%-- <script type="text/javascript" src="<c:url value='/rhome/js/guide/souvenir_view.js' />" ></script> --%>

<style>
.photo_box iframe {
	width: 100% !important;
	height: 100% !important;
}
</style>

<div class="contents">
	<jsp:include page="/WEB-INF/jsp/user/layout/user_subtop.jsp" />
	<input type="hidden" id="idx" value="${data.idx}">
	<div id="real_contents" class="sub_con">
		<!-- nature_wrap -->
		<div class="nature_wrap">
			<div class="container">
				<!-- travel_view -->
				<div class="travel_view">
					<!-- info_box -->
					<div class="info_box">
						<!--<p class="date"><em>수정일자</em>${data.dt_update_char}</p>-->
						<ul class="btn_list">
							<li>
								<button type="button" class="share" onclick="sns_share();">
									<img src="${imagePath}/sub/share_ico.png" alt="공유하기">
								</button>
								<ul class="share_list">
									<li class="facebook"><a href="#"
										onclick="SnsShare.fbShare(document.location.href); return false;"
										title="새창 열림"><i class="xi-facebook"></i><span
											class="hide">페이스북으로 공유</span></a></li>
									<li class="twitter"><a href="#"
										onclick="SnsShare.twShare(document.title, document.location.href); return false;"
										title="새창 열림"><i class="xi-twitter"></i><span class="hide">트위터로
												공유</span></a></li>
									<li class="kakaostory"><a href="#"
										onclick="SnsShare.storyShare(document.location.href); return false;"
										title="새창 열림"><i class="xi-kakaostory"></i><span
											class="hide">카카오스토리로 공유</span></a></li>
									<!-- 2020-4-28 -->
									<!-- <li class="googleplus"><a href="#" onclick="SnsShare.ggShare(document.location.href); return false;"><i class="xi-google-plus"></i><span class="hide">구글플러스로 공유</span></a></li>
                           <li class="blog"><a href="#" onclick="SnsShare.blogShare(document.title, document.location.href); return false;"><i class="xi-naver-square"></i><span class="hide">네이버블로그로 공유</span></a></li> -->
									<!-- // 2020-4-28 -->
								</ul>
							</li>
							<li><button type="button" class="print"
									onclick="view_print();">
									<img src="${imagePath}/sub/print_ico.png" alt="인쇄하기">
								</button></li>
						</ul>
					</div>
					<!-- // info_box -->

					<!-- tit_box -->
					<div class="tit_box">
						<strong class="tit"> <c:forEach var="city"
								items="${fn:split(data.area_txt, ',')}">
								<span class="city">${city}</span>
							</c:forEach> ${data.title}
						</strong>
						<div class="number">
							<span class="view"><span class="hide">조회수</span>${data.view_cnt}</span>
							<span class="heart"><a id="good"
								href="javascript:void(0);" title="좋아요수">${data.good_count}</a></span>
						</div>
					</div>
					<!-- // tit_box -->

					<!-- photo_box -->
					<div class="photo_box">
						<c:choose>
							<c:when test="${fn:length(visualData) > 0}">
								<div class="photo_slider">
									<!-- loop -->
									<c:forEach var="visual" items="${visualData}">
										<div class="item">
											<div class="img_box">
												<span class="inner_box"> <c:if
														test="${visual.tp_type eq 1}">
														<img
															src="${CONTEXT_PATH}/file/thumbnail2.do?file_physical=${visual.file_physical}"
															alt="">
													</c:if> <c:if test="${visual.tp_type eq 2}">
                                    ${visual.url}
                                    </c:if>
												</span>
											</div>
										</div>
									</c:forEach>
								</div>
								<p class="number">
									<span class="now">1</span>/<span class="total">${fn:length(visualData)}</span>
								</p>
							</c:when>
							<c:otherwise>

							</c:otherwise>
						</c:choose>
					</div>
					<!-- // photo_box -->

					<!-- use_box -->
					<div class="use_box clearfix">
						<c:forEach var="info" items="${infoData}">
							<dl class="use_list">
								<dt>
									<img
										src="${CONTEXT_PATH}/file/thumbnail2.do?file_physical=${info.file_physical}"
										alt="">${info.title}</dt>
								<dd>${info.contents}</dd>
							</dl>
						</c:forEach>
					</div>
					<!-- // use_box -->

					<!-- sub_each -->
					<c:if test="${data.tag ne '' && data.tag ne null}">
						<div class="sub_each">
							<dl class="tag_box">
								<dt>
									<span>태그</span>
								</dt>
								<dd>
									<c:forEach var="tag" items="${fn:split(data.tag, ',')}">
										<span class="tag">${tag}</span>
									</c:forEach>
								</dd>
							</dl>
						</div>
					</c:if>
					<!-- // sub_each -->

					<!-- sub_each -->
					<c:if
						test="${(data.trafficBusTitle ne '' && data.trafficBusTitle ne null) || (data.trafficTrainTitle ne '' && data.trafficTrainTitle ne null)}">
						<div class="sub_each">
							<p class="sub_tit1">인근 교통정보</p>
							<ul class="traffic_list clearfix">
								<c:if
									test="${data.trafficBusTitle ne '' && data.trafficBusTitle ne null}">
									<li><span class="ico"><img
											src="${imagePath}/sub/traffic_bus.png" alt="버스"></span> <span
										class="txt">${data.trafficBusTitle}</span></li>
								</c:if>

								<c:if
									test="${data.trafficTrainTitle ne '' && data.trafficTrainTitle ne null}">
									<li><span class="ico"><img
											src="${imagePath}/sub/traffic_subway.png" alt="기차"></span> <span
										class="txt">${data.trafficTrainTitle}</span></li>
								</c:if>
							</ul>
						</div>
					</c:if>
					<!-- // sub_each -->

					<!-- sub_each -->
					<div class="sub_each">
						<p class="sub_tit1">주변 여행정보</p>
						<!-- map_box -->
						<div class="map_box">

							<div id="map">
								<input type="hidden" id="latitude" value="${data.latitude}">
								<input type="hidden" id="longtitude" value="${data.longtitude}">
							</div>

							<div class="tab_box">
								<ul class="tab">
									<li class="on"><a href="#" title="선택됨">여행지</a></li>
									<li><a href="#" title="33">숙박</a></li>
									<li><a href="#" title="33">맛집</a></li>
								</ul>
								<script type="text/javascript">
								$(function(){
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
								});
	     						</script>
								<!-- tab_con_box -->
								<div class="tab_con_box">
									<!-- tab_con -->
									<div class="tab_con">
										<ul class="spot_list">
											<!-- 여행지(travel), 숙박(accommodation), 맛집(restaurant) -->
											<c:forEach var="travel" items="${distanceData}">
												<c:if test="${travel.cd_catetop eq '03'}">
													<li class="travel"><a href="#">
															<dl>
																<dt>
																	<span class="img"><img
																		src="${CONTEXT_PATH}/file/thumbnail.do?img_physical=${travel.file_physical}"
																		alt="이미지"></span>
																</dt>
																<dd>
																	<p class="tit">${travel.title}</p>
																	<p class="info">
																		<c:forEach var="area"
																			items="${fn:split(travel.area_txt, ',')}">
																			<span class="each">${area}</span>
																		</c:forEach>
																	</p>
																</dd>
															</dl>
													</a></li>
												</c:if>
											</c:forEach>
										</ul>
									</div>
									<!-- // tab_con -->

									<!-- tab_con -->
									<div class="tab_con" style="display: none;">
										<ul class="spot_list">
											<!-- 여행지(travel), 숙박(accommodation), 맛집(restaurant) -->
											<c:forEach var="accommodation" items="${distanceData}">
												<c:if test="${accommodation.cd_catetop eq '04'}">
													<li class="accommodation"><a href="#">
															<dl>
																<dt>
																	<span class="img"><img
																		src="${CONTEXT_PATH}/file/thumbnail.do?img_physical=${accommodation.file_physical}"
																		alt="이미지"></span>
																</dt>
																<dd>
																	<p class="tit">${accommodation.title}</p>
																	<p class="info">
																		<c:forEach var="area"
																			items="${fn:split(accommodation.area_txt, ',')}">
																			<span class="each">${area}</span>
																		</c:forEach>
																	</p>
																</dd>
															</dl>
													</a></li>
												</c:if>
											</c:forEach>
										</ul>
									</div>
									<!-- // tab_con -->

									<!-- tab_con -->
									<div class="tab_con" style="display: none;">
										<ul class="spot_list">
											<!-- 여행지(travel), 숙박(accommodation), 맛집(restaurant) -->
											<c:forEach var="restaurant" items="${distanceData}">
												<c:if test="${restaurant.cd_catetop eq '05'}">
													<li class="restaurant"><a href="#">
															<dl>
																<dt>
																	<span class="img"><img
																		src="${CONTEXT_PATH}/file/thumbnail.do?img_physical=${restaurant.file_physical}"
																		alt="이미지"></span>
																</dt>
																<dd>
																	<p class="tit">${restaurant.title}</p>
																	<p class="info">
																		<c:forEach var="area"
																			items="${fn:split(restaurant.area_txt, ',')}">
																			<span class="each">${area}</span>
																		</c:forEach>
																	</p>
																</dd>
															</dl>
													</a></li>
												</c:if>
											</c:forEach>
										</ul>
									</div>
									<!-- // tab_con -->
								</div>
								<!-- // tab_con_box -->
							</div>
						</div>
						<!-- // map_box -->
					</div>
					<!-- // sub_each -->


					<div class="btn_wrap">
						<a href="${contextPath}/guide/souvenir.do" class="common_btn">목록</a>
					</div>
				</div>
				<!-- // travel_view -->

				<link rel="stylesheet" type="text/css"
					href="${cssPath}/jquery.mCustomScrollbar.min.css">
				<script type="text/javascript"
					src="${jsPath}/jquery.mCustomScrollbar.concat.min.js"></script>
				<!-- 업체 계정으로 appkey 변경 필요합니다. -->
				<script type="text/javascript"
					src="//dapi.kakao.com/v2/maps/sdk.js?appkey=31884d3ffee46c6dc15576438df92959&libraries=services"></script>
				<jsp:include page="/WEB-INF/jsp/user/common/map_common.jsp" />
				<script>
               $(function(){
                  // 포토 슬라이더 생성
                  var photoSlider = $(".photo_slider");
                  photoSlider.slick({
                     slidesToShow: 1,
                     slidesToScroll: 1,
                     arrows: true,
                     dots: true
                  });
   
                  // 초기 슬라이드 번호 가져오기
                  var items = $(".photo_slider .slick-dots li").length;
                  $(".photo_box .number .now").text("1");
                  //$(".photo_box .number .total").text(items);
   
                  // 움직일때 슬라이드 번호 가져오기
                  photoSlider.on('afterChange', function(event, slick, direction){
                     var item = $(event.currentTarget).find(".slick-dots .slick-active").index();
                     $(".photo_box .number .now").text(item+1);
                  });
   
                  // 여행정보 리스트 스크롤바
                  $(".tab_con_box").mCustomScrollbar();
               });
            </script>
			</div>
		</div>
		<!-- // nature_wrap -->
	</div>
</div>
<script>
   $(function(){
      var paramObj = {
         idx : ${data.idx}
      }
      $.ajax( {
         dataType : "json"
         , type : "POST"
         , url : CONTEXT_PATH+"/guide/incrementViewCnt.json"
         , data : paramObj
         , success : function(json) {
            
         },error : function(XMLHttpRequest, textStatus, errorThrown) {
            if (errorThrown == "abort") {
               console.log("responseText: " + XMLHttpRequest.responseText
                     + ", errorThrown: " + errorThrown);
               console.log("textStatus: " + textStatus + ", \n errorThrown: "
                     + errorThrown);
            } else { 
               if(XMLHttpRequest.status == 403){
                  alert("로그인이 되지 않았거나, 권한이 없습니다.");
               }else if(XMLHttpRequest.status == 503){
                  alert("접근 제한된 IP입니다.");
                  window.location.href = CONTEXT_PATH;
               }else{
                  fail(XMLHttpRequest.responseText);
               }
            }
         }
      } );
   });
</script>
<script>
   $(function(){
      $("#good").click(function() {
         $.ajax({
              dataType : "json"
            , type : "POST"
            , url : CONTEXT_PATH + "/common/incrementGoodCnt.json"
            , data : {idx_item : $("#idx").val()}
            , success: function(json) {
               if(json.rcode == '1'){
                  alert("좋아요를 클릭했습니다.");
                  $("#good").text(Number($("#good").text())+1);
               } else if (json.rcode == '10') {
                  alert("이미 좋아요를 클릭한 게시물입니다.");
               }else{
                  alert("에러 발생");
               }
            }
            , error : function(XMLHttpRequest, textStatus, errorThrown) {
               alert("에러 발생");
            }
         });
      });
   });
</script>


<jsp:include page="/WEB-INF/jsp/user/layout/user_footer.jsp" />