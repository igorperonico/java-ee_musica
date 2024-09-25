package dao;

import db.DbConnect;
import model.Musica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MusicaDao {

    Connection connection;

    public MusicaDao() throws ClassNotFoundException, SQLException {
        this.connection = DbConnect.getConnection();
    }

    public void addMusica(Musica musica) throws SQLException {
        try {
            PreparedStatement pst = connection.prepareStatement("insert into musica(nome, estiloMusical, compositor, anoDeLancamento ) values(?, ?, ?, ?)");
            pst.setString(1, musica.getNome());
            pst.setString(2, musica.getEstiloMusical());
            pst.setString(4, musica.getCompositor());
            pst.setInt(5, musica.getAnoDeLancamento());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Musica> getAllMusica() throws SQLException{
        List<Musica> musicas = new ArrayList<>();
        try {
            PreparedStatement pst = connection.prepareStatement("select * from musica");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Musica musica = new Musica();

                musica.setId(rs.getInt("id"));
                musica.setNome(rs.getString("nome"));
                musica.setEstiloMusical(rs.getString("estiloMusical"));
                musica.setCompositor(rs.getString("compositor"));
                musica.setAnoDeLancamento(rs.getInt("anoDeLancamento"));

                musicas.add(musica);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return musicas;
    }

    public void deleteMusica(int id) throws SQLException {
        try {
            PreparedStatement pst = connection.prepareStatement("delete from musica where id =?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Musica getMusicaById(int id) throws SQLException {
        Musica musica = null;
        try {
            PreparedStatement pst = connection.prepareStatement("select * from musica where id =?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                musica = new Musica();

                musica.setId(rs.getInt("id"));
                musica.setNome(rs.getString("nome"));
                musica.setEstiloMusical(rs.getString("estiloMusical"));
                musica.setCompositor(rs.getString("compositor"));
                musica.setAnoDeLancamento(rs.getInt("anoDeLancamento"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return musica;
    }


}
