<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<html>
<head>
    <title>����ͷ��</title>
    <meta http-equiv="Content-Type" content="text/html; charset=GB2312">
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="GB2312" src="js/test.js"></script>
    <title>ʵ�����</title>
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
        <input name="" type="text" id="wbk" placeholder="����������ؼ���"/>
    </div>
    <div class="an">
        <button name="����" class="button" type="button">����</button>
    </div>
    <!--������ť-->
</div>
<hr>
<div id="toutiao">
</div>

</body>

</html>