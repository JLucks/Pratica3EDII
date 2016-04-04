/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import base.Grafo;
import base.Main;

/**
 *
 * @author Jorge
 */
public class Problema2 extends javax.swing.JPanel {

    /**
     * Creates new form Problema2
     */
    private Grafo grafo;
    public Problema2(Grafo grafo) {
        this.grafo = grafo;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaResult = new javax.swing.JTextArea();
        bttVoltar = new javax.swing.JButton();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("A segunda decisão é em qual localidade da cidade (bairro) deverá ser construído o \n(CATeMI).\nEssa decisão deverá considerar uma localização na qual atenda todos o bairros de \nforma igualitária em relação à distância, considerando que existe um custo \nvinculado ao deslocamento entre os bairros e que as pessoas deverão gastar valores \npróximos para se deslocar ao CATeMI. Ex: Na representação abaixo se o CATeMI for \nimplantado no bairro “D”, um pessoa que mora no bairro “E” irá gastar o total de 15\npara chegar ao local, enquanto que está no C gastaria 8. Considere agora o Bairro C\ncomo local de instalação.\nNesta configuração o morador do bairro gastaria agora 7, ou seja ficaria melhor \nlocalizado.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2º Problema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jtaResult.setEditable(false);
        jtaResult.setColumns(20);
        jtaResult.setRows(5);
        jScrollPane2.setViewportView(jtaResult);

        bttVoltar.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        bttVoltar.setText("Voltar");
        bttVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 294, Short.MAX_VALUE)
                .addComponent(bttVoltar)
                .addGap(296, 296, 296))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttVoltar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttVoltarActionPerformed
        this.setVisible(false);
        Main.janela.remove(this);
        Main.janela.add(new Home(this.grafo));
        Main.janela.setVisible(true);
    }//GEN-LAST:event_bttVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jtaResult;
    // End of variables declaration//GEN-END:variables
}
