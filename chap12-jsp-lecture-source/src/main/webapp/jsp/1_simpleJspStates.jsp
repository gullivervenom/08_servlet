<!-- 페이지ㅣ 지시자 태그(추가적으로 -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>JSP 기본 문법</h1>
  <!-- HTML 주석입니다. -->
  <%-- JSP 주석입니다.--%>

    <!-- 선언 태그 -->
    <%!
        private String name;
        private int age;
    %>

    <!-- 스크립트릿 태그 -->
    <%
        name = "박재민";
        age = 20;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    %>
    <h3>이름 : <%= name %></h3>
    <h3>나이 : <%= age %></h3>
</body>
</html>
