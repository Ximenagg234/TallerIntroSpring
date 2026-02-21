<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Eliminar Artista</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-5">

<h2>Eliminar Artista por ID</h2>

<form action="deleteArtist" method="post">

    <div class="mb-3">
        <label class="form-label">ID del artista</label>
        <input type="number"
               name="id"
               class="form-control"
               required>
    </div>

    <button type="submit" class="btn btn-danger"> Eliminar Artista </button>

</form>

</body>
</html>