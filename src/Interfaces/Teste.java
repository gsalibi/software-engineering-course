/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Jeferson Alves
 */
public class Teste extends javax.swing.JFrame {

    /**
     * Creates new form Teste
     */
    public Teste() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tarefaComponentJPanel = new javax.swing.JPanel();
        botaoAbaJLabel = new javax.swing.JButton();
        indiceTarefaJLabel = new javax.swing.JLabel();
        porcentagemJLabel = new javax.swing.JLabel();
        progressoJLabel = new javax.swing.JLabel();
        progressoBackgroundJLabel = new javax.swing.JLabel();
        tarefaBackgroundJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        getContentPane().add(tarefaComponentJPanel);
        tarefaComponentJPanel.setBounds(0, 0, 976, 64);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbaJLabel;
    private javax.swing.JLabel indiceTarefaJLabel;
    private javax.swing.JLabel porcentagemJLabel;
    private javax.swing.JLabel progressoBackgroundJLabel;
    private javax.swing.JLabel progressoJLabel;
    private javax.swing.JLabel tarefaBackgroundJLabel;
    private javax.swing.JPanel tarefaComponentJPanel;
    // End of variables declaration//GEN-END:variables
}