<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<html>
<head>
    <title>今日头条</title>
    <meta http-equiv="Content-Type" content="text/html; charset=GB2312">
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="GB2312" src="js/test.js"></script>
    <title>实验设计</title>
</head>
<script>
    $(document).ready(function () {
        $.test();
        $.serach();
    });
</script>
<style>
    .item {
        height: 150px;
        width: 600px;
        float: left;
        border: solid 1px rgb(8, 8, 8);
    }

    .item_title {
        width: 300px;
    }

    .item div {
        float: left;
    }

    .an input {
        width: 300px;
        height: 100px;
        float: left
    }

    body {
        margin: 0 auto;
        text-align: center;
    }
</style>

<body>
<div class="ss">
    <div class="kuan">
        <input name="" type="text" id="wbk" placeholder="请输入检索关键字"/>
    </div>
    <div class="an">
        <button name="搜索" class="button" type="button">搜索</button>
    </div>
    <!--搜索按钮-->
</div>
<hr>
<div id="toutiao">
</div>

</body>

</html>