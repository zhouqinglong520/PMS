function excelData(){
    var monitordocpath=$("#monitordocpath").text();
    if(monitordocpath!=null && monitordocpath!=""){
        var form = new FormData(document.getElementById("monitordocform"));
        $.ajax({
            url:  "monitor/excelData",
            type: 'POST',
            data: form,
            processData: false,
            contentType : false,
            success:function(data){
                alert(data);
                if(data=="true" || data==true){
                    $("#monitorspotgrid").mtable("reload");
                    closeMonitorUploadWin();
                    $.mal({
                        text : '导入成功',
                        type : 'success'
                    });
                }else{
                    $.mal({
                        text : '导入失败',
                        type : 'error'
                    });
                }
            },
            error:function(e){

            }
        })


    }else{
        $.mal({
            text : '请先选择文件',
            type : 'warning'
        });
    }
}