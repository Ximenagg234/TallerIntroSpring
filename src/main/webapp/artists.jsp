<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ximena.discografia.model.Artist" %>

<html>
<head>
    <title>Lista de Artistas</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="container mt-4">

<h2 class="mb-4">Lista de Artistas</h2>

<table class="table table-bordered table-striped">
    <thead class="table-dark">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Nacionalidad</th>
        <th># Canciones</th>
    </tr>
    </thead>
    <tbody>

    <%
        List<Artist> artists =
                (List<Artist>) request.getAttribute("artists");

        if (artists != null) {
            for (Artist artist : artists) {
    %>

    <tr>
        <td><%= artist.getId() %></td>
        <td><%= artist.getName() %></td>
        <td><%= artist.getNationality() %></td>
        <td><%= artist.getTracks().size() %></td>
    </tr>

    <%
            }
        }
    %>

    </tbody>
</table>

</body>
</html>