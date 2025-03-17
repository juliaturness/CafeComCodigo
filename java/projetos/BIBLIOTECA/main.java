package BIBLIOTECA;

public class main {
    private String teste;

    public static void main(String[] args) {
        sistema sistema = new sistema();

        livro livro1 = new livro(001, "Dam Casmurro", "Machado de Assis", 1899);
        livro livro2 = new livro(002, "O Primo Basílio", "José de Alencar", 1852);
        livro livro3 = new livro(003, "Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881);
        sistema.adicionarlivro(livro1);
        sistema.adicionarlivro(livro2);
        sistema.adicionarlivro(livro3);

        System.out.println("Livros disponíveis:");
        sistema.exibirlivrosDisponiveis();
        


    }
}
