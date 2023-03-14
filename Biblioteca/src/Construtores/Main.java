package Construtores;



public class Main {

	public static void main(String[] args) {
		
		Livros livro = new Livros("O SENHOR DOS ANEIS", "J.R.R. Tolkien", "Fantasia", "HarperCollins", "2022", 1, 1000);
		Usuarios usuarios = new Usuarios("JOÃO", 25, "Masculino", 123456789);
		Emprestimos emprestimo = new Emprestimos(usuarios, livro, "22/05/15", "13:53");
		
		System.out.println("----EMPRÉSTIMO----");
	    System.out.println(emprestimo.getLivro().getTitulo());
	    System.out.println(emprestimo.getUsuario().getNome());
	    System.out.println(emprestimo.getDataDoemprestimo());
	    emprestimo.getLivro().abrirLivro(); 
	    emprestimo.getUsuario().lerLivro();
	    emprestimo.getLivro().fecharLivro();
	    emprestimo.devolverLivro();
	    
	    
	    
	    
	    
		
	     
	    
	        
	        
	        
	    }
		
		
		
	}

	
	
		

	
	
	