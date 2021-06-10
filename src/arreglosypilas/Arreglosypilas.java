package arreglosypilas;

import java.util.Stack;

public class Arreglosypilas {
    
    public static void main(String[] args) {
        
        //1. Crear una Clase en java que permita definir una pila construida a 
        //   partir de un arreglo. Adicionar un metodo que permita mostrar 
        //   cuantos datos se pueden agregar a la pila o si ya está llena...
        
        
        // - Crear un objeto de esta clase con un tamaño de 9.
        Pilas miPila = new Pilas(9);
        
        
        // - Apilar 5 valores numericos aleatorios.
        for(int i=0; i<5; i++)
        {
            miPila.insertarDato(miPila.aleatorio());
        }
        
        // - Mostrar el tamaño actual de la pila.       
        
        System.out.println("Datos en la Pila: " + miPila.tamano());
        
        // - Borrar un dato.
        
        miPila.eliminar();
        
        // - Indicar nuevamente el tamaño actual.
       
        System.out.println("Datos en la Pila: " + miPila.tamano());
        
        // - Enseñar la cantidad de datos que se pueden agregar a la pila o si 
        // ya esta llena.
        
        miPila.almacenamiento();
        
        
        
        //2. en JAVA, utilizar la clase Stack, para crear dos nuevas pilas, 
        //   agregar 7 datos a la primera pila. La segunda pila deberá contener
        //   los mismos datos de la primera, pero en orden inverso.
        
        Stack pila1 = new Stack();
        Stack pila2 = new Stack();
        
        // Agregando 7 datos a la pila, uno a uno
        /*
        pila1.push(miPila.aleatorio());
        pila1.push(miPila.aleatorio());
        pila1.push(miPila.aleatorio());
        pila1.push(miPila.aleatorio());
        pila1.push(miPila.aleatorio());
        pila1.push(miPila.aleatorio());
        pila1.push(miPila.aleatorio());
        */
        
        // Agregando 7 datos a la pila, Con un ciclo for
        for(int i = 0; i<7; i++){
            pila1.push(miPila.aleatorio());
        }
        
        // imprimiendo datos de la Pila1        
        for(int i = 0; i<pila1.size(); i++){              
            System.out.println("Pila1 -> dato "+(i+1)+": "+pila1.get(i));            
        }  
        
        for(int i = 0; i<7; i++){   
            
            pila2.push(pila1.pop());                      
        } 
        System.out.println("-------------------------------------------");
        
        // imprimiendo datos de la Pila2        
        for(int i = 0; i<pila2.size(); i++){              
            System.out.println("Pila2 -> dato "+(i+1)+": "+pila2.get(i));            
        } 
    }
    
}
