package com.ximena.discografia.servlet;

import com.ximena.discografia.service.ArtistService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;

@WebServlet("/artists")
public class ArtistListServlet extends HttpServlet {

    private ArtistService artistService;

    @Override
    public void init() {
        ApplicationContext context =
                WebApplicationContextUtils
                        .getWebApplicationContext(getServletContext());

        artistService = context.getBean(ArtistService.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("artists", artistService.getAllArtists());
        request.getRequestDispatcher("/artists.jsp").forward(request, response);
    }
}