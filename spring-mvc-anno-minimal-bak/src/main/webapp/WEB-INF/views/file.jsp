<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring mvc file Upload</title>
</head>
<body>
<h1>上传附件</h1>
<form method="post" action="/file/upload" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit">
</form>

</body>
</html>
