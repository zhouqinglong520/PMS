var add_pageNum = 1, pageSize = 5, add_pages = 0;
var del_pageNum = 1, del_pages = 0;
var jl_pageNum = 1, jl_pages = 0;
var cf_pageNum = 1, cf_pages = 0;
var userId = $("#userId").val();

$(document).ready(function () {
    init();
});

/**
 * 初始化函数
 */
function init() {
    addPoint();
    delPoint();
    jlXx();
    //cfXx();
}

//****************************************************************************************************

/**
 * 加分信息
 */
function addPoint() {
    $.ajax({
        url: "/employee/getAddPoint",     //后台请求的数据
        data: {
            "pageSize": pageSize,
            "pageNum": add_pageNum,
            "addDesc":$("#addDesc").val(),
            "userId":userId
        },
        type: "post",                  //请求方式
        async: true,                   //是否异步请求
        success: function (data) {      //如果请求成功，返回数据。
            $("#table_add tbody").html("");
            add_pages = data.pages;
            var list_ = data.list;
            for (var i = 1; i < list_.length + 1; i++) {
                var content = list_[i - 1];
                var trHTML = "<tr>"
                    + "<td>" + content.addDesc + "</td>"
                    + "<td>" + content.addPoint + "</td>"
                    + "<td>" + content.addTime + "</td></tr>";
                $("#table_add tbody").append(trHTML);//在table最后面添加一行
            }
        },
    });
}

/**
 * 加分信息表翻页
 */
$(".add").click(function () {
    var data = $(this).html();
    switch (data) {
        case "首页":
            if (add_pageNum == 1) {
                break;
            }
            add_pageNum = 1;
            addPoint();
            break;
        case "上一页":
            if (add_pageNum == 1) {
                break;
            }
            add_pageNum--;
            addPoint();
            break;
        case "下一页":
            if (add_pageNum == add_pages) {
                break;
            }
            add_pageNum++;
            addPoint();
            break;
        case "尾页":
            if (add_pageNum == add_pages) {
                break;
            }
            add_pageNum = add_pages;
            addPoint();
            break;
    }
});

//****************************************************************************************************

/**
 * 加分信息
 */
function delPoint() {
    $.ajax({
        url: "/employee/getDeletePoint",     //后台请求的数据
        data: {
            "pageSize": pageSize,
            "pageNum": del_pageNum,"deleteDesc":$("#deleteDesc").val(),
            "userId":userId,
        },
        type: "post",                  //请求方式
        async: true,                   //是否异步请求
        success: function (data) {      //如果请求成功，返回数据。
            $("#table_del tbody").html("");
            del_pages = data.pages;
            var list_ = data.list;

            for (var i = 1; i < list_.length + 1; i++) {
                var content = list_[i - 1];
                var trHTML = "<tr>"
                    + "<td>" + content.deleteDesc + "</td>"
                    + "<td>" + content.deletePoint + "</td>"
                    + "<td>" + content.deleteTime + "</td></tr>";
                $("#table_del tbody").append(trHTML);//在table最后面添加一行
            }
        },
    });
}

/**
 * 加分信息表翻页
 */
$(".del").click(function () {
    var data = $(this).html();
    switch (data) {
        case "首页":
            if (del_pageNum == 1) {
                break;
            }
            del_pageNum = 1;
            delPoint();
            break;
        case "上一页":
            if (del_pageNum == 1) {
                break;
            }
            del_pageNum--;
            delPoint();
            break;
        case "下一页":
            if (del_pageNum == del_pages) {
                break;
            }
            del_pageNum++;
            delPoint();
            break;
        case "尾页":
            if (del_pageNum == del_pages) {
                break;
            }
            del_pageNum = del_pages;
            delPoint();
            break;
    }
});

//****************************************************************************************************

/**
 * 奖励信息
 */
function jlXx() {
    $.ajax({
        url: "/employee/getRewardList",     //后台请求的数据
        data: {
            "pageSize": pageSize,
            "pageNum": jl_pageNum,"userId":userId,"rewardReason":$("#rewardReason").val(),
        },
        type: "post",                  //请求方式
        async: true,                   //是否异步请求
        success: function (data) {      //如果请求成功，返回数据。
            $("#table_jl tbody").html("");
            jl_pages = data.pages;
            var list_ = data.list;
            for (var i = 1; i < list_.length + 1; i++) {
                var content = list_[i - 1];
                var trHTML = "<tr>"
                    + "<td>" + content.rewardReason + "</td>"
                    + "<td>" + content.rewardDesc + "</td>"
                    + "<td>" + content.rewardTime + "</td>";
                $("#table_jl tbody").append(trHTML);//在table最后面添加一行
            }
        },
    });
}

/**
 * 奖励信息表翻页
 */
$(".jl").click(function () {
    var data = $(this).html();
    switch (data) {
        case "首页":
            if (jl_pageNum == 1) {
                break;
            }
            jl_pageNum = 1;
            jlXx();
            break;
        case "上一页":
            if (jl_pageNum == 1) {
                break;
            }
            jl_pageNum--;
            jlXx();
            break;
        case "下一页":
            if (jl_pageNum == jl_pages) {
                break;
            }
            jl_pageNum++;
            jlXx();
            break;
        case "尾页":
            if (jl_pageNum == jl_pages) {
                break;
            }
            jl_pageNum = jl_pages;
            jlXx();
            break;
    }
});

//****************************************************************************************************

/**
 * 惩罚信息
 */
function cfXx() {
    $.ajax({
        url: "/employee/getPunishList",     //后台请求的数据
        data: {
            "pageSize": pageSize,
            "pageNum": cf_pageNum,"userId":userId,"punishReason":$("#punishReason").val(),
        },
        type: "post",                  //请求方式
        async: true,                   //是否异步请求
        success: function (data) {      //如果请求成功，返回数据。
            $("#table_cf tbody").html("");
            cf_pages = data.pages;
            var list_ = data.list;
            for (var i = 1; i < list_.length + 1; i++) {
                var content = list_[i - 1];
                var trHTML = "<tr>"
                    + "<td>" + content.punishReason + "</td>"
                    + "<td>" + content.punishDesc + "</td>"
                    + "<td>" + isOne(content.punishComplete) + "</td>"
                    + "<td>" + content.punishTime + "</td>";
                $("#table_cf tbody").append(trHTML);//在table最后面添加一行
            }
        },
    });
}

/**
 * 惩罚信息表翻页
 */
$(".jl").click(function () {
    var data = $(this).html();
    switch (data) {
        case "首页":
            if (cf_pageNum == 1) {
                break;
            }
            cf_pageNum = 1;
            cfXx();
            break;
        case "上一页":
            if (cf_pageNum == 1) {
                break;
            }
            cf_pageNum--;
            cfXx();
            break;
        case "下一页":
            if (cf_pageNum == cf_pages) {
                break;
            }
            cf_pageNum++;
            cfXx();
            break;
        case "尾页":
            if (cf_pageNum == cf_pages) {
                break;
            }
            cf_pageNum = cf_pages;
            cfXx();
            break;
    }
});

//****************************************************************************************************

function isOne(data) {
    if (data == 1 || data == "1") {
        return "已完成";
    } else {
        return "未完成";
    }
}

$("#search_add").click(function () {
    addPoint();
});

$("#search_del").click(function () {
    delPoint();
});

$("#search_reward").click(function () {
    jlXx();
});

$("#search_punish").click(function () {
    cfXx();
});
