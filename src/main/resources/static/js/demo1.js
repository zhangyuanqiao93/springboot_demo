var home ="/springEcharts001";

require.config({
    paths:
        {
            echarts:'res/js'
        }
});

var option = {"calculable":true,

    "legend":{"data":["预算分配","实际开销","我的开销"],"orient":"vertical","x":"right","y":"bottom"},

    "polar":[{"indicator":[{"max":6000,"text":"销售（sales）"},{"max":16000,"text":"管理（Administration）"},
        {"max":30000,"text":"信息技术（Information Techology）"},{"max":38000,"text":"客服（Customer Support）"},
        {"max":52000,"text":"研发（Development）"},{"max":25000,"text":"市场（Marketing）"}]}],

    "series":[{"data":[{"name":"预算分配","value":[4300,10000,28000,35000,50000,19000]},
        {"name":"实际开销","value":[5000,14000,28000,31000,42000,21000]},
        {"name":"我的开销","value":[1000,4000,8000,8000,20000,10000]}],
        "name":"预算 vs 开销（Budget vs spending）","type":"radar"}],

    "title":{"subtext":"纯属虚构","text":"预算 vs 开销 vs 我的开销（Budget vs spending）"},

    "toolbox":{"feature":{"mark":{"lineStyle":{"color":"#1e90ff","type":"dashed","width":2},"show":true,
        "title":{"mark":"辅助线开关","markClear":"清空辅助线","markUndo":"删除辅助线"}},
        "dataView":{"lang":["数据视图","关闭","刷新"],"readOnly":false,"show":true,"title":"数据视图"},
        "restore":{"show":true,"title":"还原"},"saveAsImage":{"lang":["点击保存"],"show":true,"title":"保存为图片","type":"png"}},"show":true},

    "tooltip":{"trigger":"axis"}};
require(
    [
        'echarts',
        'echarts/chart/radar',
        'echarts/chart/line'
    ],
    function(ec)
    {
        var myChart =ec.init(document.getElementById("myRadio"));

        myChart.setOption(option);
    }
);