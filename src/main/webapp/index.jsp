<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome to the Servlet World</title>

    <!-- including external css -->
    <link rel="stylesheet" href=" <%= application.getContextPath() %>/css/style.css " />

</head>
<body>

    <div class="container">
        <%@include file="menu.jsp" %>
        <h1>Welcome to the Jungle</h1>
        <p>This will be intresting </p>
        <form action="<%= application.getContextPath() %>/third" method="post">
        <input name="message" type="text" placeholder="enter your text"/>
        <button type="submit">Submit</button>
        </form>
    </div>
<script src="<%= application.getContextPath() %>/js/script.js "></script>

</body>
</html>