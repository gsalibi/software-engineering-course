/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UML;

/**
 *
 * @author guilherme
 */
public class GeradorIds {
    
    int idUsuario;
    int idTarefa;
    int idProjeto;
    
    // objeto gerador, use os metodos nele
    public static final GeradorIds geradorId = new GeradorIds();
    
    
    private GeradorIds(){
        idUsuario = 0;
        idTarefa = 0;
        idProjeto = 0;
    }
    
    public int geraIdUsuario(){
        return idUsuario++;
    }
    
    public int geraIdTarefa(){
        return idTarefa++;
    }
        
    public int geraIdProjeto(){
        return idProjeto++;
    }
    
    
}
