package com.ximena.discografia.servlet;

import com.ximena.discografia.model.Artist;
import com.ximena.discografia.service.ArtistService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;

@WebServlet("/createArtist")
public class ArtistCreateServlet extends HttpServlet {

    private ArtistService artistService;

    @Override
    public void init() {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        artistService = context.getBean(ArtistService.class);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String nationality = request.getParameter("nationality");

        // Generara un ID automático sencillo para el artista (auto-incrementa)
        int newId = artistService.getAllArtists().size() + 1;
        Artist artist = new Artist(newId, name, nationality);
        artistService.createArtist(artist);
        response.sendRedirect("artists");
    }
}