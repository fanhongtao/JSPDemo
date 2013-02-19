<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload success</title>
</head>
<body>
    File Name : <s:property value="uploadedFileName"/><br>
    Content Type : ${uploadedContentType}<br>
    <a href="../upload/<%= request.getAttribute("uploadedFileName") %>">Click here to download it</a>
</body>
</html>