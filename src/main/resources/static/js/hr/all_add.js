var add_pageNum = 1, pageSize = 10, add_pages = 0;

$(document).ready(function () {
    init();
});

/**
 * 初始化函数
 */
function init() {
    addPoint();
}

function addPoint() {
    $.ajax({
        url: "/hr/add_list",     //后台请求的数据
        data: {
            "pageSize": pageSize,
            "pageNum": add_pageNum,
            "userId": $("#userId").val(),
            "addDesc": $("#addDesc").val(),
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
                    + "<td>" + content.userId + "</td>"
                    + "<td>" + content.userName + "</td>"
                    + "<td>" + content.departmentId + "</td>"
                    + "<td>" + content.kpiSum + "</td>"
                    + "<td>" + content.addDesc + "</td>"
                    + "<td>" + content.addPoint + "</td>"
                    + "<td>" + content.addTime + "</td>"
                    + "<td><a class='user-msg' href='/hr/del_add?userId="+content.userId+"&addId="+content.addId+"&userName="+content.userName+"'>编辑</a></td>"
                    + "</tr>";
                $("#table_add tbody").append(trHTML);//在table最后面添加一行
            }
        },
    });
}

/**
 * 翻页
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
$("#search_reward").click(function () {
    addPoint();
});

