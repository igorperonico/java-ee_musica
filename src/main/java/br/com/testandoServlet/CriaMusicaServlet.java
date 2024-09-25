package br.com.testandoServlet;

import model.Musica;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class CriaMusicaServlet extends HttpServlet {
    static ArrayList<Musica> musicas = new ArrayList<>();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("nome");
        String estiloMusical = request.getParameter("estiloMusical");
        String compositor = request.getParameter("compositor");
        String anoDeLancamento = request.getParameter("anoDeLancamento");

        Random random = new Random();

        musicas.add(new Musica(random.nextInt(), nome, estiloMusical, compositor, Integer.parseInt(anoDeLancamento)));


        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Musica Adicionada com sucesso</h1></body></html>");
    }
}
