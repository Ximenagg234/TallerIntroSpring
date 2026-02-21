package com.ximena.discografia.servlet;

import com.ximena.discografia.service.TrackService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;

@WebServlet("/deleteTrack")
public class TrackDeleteServlet extends HttpServlet {

    private TrackService trackService;

    @Override
    public void init() {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        trackService = context.getBean(TrackService.class);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        trackService.deleteTrack(id);
        response.sendRedirect("tracks");
    }
}