package Classes_UML;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Canal
 * 
 * Implementa um canal de troca de mensagens, seus atributos e comportamentos.
 * 
 * @author guilherme
 */

public class Canal implements Serializable {

	private static int proximoId = 0;
	private final int id;
	private int idProprietario;
	private String nome;
        private String descricao;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Integer> idModeradores;
	private ArrayList<Mensagem> mensagens;
             
        static void setProximoId(int proxId) {
            proximoId = proxId;
        }
        
        static int getProximoId() {
            return proximoId;
        }
        
        /**
         * Construtor
         * 
         * @param nome (obrigatório) Nome do canal que será exibido aos demais usuários
         * @param proprietario (obrigatório) O usuário responsável pelo canal, habilitado a adicionar e remove moderadores, usuários, e editar propriedades do canal.
         * @param desc (obrigatório) Descrição do canal que será exibida aos demais usuários 
         */
          
	public Canal(String nome, Usuario proprietario, String desc){
		this.id = proximoId++;
		this.nome = nome;
		this.idProprietario = proprietario.getId();
		idModeradores = new ArrayList<Integer>();
		idModeradores.add(proprietario.getId());
		mensagens = new ArrayList<Mensagem>();
		usuarios = new ArrayList<Usuario>();
		
                 this.descricao = desc;
	}

        public String getDesc(){
            return this.descricao;
        }
        
        public void setDesc(String desc) {
            this.descricao = desc;
        }
        
	public int getId(){
		return id;
	}
	
	public int getIdProprietario(){
		return idProprietario;
	}
	
	public void setIdProprietario(int idProprietario){
		this.idProprietario = idProprietario;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
        /**
         * Adiciona um usuário ao canal.
         * @param novo O objeto Usuario a ser adicionado. Este método também atualiza esta instância passada como parâmetro para que reflita a entrada no canal.
         */
	public void adicionaUsuario(Usuario novo){
		if (!usuarios.contains(novo)){
			usuarios.add(novo);
			
		}
	}
	
        /**
         * Remove um usuário do canal.
         * @param removido O objeto Usuario a ser removido. Este método também atualiza esta instância passada como parâmetro para que reflita sua saída do canal.
         */
	public void removeUsuario(Usuario removido){
		if (removido.getId() == idProprietario)
			return;
		
		usuarios.remove(removido);
	}
	    /**
         * Retorna uma cópia da lista atual de usuários do canal.
         *
         * @return A lista de usuários.
         */

	public ArrayList<Usuario> getUsuarios(){
		return new ArrayList<Usuario>(usuarios);
	}
	
        /**
         * Atribui a um ID de usuário o status de moderador. 
         * @param id O id único do usuário a ser designado moderador.
         * 
         * Este método não altera a instância Usuario detentora do id fornecido.
         * @see adicionaUsuario
         */
        
	public void adicionaModerador(int id){
		if(!idModeradores.contains(id)){
			idModeradores.add(id);
		}
	}
	
        /**
         * Remove um ID de usuário da lista de moderadores do canal.
         * 
         * @param id O id único do usuário a ser removido da lista de moderadores.
         * 
         * Este método não altera a instância Usuario detentora do id fornecido.
         * @see removeUsuario
         */
        
	public void removeModerador(int id){
		idModeradores.remove(id);
	}
	
	public ArrayList<Integer> getModeradores(){
		return new ArrayList<Integer>(idModeradores);
	}
	
        /**
         * Acrescenta uma instância de Mensagem ao Canal. Este método é a implementação de facto de um envio de mensagem.
         * @param msg A mensagem a ser enviada
         */
	public void enviaMensagem(Mensagem msg){
		mensagens.add(msg);
	}
	
        /**
         * Remove uma mensagem previamente inserida no Canal.
         * @param msg A mensagem a ser removida. Este parâmetro deve corresponder a uma instância de mensagem existente.
         * @see getMensagens
         */
	public void deletaMensagem(Mensagem msg){
		mensagens.remove(msg);
	}
        
        /**
         * Solicita ao Canal uma lista das mensagens enviadas e não removidas
         * @return Um ArrayList de instâncias Mensagem existentes no canal no momento da execução.
         */
	public ArrayList<Mensagem> getMensagens(){
		return new ArrayList<>(mensagens);
	}
        
        public String printarMensagens() {
            ArrayList<Mensagem> mens = getMensagens();
            mens.sort(new Comparator<Mensagem>() {
                public int compare(Mensagem msg1, Mensagem msg2) {
                    return msg1.getTimestamp().compareTo(msg2.getTimestamp());
                }
            });
            
            String theMessage = "";
            for (Mensagem msg: mens) {
                Usuario participante = msg.getUser();
                theMessage = theMessage + participante.getNome()+"("+participante.getId()+"):\n  "+msg.getConteudo()+"\n";
            }
            theMessage = theMessage + "\n";
            
            return theMessage;
        }
        
        // Isso aqui é necessário para controle de duplicatas.
        @Override
        public boolean equals(Object object)
        {
            boolean isEqual = false;
            
            if (object != null && object instanceof Canal) {
                isEqual = (this.id == ((Canal) object).getId());
            }
            
            return isEqual;
        }
	
}
