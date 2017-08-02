/**
 *
 * JavaScript中的十大难点
 */

//1.匿名函数，立即执行函数
(function () {
//逻辑
})();

//2.闭包
//对于闭包(closure)，当外部函数返回之后，内部函数依然可以访问外部函数的变量。

function f1() {
    var N =0;
    function f2() {
        N += 1;
        console.log(N);
    }

    return f2();
}

var result = f1();
result();
result();
result();


//3.使用闭包定义私有变量