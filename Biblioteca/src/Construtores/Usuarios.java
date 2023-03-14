package Construtores;

public class Usuarios {
    private String nome;
    private int idade;
    private String sexo;
    private int telefone;
    
    public Usuarios(String nome, int idade, String sexo, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }
    
    
    public void lerLivro(Livros livro) {
    	System.out.println("------Empréstimo------");
        System.out.println("LIVRO:" + livro.getTitulo());
        System.out.println("USUÁRIO:"+ this.nome);
        System.out.println("DATA:");
        
    }
   
    	
    
    
    
  
    
    // getters e setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    void lerLivro() {
    	System.out.println("USUARIO LENDO O LIVRO");
}
}
