<%--
  Created by IntelliJ IDEA.
  User: zxsmac
  Date: 2020/5/27
  Time: 11:55 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

    </div>
</div>
<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--    隐藏作用域--%>
<%--    前段传递隐藏域--%>
        <input type="hidden" name="bookID" value="${Books.bookID}">
    <div class="form-group">
        书籍名称：<input type="text" name="bookName" class="form-control" value="${Books.bookName}" required><br><br><br>
    </div>
    <div class="form-group">
        书籍数量：<input type="text" name="bookCounts" class="form-control" value="${Books.bookCounts}" required><br><br><br>
    </div>
    <div class="form-group">
        书籍详情：<input type="text" name="detail" class="form-control" value="${Books.detail}" required><br><br><br>
    </div>
    <div class="form-group">
        <input type="submit" value="修改" class="form-control">
    </div>
</form>

</body>
</html>
