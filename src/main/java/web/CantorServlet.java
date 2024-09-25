package web;

import dao.CantorDao;
import model.Cantor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class CantorServlet  extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private CantorDao dao;

    public CantorServlet() throws ClassNotFoundException, SQLException {
        super();
        this.dao = new CantorDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().append("Served at:").append(request.getContextPath());

        RequestDispatcher index = request.getRequestDispatcher("index.jsp");
        try {
            request.setAttribute("cantores",dao.getAllCantor());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        index.forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Cantor cantor =  new Cantor();
        cantor.setNome(request.getParameter("nome"));
        cantor.setEstiloMusical(request.getParameter("estiloMusical"));
        cantor.setQtdAlbuns(request.getParameter("qtdAlbuns"));

        try {
            dao.addCantor(cantor);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
