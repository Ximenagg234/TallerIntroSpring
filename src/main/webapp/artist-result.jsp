<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.ximena.discografia.model.Artist" %>
<%@ page import="com.ximena.discografia.model.Track" %>

<html>
<head>
    <title>Resultado</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-5">


<%
    Artist artist = (Artist) request.getAttribute("artist");
%>

<% if (artist != null) { %>

<h2><%= artist.getName() %></h2>
<p><strong>Nacionalidad:</strong> <%= artist.getNationality() %></p>

<h4 class="mt-4">Canciones:</h4>

<ul class="list-group">
    <% for (Track track : artist.getTracks()) { %>
    <li class="list-group-item">
        <%= track.getTitle() %>
    </li>
    <% } %>
</ul>

<% } else { %>

<div class="alert alert-danger">
    Artista no encontrado.
</div>

<% } %>

</body>
</html>