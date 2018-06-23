package Classes_UML;

import java.util.ArrayList;

/**
 * A subclasse Gerente representa um Usuario com determinados poderes adicionais dentro de um projeto.
 * 
 * @author guilherme
 */

public class Gerente extends Usuario {

	private ArrayList<Projeto> projetosGerencia;
	//private Sistema sistema;
	
        /**
         * Construtor
         * 
         * @param nome O nome publicamente visível do indivíduo indicado como gerente. 
         * @see construtor de Usuario
         */
	public Gerente(String nome){
		super(nome);
		projetosGerencia = new ArrayList<Projeto>();
	}
        
        /**
         * Construtor
         * 
         * @param nome O nome publicamente visível do indivíduo indicado como gerente. 
         * @param email O endereço de email do gerente.
         * @param senha A senha do gerente
         * @see construtor de Usuario
         */
        public Gerente(String nome, String email, String senha) {
            super(nome, email, senha);
            projetosGerencia = new ArrayList<Projeto>();
        }
	
        /**
         * Solicita uma lista dos projetos gerenciados pelo usuário representado por esta instância.
         * @return Um ArrayList com referências a objetos Projeto
         */
	public ArrayList<Projeto> getProjetosGerencia(){
		return new ArrayList<Projeto>(projetosGerencia);
	}
	
        /**
         * Atribui este Gerente à gerência de um Projeto.
         * 
         * @param proj Uma referência a um objeto Projeto existente.
         * 
         * Este método não altera a instância de Projeto passada como parâmetro.
         */
	public void adicionaProjetoGerencia(Projeto proj){
		if (!projetosGerencia.contains(proj))
			projetosGerencia.add(proj);
	}
	
        /**
         * Remove este Gerente da gerência de um Projeto.
         * 
         * @param proj Uma referência a um objeto Projeto existente.
         * 
         * Este método não altera a instância de Projeto passada como parâmetro.
         */
        
	public void removeProjetoGerencia(Projeto proj){
		projetosGerencia.remove(proj);
	}
	
}
