<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Crear Artista</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-5">

<h2>Crear Nuevo Artista</h2>

<form action="createArtist" method="post">

    <div class="mb-3">
        <label class="form-label">Nombre</label>
        <input type="text" name="name"
               class="form-control" required>
    </div>

    <div class="mb-3">
        <label class="form-label">Nacionalidad</label>
        <input type="text" name="nationality"
               class="form-control" required>
    </div>

    <button type="submit"
            class="btn btn-success">
        Crear Artista
    </button>

</form>

</body>
</html>