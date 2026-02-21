<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ximena.discografia.model.Track" %>
<%@ page import="com.ximena.discografia.model.Artist" %>

<html>
<head>
    <title>Lista de Canciones</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-4">

<h2 class="mb-4">Lista de Canciones</h2>

<table class="table table-bordered table-striped">
    <thead class="table-dark">
    <tr>
        <th>ID</th>
        <th>Título</th>
        <th>Género</th>
        <th>Duración</th>
        <th>Álbum</th>
        <th>Artistas</th>
        <th>Acciones</th>
    </tr>
    </thead>
    <tbody>

    <%
        List<Track> tracks =
                (List<Track>) request.getAttribute("tracks");

        for (Track track : tracks) {
    %>

    <tr>
        <td><%= track.getId() %></td>
        <td><%= track.getTitle() %></td>
        <td><%= track.getGenre() %></td>
        <td><%= track.getDuration() %> min</td>
        <td><%= track.getAlbumTitle() %></td>
        <td>
            <%
                for (Artist artist : track.getArtists()) {
            %>
            <span class="badge bg-primary">
                <%= artist.getName() %>
            </span>
            <%
                }
            %>
        </td>
        <td>
            <form action="deleteTrack" method="post" style="display:inline;">
                <input type="hidden" name="id" value="<%= track.getId() %>">
                <button type="submit" class="btn btn-danger btn-sm"> Eliminar </button>
            </form>
        </td>
    </tr>

    <%
        }
    %>

    </tbody>
</table>

</body>
</html>