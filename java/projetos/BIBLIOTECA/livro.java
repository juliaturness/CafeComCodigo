package BIBLIOTECA;

public class livro {
    private String teste1;

    private int id;
    private String titulo;
    private String autor;
    private int anodePublicacao;
    private boolean disponivel; 
    private boolean reservado;

    public livro (int id, String titulo, String autor, int anodePublicacao){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anodePublicacao = anodePublicacao;
        this.disponivel = true;
        this.reservado = false;
    }

    public boolean emprestar(){
        if (disponivel = true) {
            disponivel = false;
        }
                return disponivel;
    }

    public boolean devolver(){
        disponivel = true;
        return disponivel;
    }

    public boolean reservar(){
        reservado = true;
        return reservado;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anodePublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean isReservado() {
        return reservado;
    }
}
