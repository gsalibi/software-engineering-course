package Interfaces;

import Classes_UML.Inicio;
import Classes_UML.Serializador;
import Classes_UML.Sistema;
import Classes_UML.Tarefa;
import Classes_UML.Usuario;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 * tentativa de fazer uma janela de criação de tarefas
 * @author Giordano Mattiello
 */
public class NovaTarefaGUI extends javax.swing.JFrame {
    private static boolean editando_data = false;
    private static boolean editando_tarefa = false;
    private static boolean editando_responsaveis = false;
    private static boolean editando_descricao = false;
    private static boolean nova_tarefa;
    private Tarefa tarefa;
    private ArrayList<Usuario> atribuidos;
    private Sistema sistema;
    /**
     * Creates new form NewJFrame
     */
    public NovaTarefaGUI(int index_tarefa, Sistema sistema, Usuario usuario) {
        initComponents();
        if (index_tarefa >= 0){
            nova_tarefa = false;
            tarefa = usuario.getTarefas().get(index_tarefa);
            this.setTitle("Editar tarefa: " + tarefa.getNome());
        }
        else{
            nova_tarefa = true;
            tarefa = new Tarefa("Nova Tarefa", "Insira descricao da tarefa aqui", new Date());
            this.setTitle("Criar Nova Tarefa");
        }
        descricaoText.setText(tarefa.getDescricao());
        tarefaText.setText(tarefa.getNome());
        barraProgresso.setValue(tarefa.getProgresso());
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        dataText.setText(format.format(tarefa.getPrazo()));
        
        atribuidos = tarefa.getUsuariosAtribuidos();
        for (int i = 0; i < atribuidos.size(); i++){
            responsaveisText.add(atribuidos.get(i).getNome());
        }
        for (int i = 0; i < sistema.getUsuarios().size(); i++){
            usuariosText.add(sistema.getUsuarios().get(i).getNome());
        }
        
        this.sistema = sistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button2 = new java.awt.Button();
        tarefaText = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descricaoText = new java.awt.TextArea();
        finalizar = new java.awt.Button();
        descartar = new java.awt.Button();
        btnAddResponsaveis = new java.awt.Button();
        responsaveisText = new java.awt.List();
        btnDelResponsaveis = new java.awt.Button();
        usuariosText = new java.awt.List();
        jLabel5 = new javax.swing.JLabel();
        dataText = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        barraProgresso = new javax.swing.JSlider();

        button2.setLabel("button2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Nova Tarefa");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tarefaText.setText("Nova Tarefa");
        tarefaText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tarefaTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tarefaTextFocusLost(evt);
            }
        });
        tarefaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarefaTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nova Tarefa:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Data de entrega:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Responsáveis:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Descrição:");

        descricaoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descricaoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descricaoTextFocusLost(evt);
            }
        });

        finalizar.setLabel("Concluir");
        finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarMouseClicked(evt);
            }
        });
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        descartar.setLabel("Cancelar");
        descartar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descartarMouseClicked(evt);
            }
        });
        descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartarActionPerformed(evt);
            }
        });

        btnAddResponsaveis.setLabel("Adicionar à tarefa");
        btnAddResponsaveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddResponsaveisMouseClicked(evt);
            }
        });

        btnDelResponsaveis.setLabel("Remover da tarefa");
        btnDelResponsaveis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelResponsaveisMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Membros do projeto:");

        dataText.setBackground(new java.awt.Color(223, 223, 223));
        dataText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dataText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        dataText.setText("dd/mm/aaaa");
        dataText.setMinimumSize(new java.awt.Dimension(40, 21));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Progresso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descartar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tarefaText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(responsaveisText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddResponsaveis, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(usuariosText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(barraProgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tarefaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dataText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(responsaveisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuariosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddResponsaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descartar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tarefaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarefaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarefaTextActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarActionPerformed

    private void descartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descartarActionPerformed

    private void finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseClicked
        // TODO add your handling code here:
        Date dataDeHoje = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        boolean podeGravarTarefa = true;
        
        try {
            Date dataInserida = format.parse(dataText.getText());
            if (dataInserida.before(dataDeHoje)) {
                JOptionPane.showMessageDialog(new JFrame(), "Data precisa ser depois de hoje!");
                podeGravarTarefa = false;
            }
            tarefa.setPrazo(dataInserida);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Data inválida!");
            podeGravarTarefa = false;
        }
           
        tarefa.setDescricao(descricaoText.getText());
        tarefa.setNome(tarefaText.getText());
        tarefa.setProgresso(barraProgresso.getValue());
        
        for(Usuario u: tarefa.getUsuariosAtribuidos()){
            u.removeTarefa(tarefa);
            tarefa.removeUsuarioAtribuido(u);
        }
        for(Usuario u: atribuidos){
            tarefa.addUsuarioAtribuido(u);
            u.adicionaNovaTarefa(tarefa);
        }
        if (podeGravarTarefa) {
            this.dispose();    
        }
        
    }//GEN-LAST:event_finalizarMouseClicked

    private void descartarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descartarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_descartarMouseClicked

    private void btnAddResponsaveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddResponsaveisMouseClicked
        // TODO add your handling code here:
        int[] selecionados = usuariosText.getSelectedIndexes();
        for (int i : selecionados){
            Usuario usrAtribuido = sistema.getUsuarios().get(i);
            atribuidos.add(usrAtribuido);
            boolean JaTemOCabocloLa = false;
            for (String nome : responsaveisText.getItems()) {
                if (nome.equals(usrAtribuido.getNome())) {
                    JaTemOCabocloLa = true;
                }
            }
            if (!JaTemOCabocloLa) {
                responsaveisText.add(sistema.getUsuarios().get(i).getNome());
            }
            
                        
        }
    }//GEN-LAST:event_btnAddResponsaveisMouseClicked

    private void btnDelResponsaveisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelResponsaveisMouseClicked
        // TODO add your handling code here:
        int[] selecionados = responsaveisText.getSelectedIndexes();
        for (int i : selecionados){
            atribuidos.remove(i);
            responsaveisText.remove(i);
        }
    }//GEN-LAST:event_btnDelResponsaveisMouseClicked

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void descricaoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descricaoTextFocusGained
        // TODO add your handling code here: Insira descricao da tarefa aqui
        if (descricaoText.getText().equals("Insira descricao da tarefa aqui"))  {
            descricaoText.setText("");
        }        
    }//GEN-LAST:event_descricaoTextFocusGained

    private void descricaoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descricaoTextFocusLost
        // TODO add your handling code here:
        if (descricaoText.getText().equals(""))  {
            descricaoText.setText("Insira descricao da tarefa aqui");
        }          
    }//GEN-LAST:event_descricaoTextFocusLost

    private void tarefaTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tarefaTextFocusGained
        // TODO add your handling code here:
        if (tarefaText.getText().equals("Nova Tarefa"))  {
            tarefaText.setText("");
        }        
    }//GEN-LAST:event_tarefaTextFocusGained

    private void tarefaTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tarefaTextFocusLost
        // TODO add your handling code here:
        if (tarefaText.getText().equals(""))  {
            tarefaText.setText("Nova Tarefa");
        }        
    }//GEN-LAST:event_tarefaTextFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Serializador.gravaSistema(sistema);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider barraProgresso;
    private java.awt.Button btnAddResponsaveis;
    private java.awt.Button btnDelResponsaveis;
    private java.awt.Button button2;
    private javax.swing.JFormattedTextField dataText;
    private java.awt.Button descartar;
    private java.awt.TextArea descricaoText;
    private java.awt.Button finalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.Label label2;
    private java.awt.List responsaveisText;
    private java.awt.TextField tarefaText;
    private java.awt.List usuariosText;
    // End of variables declaration//GEN-END:variables
}
