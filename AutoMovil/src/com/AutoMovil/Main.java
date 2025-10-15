
package com.AutoMovil;

//author EdwinDeLosSantos

public class Main {
    
    //METODO PRINCIPAL 
      public static void main(String[] args) {
        
        // ========== DEMOSTRACIÓN DE LA CLASE AUTOMOVIL ==========
        System.out.println("=== Creando AutoMovil ===");
        
        // Crear una instancia de AutoMovil (clase padre)
        AutoMovil autoGeneral = new AutoMovil("Toyota", "Corolla", 2022, 25000);
        
        // Mostrar información del automóvil genérico
        autoGeneral.mostrarInformacion();
        
        // Probar el método acelerar de la clase padre
        autoGeneral.acelerar();
        
        // ========== DEMOSTRACIÓN DE LA CLASE HONDACIVIC ==========
        System.out.println("\n=== Creando HondaCivic ===");
        
        // Crear una instancia de HondaCivic (clase hija) - versión híbrida
        HondaCivic miCivic = new HondaCivic(2023, 28000, "Touring", true);
        
        // Probar método sobrescrito - mostrar información extendida
        miCivic.mostrarInformacion();
        
        // Probar método sobrescrito - acelerar con comportamiento específico
        miCivic.acelerar();
        
        // Probar método específico de HondaCivic
        miCivic.activarModoEco();
        
        // ========== DEMOSTRACIÓN DE HERENCIA ==========
        System.out.println("\n=== Usando métodos de la clase padre ===");
        
        // Los métodos de la clase padre están disponibles en la clase hija
        miCivic.encender();  // Método heredado de AutoMovil
        miCivic.frenar();    // Método heredado de AutoMovil
        miCivic.apagar();    // Método heredado de AutoMovil
        
        // ========== DEMOSTRACIÓN DE COMPORTAMIENTO DIFERENTE ==========
        System.out.println("\n=== Probando HondaCivic no híbrido ===");
        
        // Crear otra instancia de HondaCivic - versión no híbrida
        HondaCivic civicNormal = new HondaCivic(2023, 26000, "LX", false);
        
        // Mostrar información - método sobrescrito
        civicNormal.mostrarInformacion();
        
        // Acelerar - comportamiento diferente al ser no híbrido
        civicNormal.acelerar();
        
        // Intentar activar modo ECO - no disponible en versión no híbrida
        civicNormal.activarModoEco();
        
        System.out.println("\n=== Demostración completada ===");
    }
        
    
}
