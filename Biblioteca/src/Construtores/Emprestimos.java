package Construtores;



public class Emprestimos {

    private String dataDoemprestimo;
    private String horaDoemprestimo;
    private Livros livro;
    private Usuarios usuario;

    public Emprestimos() {
		
	}
    public Emprestimos(Usuarios usuario, Livros livro, String dataDoemprestimo,String horaDoemprestimo) {
    	super();
    	this.usuario = usuario;
        this.livro = livro;
        this.dataDoemprestimo = dataDoemprestimo;
        this.horaDoemprestimo = horaDoemprestimo;
        
    }
    	
    
	
    public String getDataDoemprestimo() {
        return dataDoemprestimo;
    }

    public void setDataDoemprestimo(String dataDoemprestimo) {
        this.dataDoemprestimo = dataDoemprestimo;
    }

    public String isHoraDoemprestimo() {
        return horaDoemprestimo;
    }

    public void setHoraDoemprestimo(String horaDoemprestimo) {
        this.horaDoemprestimo = horaDoemprestimo;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public void lerLivro() {
        usuario.lerLivro(livro);
    }

    public void abrirLivro() {
        livro.abrirLivro();
    }

    public void fecharLivro() {
        livro.fecharLivro();
    }
    
    public void devolverLivro() {
        livro.setEmprestimo(true);
        
        System.out.println("LIVRO DEVOLVIDO");
    }
    
    
    
}
