<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/xml; charset=UTF-8" %>
<%-- This is JSP page return a XML --%>
<%! int count=0; %>
<% count++; %>
<response>
    <count><%=count%></count>
    <message>This is test xml.</message>
</response>

