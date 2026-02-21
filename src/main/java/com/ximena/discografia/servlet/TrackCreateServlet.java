package com.ximena.discografia.servlet;

import com.ximena.discografia.model.Track;
import com.ximena.discografia.service.ArtistService;
import com.ximena.discografia.service.TrackService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/createTrack")
public class TrackCreateServlet extends HttpServlet {

    private TrackService trackService;
    private ArtistService artistService;

    @Override
    public void init() {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        trackService = context.getBean(TrackService.class);
        artistService = context.getBean(ArtistService.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("artists", artistService.getAllArtists());
        request.getRequestDispatcher("/create-track.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String genre = request.getParameter("genre");
        String album = request.getParameter("album");
        double duration = Double.parseDouble(request.getParameter("duration"));
        int newId = trackService.getAllTracks().size() + 1;
        Track track = new Track(newId, title, genre, duration, album);
        String[] selectedArtists = request.getParameterValues("artistIds");
        List<Integer> artistIds = new ArrayList<>();
        if (selectedArtists != null) {
            for (String id : selectedArtists) {
                artistIds.add(Integer.parseInt(id));
            }
        }
        trackService.createTrack(track, artistIds);
        response.sendRedirect("tracks");
    }
}