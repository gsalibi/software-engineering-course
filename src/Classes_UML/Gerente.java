package Classes_UML;

import java.util.ArrayList;

public class Gerente extends Usuario {

	private ArrayList<Projeto> projetosGerencia;
	//private Sistema sistema;
	
	public Gerente(String nome){
		super(nome);
		projetosGerencia = new ArrayList<Projeto>();
	}
	
	public ArrayList<Projeto> getProjetosGerencia(){
		return new ArrayList<Projeto>(projetosGerencia);
	}
	
	public void adicionaProjetoGerencia(Projeto x){
		if (!projetosGerencia.contains(x))
			projetosGerencia.add(x);
	}
	
	public void removeProjetoGerencia(Projeto x){
		projetosGerencia.remove(x);
	}
	
	
	
}
