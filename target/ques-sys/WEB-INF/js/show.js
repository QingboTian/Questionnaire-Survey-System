function showForm(data) {
    var content=document.getElementById("content");
    var headline=document.getElementsByTagName("h2");
    headline[0].innerHTML=data.quesname;
    for (var i=0;i<data.answerList.length;i++){
        showList(data.answerList[i],i,content,data.answerList[i].name);
    }
}
function showList(set,num,parent,named) {
    var div=document.createElement("div");
    var title=document.createElement("div");
    var number=document.createElement("span");
    var topic=document.createElement("span");
    var prompt=document.createElement("span");
    var project=document.createElement("div");
    number.innerHTML=num+1;
    topic.innerHTML=named;
    for (var i=0;i<set.answerList.length;i++){
        var answerList=document.createElement("div");
        var option=document.createElement("input");
        option.type="radio";
        option.name=set.answerList[i].cId;
        var lab=document.createElement("label");
        lab.innerHTML=set.answerList[i].caAnswer;
        answerList.appendChild(option);
        answerList.appendChild(lab);
        project.appendChild(answerList);
    }
    div.className="list";
    title.className="question";
    prompt.className="cue";
    title.appendChild(number);
    title.appendChild(topic);
    title.appendChild(prompt);
    div.appendChild(title);
    div.appendChild(project);
    parent.appendChild(div);

}
function submitForm() {
    var list=document.getElementsByClassName("list");
    var error=document.getElementById("error");
    error.innerHTML="请确保所有内容填写正确";
    for (var i=0;i<list.length;i++){
         var flag=0;
         var answer=list[i].getElementsByTagName("input");
         var prompt=list[i].getElementsByClassName("cue")[0];
         for (var j=0;j<answer.length;j++){
             if(answer[j].checked==true){
                 flag=1;
             }
         }
         if (flag==0){
            prompt.innerHTML="请选择一个选项";
            error.style.display="inline";
         }else{
             prompt.innerHTML="";
             error.style.display="none";
         }
     }
    if(error.style.display=="none"){
            $.ajax({
                url:"",
                type:"post",
                dataType:"",
                data:{},
                success:function () {

                },
                error:function () {

                }
            });
    }
}