var messageData;

var wait = 120;//120秒后可以重新点击灰色按钮

/**
 * 获取验证码
 * @param that
 */
function getMsgNum(that) {

    var phoneNumber = $('#phone').val();
    var httpurl = 'localhost:8082';
    console.log(phoneNumber);
    setButtonStatus(that); // 设置按钮倒计时
    var obj = {
        phoneNumber:phoneNumber
    };
    $.ajax({
        url:httpurl+'/sendMsg',  //后台短信接口
        type:'POST',
        dataType:'json',
        contentType: "application/json",
        async: false, //false 同步
        data: JSON.stringify(obj),//格式化数据
        xhrFields: {
            withCredentials: true
        },
        success: function (result) {
            if(result.code === 200) {
                messageData = result.data;
            }else {
                alert("错误码:" + data.code + "  错误信息:" + data.message);
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest.status);
            console.log(XMLHttpRequest.readyState);
            console.log(textStatus);
        }
    });

}

function setButtonStatus(that) {
    if (wait === 0) {
        that.removeAttribute("disabled");
        that.value="免费获取验证码";
        wait = 60;
    } else {
        that.setAttribute("disabled", true);
        that.value=wait+"秒后可以重新发送";
        wait--;
        setTimeout(function() {
            setButtonStatus(that)
        }, 1000)
    }
}

/**
 * 注册按钮
 */
function validateNum() {

    var data = {
        msgNum: inputMsgNum,
        tamp: messageData.tamp,
        hash: messageData.hash
    };

    $.ajax({
        url: httpurl + '/validateNum', // 验证接口
        type: 'POST',
        dataType: 'json',
        contentType: "application/json",
        data: JSON.stringify(data),
        async: false, //false 同步
        success: function (data) {
            //业务处理
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest.status);
            console.log(XMLHttpRequest.readyState);
            console.log(textStatus);
        }
    });
}