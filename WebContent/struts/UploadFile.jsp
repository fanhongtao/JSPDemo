<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Demo</title>
</head>
<body>
    <s:actionerror />
    <s:form action="upload" method="post" enctype="multipart/form-data">
         <s:file name="uploaded" label="File"/>
        <s:submit value="Upload" align="center" />
    </s:form>
</body>
</html>