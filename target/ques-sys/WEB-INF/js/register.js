checked();
function checked() {
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    var rePassword = document.getElementById("repass");
    var phone = document.getElementById("phone");
    var email = document.getElementById("email");
    var judge = document.getElementsByName("judge");
    var error=document.getElementsByClassName("error");
    $.ajax({
        url : "ques/list",
        type : "post",
        dataType : "json",
        data : {
            "uid" : $("#uid").val(),
        },
        success : function(data) {
            var name=data;
        },
        error : function() {
            alert("请求失败");
        }
    });
    username.onfocus = function () {
        judge[0].style.visibility = "hidden";
        var stat = null;
    };
    username.onblur = function () {

        if(username.value.length>=3&&username.value.length<=20&&username.value!=uid&&username.value.match(/^\S+$/)){
            stat=true;
            error[0].style.visibility="hidden";
        }else{
            stat=false;
            error[0].style.visibility="visible";
        }
        judge[0].style.visibility = "visible";
        judge[0].src = "../images/"+stat+".png";
    };
    password.onfocus = function () {
        judge[1].style.visibility = "hidden";
        var stat = null;
    };
    password.onblur = function () {
        if(password.value.length>=6&&password.value.length<=20&&password.value.match(/^\S+$/)){
            stat=true;
            error[1].style.visibility="hidden";
        }else{
            stat=false;
            error[1].style.visibility="visible";
        }
        judge[1].style.visibility = "visible";
        judge[1].src = "../images/"+stat+".png";
    };
    rePassword.onfocus = function () {
        judge[2].style.visibility = "hidden";
        var stat = null;
    };
    rePassword.onblur = function () {
        if(rePassword.value.length>=6&&rePassword.value.length<=20&&rePassword.value.match(/^\S+$/)&&rePassword.value==password.value){
            stat=true;
            error[2].style.visibility="hidden";
        }else{
            stat=false;
            error[2].style.visibility="visible";
        }
        judge[2].style.visibility = "visible";
        judge[2].src = "../images/"+stat+".png";
    };
    phone.onfocus = function () {
        judge[3].style.visibility = "hidden";
        var stat = null;
    };
    phone.onblur = function () {
        if(phone.value.length==11){
            stat=true;
            error[3].style.visibility="hidden";
        }else{
            stat=false;
            error[3].style.visibility="visible";
        }
        judge[3].style.visibility = "visible";
        judge[3].src = "../images/"+stat+".png";
    };
    email.onfocus = function () {
        judge[4].style.visibility = "hidden";
        var stat = null;
    };
    email.onblur = function () {
        if(email.value.match(/\w+@\w+\.\w/)){
            stat=true;
            error[4].style.visibility="hidden";
        }else{
            stat=false;
            error[4].style.visibility="visible";
        }
        judge[4].style.visibility = "visible";
        judge[4].src = "../images/"+stat+".png";
    };

    var refer=document.getElementById("refer");
    refer.onclick=function () {
        var sum=0;
        for (var i=0;i<error.length;i++){
            if(error[i].style.visibility=="hidden"){
                sum+=1;
            }
        }
        if(sum==5){
            $.ajax({
                url : "",
                type : "post",
                dataType : "",
                data : {
                },
                success : function(data) {
                },
                error : function() {
                    alert("注册失败");
                }
            });
        }
    }

}