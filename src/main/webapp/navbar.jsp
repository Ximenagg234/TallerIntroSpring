<%@ page contentType="text/html;charset=UTF-8" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">

        <a class="navbar-brand" href="index.jsp">
            Discografía
        </a>

        <button class="navbar-toggler"
                type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse"
             id="navbarNav">

            <ul class="navbar-nav">

                <!-- ARTISTAS -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle"
                       href="#"
                       role="button"
                       data-bs-toggle="dropdown">
                        Artistas
                    </a>

                    <ul class="dropdown-menu">
                        <li>
                            <a class="dropdown-item"
                               href="artists">
                                Listar Artistas
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="create-artist.jsp">
                                Crear Artista
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="search-artist.jsp">
                                Buscar Artista
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="delete-artist.jsp">
                                Eliminar Artista
                            </a>
                        </li>
                    </ul>
                </li>

                <!-- TRACKS -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle"
                       href="#"
                       role="button"
                       data-bs-toggle="dropdown">
                        Canciones
                    </a>

                    <ul class="dropdown-menu">
                        <li>
                            <a class="dropdown-item"
                               href="tracks">
                                Listar Canciones
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="createTrack">
                                Crear Canción
                            </a>
                        </li>
                        <li>
                            <a class="dropdown-item"
                               href="delete-track.jsp">
                                Eliminar Canción
                            </a>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>
</nav>