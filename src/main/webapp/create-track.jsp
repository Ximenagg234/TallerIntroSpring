<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ximena.discografia.model.Artist" %>

<html>
<head>
  <title>Crear Track</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet">
</head>

<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-5">

<h2>Crear Nueva Canción</h2>

<form action="createTrack" method="post">

  <div class="mb-3">
    <label class="form-label">Título</label>
    <input type="text" name="title"
           class="form-control" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Género</label>
    <input type="text" name="genre"
           class="form-control" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Duración (min)</label>
    <input type="number" step="0.1"
           name="duration"
           class="form-control" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Álbum</label>
    <input type="text" name="album"
           class="form-control" required>
  </div>

  <div class="mb-3">
    <label class="form-label">Artistas</label>
    <br>

    <%
      List<Artist> artists =
              (List<Artist>) request.getAttribute("artists");

      for (Artist artist : artists) {
    %>

    <div class="form-check">
      <input class="form-check-input"
             type="checkbox"
             name="artistIds"
             value="<%= artist.getId() %>">

      <label class="form-check-label">
        <%= artist.getName() %>
      </label>
    </div>

    <%
      }
    %>
  </div>

  <button type="submit"
          class="btn btn-success">
    Crear Track
  </button>

</form>

</body>
</html>