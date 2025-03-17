package BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;

public class usuário {
    private String teste1;
    private int id;
    private String nome;
    private int telefone;
    private List<livro> livrosemprestados;
    private List<livro> livrosreservados;

    public usuário (int id, String nome,  int telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.livrosemprestados = new ArrayList<>();
        this.livrosreservados = new ArrayList<>();
    }

    public boolean emprestarLivro(livro livro){
        if (livro.emprestar()) {
            livrosemprestados.add(livro);
            return true;
        }
        return false;
    }
    public void devolverlivro(livro livro){
        if (livrosemprestados.contains(livro)){
            livrosemprestados.remove(livro);
            livro.devolver();
        }
    }
    public boolean reservarlivro(livro livro){
        if (livro.reservar()) {
            livrosreservados.add(livro);
            return true;
        }
        return false;
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone(){
        return telefone;
    }

    public List<livro> getLivrosEmprestados() {
        return livrosemprestados;
    }

    public List<livro> getLivrosReservados() {
        return livrosreservados;
    }
}

