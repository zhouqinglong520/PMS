var add_pageNum = 1, pageSize = 1000, add_pages = 0;

$(document).ready(function () {
    init();
});

/**
 * 初始化函数
 */
function init() {
    addPoint();
}

//****************************************************************************************************

/**
 * 部门信息
 */
function addPoint() {

    var data = {
        "pageSize": pageSize,
        "pageNum": add_pageNum,
        "departmentName": $("#departmentName").val(),
        "departmentId": $("#departmentId").val(),
    };

    $.ajax({
        url: "/employee/getDepartmentList",     //后台请求的数据
        data: data,
        type: "post",                  //请求方式
        async: true,                   //是否异步请求
        success: function (data) {      //如果请求成功，返回数据。
            $("#table_add tbody").html("");
            add_pages = data.pages;
            var list_ = data.list;
            for (var i = 1; i < list_.length + 1; i++) {
                var content = list_[i - 1];
                var trHTML = "<tr>"
                    + "<td>" + content.departmentId + "</td>"
                    + "<td>" + content.departmentName + "</td>"
                    + "<td>" + content.departmentKpi + "</td>"
                    + "<td><a class='user-msg' href='/admin/all_kpi"+((content.qdId-1)*2+4)+"?departmentId="+content.departmentId+"'>进入考核<a/></td>"
                    + "<td><a class='user-msg' href='/admin/all_kpi"+((content.qdId-1)*2+5)+"?departmentId="+content.departmentId+"'>进入考核<a/></td>"
                    + "</tr>";
                $("#table_add tbody").append(trHTML);//在table最后面添加一行
            }
        },
    });
}

/**
 * 部门信息表翻页
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

$("#search").click(function () {
    addPoint();
});
