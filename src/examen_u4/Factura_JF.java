/*
Es un Jframe en donde se mostraran todos los datos recolectados de las clase PruebasInterfazPorPagar y de Factura
 */
package examen_u4;
 
// Importa las clases java.awt.Color, javax.swing.JOptionPane, javax.swing.UIManager y javax.swing.table.DefaultTableModel
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


// Se crea la clase Factura_JF que hereda de javax.swing.JFrame
public class Factura_JF extends javax.swing.JFrame {

    // Se crea el objeto modelo de la clase  DefaultTableModel
    DefaultTableModel modelo = new DefaultTableModel();
    // Se crea el constructor de la clase Factura_JF con las variables como argumentos
    public Factura_JF(String empresa, String fecha, String No_Fac, String nombre, String direccion,String correo, String telefono) {
        // Se utliza el método initCompomenets que instancia cada uno de los componentes del JFrame
        initComponents();
        // Se agregan el titulo y el color del fondo
        this.setTitle("Factura");
        this.getContentPane().setBackground(Color.black);
        // Se manda a llamar el método columnasTable
        columnasTable();
        // Se iguala los datos obtenidos de la clase factura con los TxtField
        this.Txt_Empresa.setText(empresa);
        this.Txt_Fecha.setText(fecha);
        this.Txt_Cliente.setText(nombre);
        this.Txt_Direccion.setText(direccion);
        this.Txt_Correo.setText(correo);
        this.Txt_No_Fac.setText(No_Fac);
        this.Txt_Tel.setText(telefono);
  
    }
    // Se crea el método columnasTable
    private void columnasTable(){   
        // Se crea el objeto pro de la clase Factura
        Factura pro = new Factura(0,"w",0,0);
        // Con el método addColum se agregan los nombres de las columnas
        modelo.addColumn("No. de pieza");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        // Se crea un ciclo for que se repetira hasta que ya no sea menor al valor que tiene productos (variable obtanida de la clase PruebaInterfazPorPagar)
        for (int i=0; i<PruebaInterfazPorPagar.productos;i++ ){
             modelo.addRow(pro.Producto());
        }
            // Se iguala el total obtenido de los productos con Txt_Total que moestrar el resultado
            String totals = String.valueOf(pro.total);
            this.Txt_Total.setText(totals);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Txt_Empresa = new javax.swing.JTextField();
        Txt_Fecha = new javax.swing.JTextField();
        Txt_No_Fac = new javax.swing.JTextField();
        Txt_Cliente = new javax.swing.JTextField();
        Txt_Direccion = new javax.swing.JTextField();
        Txt_Correo = new javax.swing.JTextField();
        Txt_Total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Txt_Tel = new javax.swing.JTextField();
        Btn_Siguiente = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Empresa:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Fecha:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("No. Factura:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Correo:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Total a pagar");

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(modelo);
        jTable1.setSelectionForeground(new java.awt.Color(0, 255, 0));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setBackground(new java.awt.Color(124, 221, 206));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(124, 221, 206));
        jLabel7.setText("Factura ");

        Txt_Empresa.setEditable(false);
        Txt_Empresa.setBackground(new java.awt.Color(102, 255, 102));
        Txt_Empresa.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Empresa.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 0)));
        Txt_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_EmpresaActionPerformed(evt);
            }
        });

        Txt_Fecha.setEditable(false);
        Txt_Fecha.setBackground(new java.awt.Color(102, 255, 102));
        Txt_Fecha.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Fecha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 0)));
        Txt_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_FechaActionPerformed(evt);
            }
        });

        Txt_No_Fac.setEditable(false);
        Txt_No_Fac.setBackground(new java.awt.Color(102, 255, 102));
        Txt_No_Fac.setForeground(new java.awt.Color(0, 0, 0));
        Txt_No_Fac.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 0)));

        Txt_Cliente.setEditable(false);
        Txt_Cliente.setBackground(new java.awt.Color(0, 153, 204));
        Txt_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Cliente.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));

        Txt_Direccion.setEditable(false);
        Txt_Direccion.setBackground(new java.awt.Color(0, 153, 204));
        Txt_Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Direccion.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));

        Txt_Correo.setEditable(false);
        Txt_Correo.setBackground(new java.awt.Color(0, 153, 204));
        Txt_Correo.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Correo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));

        Txt_Total.setEditable(false);
        Txt_Total.setBackground(new java.awt.Color(255, 102, 102));
        Txt_Total.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Total.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Teléfono:");

        Txt_Tel.setEditable(false);
        Txt_Tel.setBackground(new java.awt.Color(0, 153, 204));
        Txt_Tel.setForeground(new java.awt.Color(0, 0, 0));
        Txt_Tel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        Txt_Tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TelActionPerformed(evt);
            }
        });

        Btn_Siguiente.setBackground(new java.awt.Color(255, 204, 0));
        Btn_Siguiente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btn_Siguiente.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Siguiente.setText("Siguiente");
        Btn_Siguiente.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 0)));
        Btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SiguienteActionPerformed(evt);
            }
        });

        Btn_Salir.setBackground(new java.awt.Color(153, 0, 0));
        Btn_Salir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Txt_Cliente)
                                        .addComponent(Txt_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(Txt_No_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Txt_Empresa)
                                        .addComponent(Txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Txt_Direccion))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txt_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_No_Fac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Txt_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_EmpresaActionPerformed

    private void Txt_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_FechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_FechaActionPerformed

    private void Txt_TelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TelActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        // Al pulsar el botón Salir se acaba el programa
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SiguienteActionPerformed
        // Se utiliza el método dispose que cierra el Jframe y sigue con el codigo
        dispose();
        // Se crea el objeto Ul de la clase UIManager para asignar los colores a los JOptions
        UIManager UI=new UIManager();
        // Se utiliza el método put de UI para asginar un color
        UI.put("OptionPane.background", Color.yellow); 
        UI.put("Panel.background", Color.yellow); 
        // Se muestra un  mensaje con el JOption
        JOptionPane.showMessageDialog(null, "Ahora se ingresaran los datos de un empleado ","Aviso",2);
        // Se utiliza el método put de UI para asginar un color
        UI.put("OptionPane.background", Color.MAGENTA); 
        UI.put("Panel.background", Color.MAGENTA); 
        // Se crea el objeto Em de la clase EmpleadoAsalariado  
        EmpleadoAsalariado Em = new EmpleadoAsalariado("","","");
        // Se crea objeto Eo de la clase Empleado_JF que utlizara los métodos de la clase EmpleadoAsalariado como argumentos
        Empleado_JF Eo = new Empleado_JF(Em.Nombre(),Em.NumeroSeguroSocial(), Em.Pagar());  
        // Se usa el método setVisible para que aparezca el JFrame
        Eo.setVisible(true);
    }//GEN-LAST:event_Btn_SiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Factura_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_JF("", "", "","", "","", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Siguiente;
    private javax.swing.JTextField Txt_Cliente;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_Empresa;
    private javax.swing.JTextField Txt_Fecha;
    private javax.swing.JTextField Txt_No_Fac;
    private javax.swing.JTextField Txt_Tel;
    private javax.swing.JTextField Txt_Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
