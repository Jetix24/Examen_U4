/*
Es la clase main que asiganara los datos de la empresa y del cliente asi como el costo de los productos
 */

// Se enecuentra en el pequete examen_u4
package examen_u4;

// Importa las clases java.awt.Color, javax.swing.JLabel, javax.swing.JOptionPane y javax.swing.UIManager
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

// Se crea la clase PruebaInterfazPorPagar que es la clase uqe tiene el método main
public class PruebaInterfazPorPagar {

    // Se crea un variable global tipo int para utilizarla con mayor facilidad en otra clase
    public static int productos;

    // El método main
    public static void main(String[] args) {
        // Se crea el objeto Ul de la clase UIManager para asignar los colores a los JOptions
        UIManager UI=new UIManager();
        // Se crea las varaibles para asginar valores
        String empresa, fecha, nombre, direccion, correo,telefono,No_Fac ;  

        // Se utiliza el método put de UI para asginar un color
        UI.put("OptionPane.background", Color.green); 
        UI.put("Panel.background", Color.green); 
        
            // Se da valores a cada variable por medio de un JOption
            empresa = JOptionPane.showInputDialog(null, new JLabel("Ingresa el nombre de la empresa"),"Datos de la empresa",3); 
            fecha = JOptionPane.showInputDialog(null, new JLabel("Ingresa la fecha de la factura (DD/MM/AAAA)"),"Datos de la empresa",3); 
            No_Fac= JOptionPane.showInputDialog(null, new JLabel("Ingresa el No. de la factura"),"Datos de la empresa",3);
        
        // Se utiliza el método put de UI para asginar un color
        UI.put("OptionPane.background", Color.CYAN); 
        UI.put("Panel.background", Color.CYAN); 
        
            // Se da valores a cada variable por medio de un JOption
            nombre = JOptionPane.showInputDialog(null, new JLabel("Ingresa la el nombre del cliente"),"Datos del cliente",3); 
            telefono =  JOptionPane.showInputDialog(null, new JLabel("Ingresa el telefono de " +nombre),"Datos del cliente",3);
            direccion = JOptionPane.showInputDialog(null, new JLabel("Ingresa la dirección de " +nombre),"Datos del cliente",3);
            correo = JOptionPane.showInputDialog(null, new JLabel("Ingresa la dirección de correo de " +nombre),"Datos del cliente",3);
        
        // Se utiliza el método put de UI para asginar un color
        UI.put("OptionPane.background", Color.orange); 
        UI.put("Panel.background", Color.orange); 
        
             // Se da valores a la variable productos por medio de un JOption para ver cuantos tipos de productos se van introducir en el codigo
            productos =  Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa la cantidad de productos"),"Datos de la factura",3));

            // Se crea un objeto de la clase Factura_JF llamado Fac para igualar con las variables del costructor de Factura_JF 
            Factura_JF Fac = new Factura_JF(empresa,fecha,No_Fac,nombre,direccion,correo,telefono);  
            // Se utiliza el método setVisible para desplegar el JFrame
            Fac.setVisible(true);
       
       
        
      
    }
    
}
