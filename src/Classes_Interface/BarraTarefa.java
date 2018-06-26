/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Interface;
import Classes_UML.Tarefa;
import java.awt.Component;
import java.awt.Point;
/**
 *
 * @author Jeferson Alves
 */
public class BarraTarefa extends Component{
    public javax.swing.JButton botaoAbaJLabel;
    public javax.swing.JLabel indiceTarefaJLabel;
    public javax.swing.JLabel porcentagemJLabel;
    public javax.swing.JLabel progressoBackgroundJLabel;
    public javax.swing.JLabel progressoJLabel;
    public javax.swing.JLabel tarefaBackgroundJLabel;
    public javax.swing.JPanel tarefaComponentJPanel;
    
    public BarraTarefa(Tarefa tarefa, Point posicao)
    {
        tarefaComponentJPanel = new javax.swing.JPanel();
        botaoAbaJLabel = new javax.swing.JButton();
        indiceTarefaJLabel = new javax.swing.JLabel();
        porcentagemJLabel = new javax.swing.JLabel();
        progressoJLabel = new javax.swing.JLabel();
        progressoBackgroundJLabel = new javax.swing.JLabel();
        tarefaBackgroundJLabel = new javax.swing.JLabel();

        tarefaComponentJPanel.setLayout(null);

        botaoAbaJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PlusTabIconStatic.png"))); // NOI18N
        botaoAbaJLabel.setBorderPainted(false);
        botaoAbaJLabel.setContentAreaFilled(false);
        botaoAbaJLabel.setFocusPainted(false);
        botaoAbaJLabel.setFocusable(false);
        botaoAbaJLabel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PlusTabIconPressed.png"))); // NOI18N
        tarefaComponentJPanel.add(botaoAbaJLabel);
        botaoAbaJLabel.setBounds(920, 10, 50, 23);

        indiceTarefaJLabel.setFont(new java.awt.Font("Helvetica Light", 0, 20)); // NOI18N
        indiceTarefaJLabel.setForeground(new java.awt.Color(107, 13, 14));
        indiceTarefaJLabel.setText("Tarefa 1");
        tarefaComponentJPanel.add(indiceTarefaJLabel);
        indiceTarefaJLabel.setBounds(10, 9, 80, 21);

        porcentagemJLabel.setFont(new java.awt.Font("Helvetica Light", 0, 18)); // NOI18N
        porcentagemJLabel.setForeground(new java.awt.Color(107, 13, 14));
        porcentagemJLabel.setText("100%");
        tarefaComponentJPanel.add(porcentagemJLabel);
        porcentagemJLabel.setBounds(820, 30, 50, 19);

        progressoJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RedBarIcon.png"))); // NOI18N
        tarefaComponentJPanel.add(progressoJLabel);
        progressoJLabel.setBounds(12, 32, 800, 15);

        progressoBackgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/RedBarBackgroundIcon.png"))); // NOI18N
        tarefaComponentJPanel.add(progressoBackgroundJLabel);
        progressoBackgroundJLabel.setBounds(10, 30, 804, 20);

        tarefaBackgroundJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TarefaBackgroundIcon.png"))); // NOI18N
        tarefaComponentJPanel.add(tarefaBackgroundJLabel);
        tarefaBackgroundJLabel.setBounds(0, 0, 976, 64);
        
        tarefaComponentJPanel.setBounds(0, 0, 988, 76);
    }
}
