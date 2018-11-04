$(function() {

    $("#login_id_login").click(function() {

        var username = $("#login_id_username").val();
        var password = $("#login_id_password").val();

        $.ajax({
            url     : "/login/login.do",
            data    : {"userName" : username, "password" : password},
            type    : "POST",
            success : function(message) {

                bootbox.alert(message.code);
                if(message.code === "0000") {

                    location.href = "/index";
                } else {

                    bootbox.alert(message.message);
                }
            },
            error   : function(message) {

                bootbox.alert("系统异常，请稍后再试");
            }
        });
    });
});