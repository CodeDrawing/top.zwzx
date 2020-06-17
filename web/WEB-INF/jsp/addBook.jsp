<%--
  Created by IntelliJ IDEA.
  User: zxsmac
  Date: 2020/5/27
  Time: 9:59 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>

    </div>
</div>
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    <div class="form-group">
    书籍名称：<input type="text" name="bookName" class="form-control" required><br><br><br>
    </div>
    <div class="form-group">
    书籍数量：<input type="text" name="bookCounts" class="form-control" required><br><br><br>
    </div>
    <div class="form-group">
    书籍详情：<input type="text" name="detail" class="form-control" required><br><br><br>
    </div>
    <div class="form-group">
    <input type="submit" value="添加" class="form-control">
    </div>
</form>

</body>
</html>
