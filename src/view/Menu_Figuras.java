/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import fonts.Fonts;

/**
 *
 * @author JAIMEUNL
 */
public class Menu_Figuras extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Figuras
     */
    //private Main_Frame mainFrame;
    public Menu_Figuras() {
        initComponents();
        //this.mainFrame = mainFrame;
        
    }
    Fonts tipoFuente = new Fonts();
    
    //private Main_Frame mainFrame;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btn_bidimensionales = new javax.swing.JButton();
        btn_tridimensionales = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(610, 240));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        btn_bidimensionales.setText("Bidimensionales");
        btn_bidimensionales.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 30));
        btn_bidimensionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bidimensionalesActionPerformed(evt);
            }
        });

        btn_tridimensionales.setText("Tridimensionales");
        btn_tridimensionales.setFont(tipoFuente.fuente(tipoFuente.FSEX, 1, 30));
        btn_tridimensionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tridimensionalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_bidimensionales, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_tridimensionales, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tridimensionales, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(btn_bidimensionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bidimensionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bidimensionalesActionPerformed
        // TODO add your handling code here:
        //Menu_Bidimensionales menu_Bidimensionales = new Menu_Bidimensionales();
        //Main_Frame.showPanel(bg, menu_Bidimensionales);
        Menu_Bidimensionales menu_Bidimensionales = new Menu_Bidimensionales(); 
        Main_Frame.showPanel(bg, menu_Bidimensionales);
        
    }//GEN-LAST:event_btn_bidimensionalesActionPerformed

    private void btn_tridimensionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tridimensionalesActionPerformed
        // TODO add your handling code here:
        Menu_Tridimensionales menu_Tridimensionales = new Menu_Tridimensionales();
        Main_Frame.showPanel(bg, menu_Tridimensionales);
    }//GEN-LAST:event_btn_tridimensionalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_bidimensionales;
    private javax.swing.JButton btn_tridimensionales;
    // End of variables declaration//GEN-END:variables
}
