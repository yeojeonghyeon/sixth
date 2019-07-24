$(document).ready(function(){
	$.validator.addMethod("idPattern", function(value, element){
		return this.optional(element) || value.match(/[0-9a-zA-Z.;\-]/);
		});
	
	$.validator.addMethod("namePattern", function(value, element){
		return this.optional(element) || value.match(/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/);
		});
	
	$.validator.addMethod("phonePattern", function(value, element){
		return this.optional(element) || value.match(/^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})[0-9]{3,4}[0-9]{4}$/);
		});
	
	$('#signForm').validate({
		rules:{
			memberId:{required:true, minlength:5, idPattern:true},
			memberPw:{required:true, minlength:6},
			checkPw:{required:true, equalTo:'#memberPw'},
			memberName:{required:true, minlength:2, namePattern:true},
			memberNickName:{required:true, minlength:2},
			memberCel:{required:true, phonePattern:true},
			memberEmail:{required:true, email:true}
		},
		messages:{
			memberId:{
				required:"아이디를 입력하세요.",
				minlength:jQuery.format("아이디는 {0}자 이상 입력해주세요."),
				idPattern:"영어와 특수문자로입력하세요."
			},
			memberPw:{
				required:"비밀번호를 입력하세요.",
				minlength:jQuery.format("비밀번호는 {0}자 이상 입력해주세요.")
			},
			checkPw:{
				required:"비밀번호 확인을 입력하세요. ",
				equalTo:"비밀번호와 일치하지 않습니다."
			},
			memberName:{
				required:"이름을 입력하세요.",
				minlength:jQuery.format("이름은 {0}자 이상 입력해주세요."),
				namePattern:"한글로 입력하세요."
			},
			memberNickName:{
				required:"닉네임을 입력하세요.",
				minlength:jQuery.format("닉네임은 {0}자 이상 입력해주세요.")
			},
			memberCel:{
				required:"연락처를 입력하세요.",
				phonePattern:"올바른 연락처를 입력하세요."
			},
			memberEmail:{
				required:"이메일을 입력하세요.",
				email:"올바른 이메일형식을 입력하세요."
			}
		}
	});
});