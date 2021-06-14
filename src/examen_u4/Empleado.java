/*
 Una clase abstracta en donde no se puede instanciar por lo tanto no ´puede llamar, entonces se debe heredar para utilizar sus métodos
 */
package examen_u4;

// Se crea la clase abstracta Empleado y que implementa los métodos de PorPagar
public abstract class Empleado implements PorPagar{
    
    // Se crean las variable globales de la clase
    String primerNombre; 
    String apellidoPaterno;
    String numeroSeguroSocial;

    // Se crea el constructor llamado Empleado y se asignan los valores como argumentos
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
     // Se utiliza el override ya que es un método creado en la interfaz y aquí se esta modificando
     @Override
     // Se crea el método abstracto Pagar que regresara un valor de tipo double
     abstract public double Pagar();
}
