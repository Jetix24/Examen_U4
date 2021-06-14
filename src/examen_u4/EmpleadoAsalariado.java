/*
Es un clase Java en donde se obtendran los valores que se mostraran el el JFrame
 */
package examen_u4;

// Se importan las clases javax.swing.JLabel y javax.swing.JOptionPane
import javax.swing.JLabel;
import javax.swing.JOptionPane;

// Se crea la clase EmpleadoAsalariado que heredara de la clase abstracta llamada Empleado
public class EmpleadoAsalariado extends Empleado{

    // Se crea un variable global que servira para guardar el nombre completo del empleado
    private String nombre;
    
    // Se crea el método costructor EmpleadoAsalariado que utiliza las varaible heredadas de Empleado para utilizarlas como argumento
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
    }
    // Se utiliza el override ya que es un método creado en la interfaz y despues modficado en la clase empleado y finlamente aqui se esta modificando
    @Override
    // Se modifica el método Pagar y se le asigna un valor a la variable totalem con un JOption
    public double Pagar() {
        double totalem = Double.parseDouble(JOptionPane.showInputDialog(null, new JLabel("Ingresa el sueldo de "+ nombre),"Datos de la factura",3));
        return  totalem;
    }
    // Se crea el método Nombre que asignara valores a las variable primerNombre y apellidoPaterno, depues se concatenan en la variable nombre
    public String Nombre(){
        primerNombre = JOptionPane.showInputDialog(null, new JLabel("Ingresa el primer nombre del empleado"),"Datos del empleado",3); 
        apellidoPaterno = JOptionPane.showInputDialog(null, new JLabel("Ingresa el apellido paterno de " + primerNombre),"Datos del empleado",3); 
        nombre = primerNombre + " " + apellidoPaterno;      
        return nombre ;
    }
    // Se crea el método NumeroSeguroSocial en donde se le asigna el valor a variable numeroSeguroSocial
    public String NumeroSeguroSocial(){
        numeroSeguroSocial= JOptionPane.showInputDialog(null, new JLabel("Ingresa el No. de Seguro social de " + nombre),"Datos del empleado",3); 
        return numeroSeguroSocial ;
    }
}
