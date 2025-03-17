package BIBLIOTECA;

import java.util.ArrayList;
import java.util.List;

public class sistema {
    private List<livro> livros;
    private List<usuário> usuarios;
    private String teste1;


    public sistema() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarlivro(livro livro){
        livros.add(livro);
    }

    public void adicionarUsuario(usuário usuário){
        usuarios.add(usuário);
    }

        public void exibirlivrosDisponiveis(){
            for(livro livro : livros){
                if (livro.isDisponivel()) {
                    System.out.println("ID: " + livro.getId() + " - " + livro.getTitulo() + " por " + livro.getAutor());
                }
            }
        }

        public void exibirLivrosReservados(){
            for (livro livro : livros ) {
                if (livro.isReservado()) {
                    System.out.println("ID: " + livro.getId() + " - " + livro.getTitulo() + " por " + livro.getAutor());
                }
            }
        }

        public void exibirLivrosEmprestados(){
            for(livro livro : livros){
                if(!livro.isDisponivel() && !livro.isReservado()){
                    System.out.println("ID: " + livro.getId() + " - " + livro.getTitulo() + " por " + livro.getAutor());
                }
            }
        }   

}
