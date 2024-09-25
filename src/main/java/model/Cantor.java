package model;

public class Cantor {
    private int ID;
    private String nome;
    private String estiloMusical;
    private String qtdAlbuns;

    public Cantor(){}
    public Cantor(int ID, String nome, String estiloMusical, String qtdAlbuns) {
        this.ID = ID;
        this.nome = nome;
        this.estiloMusical = estiloMusical;
        this.qtdAlbuns = qtdAlbuns;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getQtdAlbuns() {
        return qtdAlbuns;
    }

    public void setQtdAlbuns(String qtdAlbuns) {
        this.qtdAlbuns = qtdAlbuns;
    }
}
