
package com.AutoMovil;

 //@author EdwinDeLosSantos

//La clase AutoMovil representa un automovil generico. 
public class AutoMovil {
    
    //ATRIBUTOS
    
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    
    //Constructor por defecto que imprime el nombre de la clase al crearse una instancia.
    
    public AutoMovil() {
        System.out.println("Constructor de AutoMovil");
    }
    
    /*
    Constructor con parametros
    marca Marca del automovil
    modelo Modelo del automovil
    año Año de fabricacion
    precio Precio del automovil
    */
    
    public AutoMovil(String marca, String modelo, int año, double precio) {
        System.out.println("Constructor de AutoMovil");
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }
    
    //METODOS GETTERS Y SETTERS
    
    /*
    Getter para la marca
    return La marca del automovil
    */
    public String getMarca() {
        return marca;
    }
    
    /*
    Setter para la marca
    return La nueva marca del automovil
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /*
    Getter para el modelo
    return El modelo del automovil
    */
    public String getModelo() {
        return modelo;
    }
    
    /*
    Setter para el modelo
    return El nuevo modelo del automovil
    */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /*
    Getter para el año
    return El año de fabricacion
    */
    public int getAño() {
        return año;
    }
    
    /*
    Setter para el año
    return El  nuevo año de fabricacion
    */
    public void setAño(int año) {
        this.año = año;
    }
    
    /*
    Getter para el precio
    return El precio del automovil
    */
    public double getPrecio() {
        return precio;
    }
    
    /*
    Setter para el precio
    Guarda el nuevo precio del autmovil
    */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //METODOS DE LA CLASE
    
    //Metodo para enceder el automovil
    public void encender() {
        System.out.println("El automovil esta encendido.");
    }
    
    //Metodo para apagar el automovil
    public void apagar() {
        System.out.println("El automovil esta apagado.");
    }
    
    //Metodo para acelerar el automovil
    public void acelerar() {
        System.out.println("El automovil esta acelerando...");
    }
    
    //Metodo para frenar el automovil
    public void frenar(){
        System.out.println("El automovil esta frenando...");
    }
    
    //Metodo para mostrar la informacion del automovil
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio: $" + precio);
    }
    
    
    
}
