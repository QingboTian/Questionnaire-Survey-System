(function (){
    $.ajax({
    // 此处响应问卷数据
    url : "ques/list",
    type : "post",
    dataType : "json",
    data : {
        "uid" : $("#uid").val(),
        "currentPage" : $("#currentPage").val()
    },
    success : function(data) {
        showData(data);
    },
    error : function() {
        alert("请求失败");
    }
});
}());
function showData(data) {
    var tbody = document.createElement("tbody");
    var table=document.querySelector(".list");
    tbody.innerHTML="";
    for (var i = 0; i < data.pageSize; i++) {
        var state = "暂停服务";
        if (data.recordList[i].qState == true) {
            state = "服务中..."
        }
        var sharelink = data.recordList[i].qId;
        tbody.innerHTML+= "<tr><td>" + data.recordList[i].qName +
            "</td><td><font color='green'>" + state +
            "</font></td><td>" + data.recordList[i].qCreatedate +
            "</td><td>" + data.recordList[i].qCount +
            "</td><td>" + data.recordList[i].qRemark +
            "</td><td>" + "<a onclick='sharefun(" + sharelink + ")'>分享</a> " +
            "| <a onclick='tongjifun()'>统计</a> " +
            "| <a onclick='morefun()'>更多</a>" +
            "</td></tr>";
        table.appendChild(tbody);
    }
}