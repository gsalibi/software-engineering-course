/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_UML;

import java.sql.Date;

/**
 *
 * @author Rachel
 */
public class Inicio {
       public static Sistema sistema;
       public static Usuario usuario; //usuario logado no sistema
       public static Projeto projeto; //projeto atual
    
       public static void iniciaSimulacao(Sistema sistema){
                        
            //Dados inseridos à força so para simulaçao
            int id = sistema.criaUsuario("UsuarioTeste");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("123");
            
            int projID = sistema.criaProjeto("Campeonato Internacional de Amarelinha Subaquática");
            
            Tarefa tarefa = new Tarefa("Contatar Guarda Costeira", "Verificar com a guarda costeira",  Date.valueOf("2018-09-26"));
            
            usuario.adicionaNovaTarefa(tarefa);
            Tarefa tarefa2 = new Tarefa("Fechar contrato com fábrica de giz", "Verificar melhores preços", Date.valueOf("2018-09-27"));
            usuario.adicionaNovaTarefa(tarefa2);
            
            sistema.criaProjeto("Website do Curupira");
            Tarefa tarefa3 = new Tarefa("Nome de domínio", "Reservar nome de domínio curupira.com.br", Date.valueOf("2018-09-10"));
            
            
            id = sistema.criaUsuario("Colega da Silva");
            usuario = sistema.getUsuarios().get(id);
            usuario.adicionaNovaTarefa(tarefa2);
            
            id = sistema.criaUsuario("Username");
            usuario = sistema.getUsuarios().get(id);
            usuario.setSenha("Senha");
            
       }
}
