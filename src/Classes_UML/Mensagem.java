package Classes_UML;

import java.io.Serializable;
import java.util.Date;

/**
 * Mensagem.
 * A menor unidade representativa de um evento de comunicação de usuário(s) a usuário(s).
 * Engloba o conteúdo da mensagem, seu autor, e a data e hora de criação.
 * 
 * @author guilherme
 */

public class Mensagem implements Serializable {

	private static int proximoId = 0;
	private final int id;
	private final int id_usuario;
	private final Date timestamp;
	private String conteudo;

        /**
         * Construtor.
         * 
         * @param id_usuario Um atributo id da classe Usuario
         * @param conteudo O texto contido na mensagem. Este é codificado em UTF-8.
         */
	public Mensagem(int id_usuario, String conteudo){
		this.id = proximoId++;
		this.id_usuario = id_usuario;
		this.timestamp = new Date();
		this.conteudo = conteudo;
	}
	
	public int getId() {
		return id;
	}
		/**
		 * Retorna o id único do Usuario designado como criador da mensagem.
		 * @return O id
		 */
	public int getId_usuario() {
		return id_usuario;
	}
		/**
		 * Retorna a data de criação da mensagem.
		 * @return Um objeto Date com o timestamp da mensagem.
		 */
	public Date getTimestamp() {
		return timestamp;
	}

		/**
		 * Retorna o conteúdo da mensagem, isto é, a mensagem em si.
		 * @return O conteúdo completo da mensagem em UTF8.
		 */
	public String getConteudo() {
		return conteudo;
	}
	
        // Isso aqui é necessário para controle de duplicatas.
        @Override
        public boolean equals(Object object)
        {
            boolean isEqual = false;
            
            if (object != null && object instanceof Mensagem) {
                isEqual = (this.id == ((Mensagem) object).getId());
            }
            
            return isEqual;
        }
}
