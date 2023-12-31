<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="icon" href="https://getbootstrap.com/favicon.ico">
  <title>Book management demo</title>
  <link rel="stylesheet" type="text/css" href='${pageContext.request.getContextPath()}/webjars/bootstrap/5.1.3/css/bootstrap.min.css' />
  <script type="text/javascript" src="${pageContext.request.getContextPath()}/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>

</head>
<body>
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <a class="navbar-brand" href="/">Spring Web MVC demo</a>
         <a href="/newBook" style="text-decoration: none;">Add book</a>
          <a href="/register" style="text-decoration: none; margin-left:15px;">User</a>
           <a href="/session-test" style="text-decoration: none; margin-left:15px;">Show session</a>
            <a href="/remove-session" style="text-decoration: none; margin-left:15px;">Remove session</a>
      </div>


    </div>
  </nav>
</body>
</html>