
package com.AutoMovil;

// @author EdwinDeLosSantos

//La clase HondaCivic que hereda de AutoMovil
public class HondaCivic extends AutoMovil {
    
    //Atributos adicionales 
    private String version;        //Version del Honda Civic (LX, EX, Touring, etc.)
    private boolean esHibrido;     //Indica si es modelo hibrido o no.
    
    //CONSTRUCTORES
    
    //Constricot por defecto que llama al constructor de la clase padre e imprime el nombre de la clase.
    public HondaCivic() {
        super();    //Llama al construcot de la clase padre AutoMovil.
        System.out.println("Constructor de HondaCivic");
    }
    
    /*
    Constructor con parametros
    año Año del honda Civic
    precio Precio del honda Civic
    version Version del modelo
    esHibrido Indica si es hibrido
    */
    public HondaCivic(int año, double precio, String version, boolean esHibrido) {
        
        //Llama al cosntructor de la clase padre con valores especificos para Honda Civic 
        super("Honda", "Civic", año, precio);
        this.version = version;
        this.esHibrido = esHibrido;
        System.out.println("Constructor de HondaCivic");
        
    }
    
    //GETTERS Y SETTERS ADICIONALES
    
    /*
    Getter para la version
    return La version del Honda Civic
    */
    public String getVersion() {
        return version;
    }
    
    /*
    Setter para la version
    version La nueva version del Honda Civic
    */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /*
    Getter para esHibrido
    return true si es hibrido, flase si no lo es
    */
    public boolean isEsHibrido() {
        return esHibrido;
    }
    
    /*
    Setter para esHibrido
    esHibrido El nuevo valor para esHibrido
    */
    public void setEsHibrido(boolean esHibrido) {
        this.esHibrido = esHibrido;
    }
    
    //METODOS SOBREESCRITOS (OVERRIDE)
    
     /*
     Método acelerar sobrescrito
     Comportamiento diferente dependiendo si es híbrido o no
     */
    @Override
    public void acelerar() {
        if (esHibrido) {
            System.out.println("El Honda Civic híbrido acelera silenciosamente");
        } else {
            System.out.println("El Honda Civic acelera con potencia");
        }
    }
    
    /*
      Método mostrarInformacion sobrescrito
      Muestra información adicional específica del Honda Civic
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase padre
        System.out.println("Versión: " + version + ", Es Híbrido: " + esHibrido);
    }
    
    //METODOS ESPECIFICOS DE HONDA CIVIC
    
    /*
      Método específico para activar el modo ECO
      Solo disponible en versiones híbridas
     */
    public void activarModoEco() {
        if (esHibrido) {
            System.out.println("Modo ECO activado en el Honda Civic");
        } else {
            System.out.println("Esta versión no tiene modo ECO");
        }
    }
            
}

