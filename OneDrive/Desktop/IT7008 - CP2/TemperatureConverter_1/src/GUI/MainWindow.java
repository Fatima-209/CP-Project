package GUI;

import Logic.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/celsius.jpg")));
    }
    private final ImageIcon celsiusIcon = new ImageIcon(getClass().getResource("/GUI/celsius.jpg"));
    private final ImageIcon fahrenheitIcon = new ImageIcon(getClass().getResource("/GUI/fahrenheit.jpg"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        lblTemp = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        txtOutput = new javax.swing.JTextField();
        pnlRadioButtons = new javax.swing.JPanel();
        celsiusBtn = new javax.swing.JRadioButton();
        fahrBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temperature Converter");

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 0, 51));
        lbTitle.setText("            Celcius Converter");
        getContentPane().add(lbTitle, java.awt.BorderLayout.PAGE_START);

        pnlCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTemp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTemp.setForeground(new java.awt.Color(0, 0, 255));
        lblTemp.setText("Temperature in Celcius:");

        txtInput.setText(" ");
        txtInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInputFocusGained(evt);
            }
        });
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        btnConvert.setText("Convert to Fahrenheit");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        txtOutput.setText(" ");

        pnlRadioButtons.setBorder(javax.swing.BorderFactory.createTitledBorder("Switch To"));
        pnlRadioButtons.setToolTipText("Switch To");
        pnlRadioButtons.setName("Switch To"); // NOI18N

        group.add(celsiusBtn);
        celsiusBtn.setText("Celsius");
        celsiusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celsiusBtnActionPerformed(evt);
            }
        });

        group.add(fahrBtn);
        fahrBtn.setText("Fahrenheit");
        fahrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fahrBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRadioButtonsLayout = new javax.swing.GroupLayout(pnlRadioButtons);
        pnlRadioButtons.setLayout(pnlRadioButtonsLayout);
        pnlRadioButtonsLayout.setHorizontalGroup(
            pnlRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRadioButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(celsiusBtn)
                .addGap(18, 18, 18)
                .addComponent(fahrBtn)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        pnlRadioButtonsLayout.setVerticalGroup(
            pnlRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRadioButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celsiusBtn)
                    .addComponent(fahrBtn))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRadioButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTemp)
                            .addComponent(btnConvert))
                        .addGap(58, 58, 58)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput)
                            .addComponent(txtOutput))))
                .addGap(32, 32, 32))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemp)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(pnlRadioButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/celsius.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed
//Fahrenheit
    private void fahrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fahrBtnActionPerformed
        lbTitle.setText("Converting Fahrenheit to Celsius");
        lblTemp.setText("Temperature in Fahrenheit");
        btnConvert.setText("Convert to Celsius");
        txtInput.setText("");
        txtOutput.setText("");
        jLabel2.setIcon(fahrenheitIcon);
    }//GEN-LAST:event_fahrBtnActionPerformed
// celsius
    private void celsiusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celsiusBtnActionPerformed
        lbTitle.setText("Converting Celsius to Fahrenheit");
        lblTemp.setText("Temperature in Celsius");
        btnConvert.setText("Convert to Fahrenheit");
        txtInput.setText("");
        txtOutput.setText("");
        jLabel2.setIcon(celsiusIcon);
    }//GEN-LAST:event_celsiusBtnActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        // a. take the text from the user and convert it into double 
        String inputText = txtInput.getText();
        double temp = Double.parseDouble(inputText);
        double result;
        if (celsiusBtn.isSelected()) {
            Celsius celsius = new Celsius(temp);
            result = celsius.getTempInFahr();
            txtOutput.setText(String.format("%.2f°F", result));
        } else if (fahrBtn.isSelected()) {
            Fahrenheit fahrenheit = new Fahrenheit(temp);
            result = fahrenheit.getTempInCelsius();
            txtOutput.setText(String.format("%.2f°C", result));
        }
    }//GEN-LAST:event_btnConvertActionPerformed

    private void txtInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputFocusGained
        txtInput.setText("");
        txtOutput.setText("");
    }//GEN-LAST:event_txtInputFocusGained

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JRadioButton celsiusBtn;
    private javax.swing.JRadioButton fahrBtn;
    private javax.swing.ButtonGroup group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlRadioButtons;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
