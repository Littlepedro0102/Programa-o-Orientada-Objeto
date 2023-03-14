package Construtores;



public class Livros {
    private String titulo;
    private String autores;
    private String area;
    private String editora;
    private String ano;
    private int edicao;
    private int numeroDeFolhas;
    private String status;
    
   

	private boolean emprestimo;
	private boolean aberto;

	public Livros() {
		
	}
	
	 

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Livros(String titulo, String autores, String area, String editora, String ano, int edicao, int numeroDeFolhas) {
        
		this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numeroDeFolhas = numeroDeFolhas;
    }

	 
	 


	public void abrirLivro() {
        this.aberto = true;
        System.out.println("O LIVRO ESTÁ ABERTO PARA LEITURA");
        
        
    }
    public void fecharLivro() {
        this.aberto = false;
        System.out.println("O LIVRO ESTÁ FECHADO PARA LEITURA");
    }
   
	
    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getNumeroDeFolhas() {
        return numeroDeFolhas;
    }

    public void setNumeroDeFolhas(int numeroDeFolhas) {
        this.numeroDeFolhas = numeroDeFolhas;
    }
    
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isEmprestimo() {
		return false;
}
}