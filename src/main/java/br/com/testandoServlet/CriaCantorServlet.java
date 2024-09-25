package br.com.testandoServlet;

import model.Cantor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class CriaCantorServlet extends HttpServlet {

    static ArrayList<Cantor> cantores =  new ArrayList<>();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String estiloMusical = request.getParameter("estiloMusical");
        String qtdAlbuns = request.getParameter("qtdAlbuns");

        System.out.println(nome);
        System.out.println(estiloMusical);
        System.out.println(estiloMusical);

        cantores.add(new Cantor(1, nome, estiloMusical, qtdAlbuns));

        PrintWriter out =  response.getWriter();
        out.println("<html><body><h1>Cantor Adicionado com sucesso</h1></body></html>");

    }

}
