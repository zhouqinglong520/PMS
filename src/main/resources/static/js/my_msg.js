$(document).ready(function () {
    var userId=$("#userId").val();
    var userName=$("#userName").val();

    $("#change_msg").attr("href","/employee/change_msg?userId="+userId+"&userName="+userName);
    $("#myKp").attr("href","/employee/myKp?userId="+userId);

});
