package dao;

import db.DbConnect;
import model.Cantor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CantorDao {

    Connection connection;

    public CantorDao() throws ClassNotFoundException, SQLException {
        connection = DbConnect.getConnection();
    }

    public void addCantor(Cantor cantor) throws SQLException {
        try {

            PreparedStatement pst = connection.prepareStatement("insert into cantor(nome, estiloMusical, qtdAlbuns) values(?,?,?)");
            pst.setString(1, cantor.getNome());
            pst.setString(2, cantor.getEstiloMusical());
            pst.setString(3, cantor.getQtdAlbuns());

            pst.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Cantor> getAllCantor() throws  SQLException {
         List<Cantor> cantores = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from cantor");

            while (rs.next()) {
                Cantor cantor = new Cantor();

                cantor.setID(rs.getInt("id"));
                cantor.setNome(rs.getString("nome"));
                cantor.setEstiloMusical(rs.getString("estiloMusical"));
                cantor.setQtdAlbuns(rs.getString("qtdAlbuns"));

                cantores.add(cantor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cantores;
    }
}
