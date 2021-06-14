/*
 Se utiliza otra JFrame para mostrar los datos obtenidos de la clase EmpleadoAsaliariado
 */
package examen_u4;
 
// Se importa la clase java.awt.Color
import java.awt.Color;

//Se crea la clase Empleados_JF que hereda de javax.swing.JFrame
public class Empleado_JF extends javax.swing.JFrame {

    // Se crea el constructor de Empleado_JF que tiene distintos argumentos
    public Empleado_JF(String Nombre, String No_SS, double sueldo) {
        // Se utliza el método initCompomenets que instancia cada uno de los componentes del JFrame
        initComponents();
          // Se agregan el titulo y el color del fondo
        this.setTitle("Sueldo");
        this.getContentPane().setBackground(Color.black);
        // Se iguala los datos obtenidos de la clase EmpleadoAsaliariado con los TxtField
        this.Txt_Nombre.setText(Nombre);
        this.Txt_No_SS.setText(No_SS);
        String sueldos = String.valueOf(sueldo);
        this.Txt_Sueldo.setText(sueldos);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ti_Sueldo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        No_SS = new javax.swing.JLabel();
        Sueldo = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        Txt_No_SS = new javax.swing.JTextField();
        Txt_Sueldo = new javax.swing.JTextField();
        Btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ti_Sueldo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Ti_Sueldo.setForeground(new java.awt.Color(124, 221, 206));
        Ti_Sueldo.setText("Sueldo");

        Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(204, 0, 204));
        Nombre.setText("Nombre");

        No_SS.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        No_SS.setForeground(new java.awt.Color(204, 0, 204));
        No_SS.setText("No. de Seguro social");

        Sueldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Sueldo.setForeground(new java.awt.Color(204, 0, 204));
        Sueldo.setText("Sueldo");

        Txt_Nombre.setEditable(false);
        Txt_Nombre.setBackground(new java.awt.Color(255, 153, 255));
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 153)));
        Txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_NombreActionPerformed(evt);
            }
        });

        Txt_No_SS.setEditable(false);
        Txt_No_SS.setBackground(new java.awt.Color(255, 153, 255));
        Txt_No_SS.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 153)));

        Txt_Sueldo.setEditable(false);
        Txt_Sueldo.setBackground(new java.awt.Color(255, 153, 255));
        Txt_Sueldo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 153)));

        Btn_Salir.setBackground(new java.awt.Color(153, 0, 0));
        Btn_Salir.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir.setText("Salir");
        Btn_Salir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(No_SS)
                            .addComponent(Nombre)
                            .addComponent(Sueldo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txt_Nombre)
                            .addComponent(Txt_No_SS)
                            .addComponent(Txt_Sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Ti_Sueldo)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Ti_Sueldo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_SS)
                    .addComponent(Txt_No_SS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sueldo)
                    .addComponent(Txt_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_NombreActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        // Al pulsar el botón Salir se acaba el programa
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Empleado_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado_JF("","",0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel No_SS;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Sueldo;
    private javax.swing.JLabel Ti_Sueldo;
    private javax.swing.JTextField Txt_No_SS;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Sueldo;
    // End of variables declaration//GEN-END:variables
}
