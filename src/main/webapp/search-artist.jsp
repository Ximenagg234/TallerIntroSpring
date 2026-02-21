<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Buscar Artista</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body>
<%@ include file="navbar.jsp" %>
<div class="container mt-5">

<h2>Buscar Artista</h2>

<form action="searchArtist" method="post">
    <div class="mb-3">
        <label class="form-label">Nombre del artista</label>
        <input type="text" name="name"
               class="form-control" required>
    </div>

    <button type="submit"
            class="btn btn-primary">
        Buscar
    </button>
</form>

</body>
</html>