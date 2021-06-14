/*
Es una clase Java que se encargara de obtener los datos de los productos
 */
package examen_u4;

// Se importan las clases javax.swing.JLabel y javax.swing.JOptionPane
import javax.swing.JLabel;
import javax.swing.JOptionPane;

// Se crea la clase Factura que implementa los métodos de la interfaz PorPagar
public class Factura implements PorPagar {
    
    // Se crea una de las variables que seran utilizadas en el codigo
    public Object[] articulos = new Object[4]; 
    public double total=0 ;
    public int numeroPieza; 
    private final String descripcionPieza;
    private final int cantidad; 
    private final double precioPorArticulo;

    // Se crea el constructor llamado Factura con las varaibles sirviendo como argumentos
    public Factura(int numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }  
    // Se utiliza el override ya que es un método creado en la interfaz y aquí se esta modificando
    @Override
    public double Pagar(){
        return total;
    }
    // Se crea el método Producto que regresara un valor de tipo Object[] que se utilizara para llenar la tabla del JFrame
    public Object[] Producto(){
        // Se va igualando los valor obtenidos de los JOptions con los espacios del arreglo
        articulos[0] = Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa el No. de la pieza"),"Datos de la factura",3));
        articulos[1] = JOptionPane.showInputDialog(null, new JLabel("Ingresa la descripcion de la pieza " +   articulos[0]),"Datos de la factura",3); 
        articulos[2] = Integer.parseInt(JOptionPane.showInputDialog(null, new JLabel("Ingresa la cantidad de la pieza "+ articulos[0]),"Datos de la factura",3));
        articulos[3] = Double.parseDouble(JOptionPane.showInputDialog(null, new JLabel("Ingresa el precio de la pieza " + articulos[0] ),"Datos de la factura",3));     
        
        // Se va guardando la suma que se obtiene al multiplicar el articulos[2] y articulos[3] y se va sumando cada vez que se repite el método
        total = total+(((Number) articulos[2]).doubleValue()*((Number) articulos[3]).doubleValue());
        // Se retorna articulos para ser una variable utilizada en el JFrame
        return articulos;
    }
}
