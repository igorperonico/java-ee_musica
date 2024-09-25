package model;

public class Musica {

    private int id;
    private String nome;
    private String estiloMusical;
    private String compositor;
    private int anoDeLancamento;

    public Musica() {
    }

    public Musica(int id, String nome, String estiloMusical, String compositor, int anoDeLancamento) {
        this.id = id;
        this.nome = nome;
        this.estiloMusical = estiloMusical;
        this.compositor = compositor;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}
