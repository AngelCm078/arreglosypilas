package arreglosypilas;

public class Pilas {
    
    private int aleatorio, n = 0, alm;
    private final Object[] pilaarreglo;
    
    
    // Metodo Constructor
    public Pilas(int cant){
        pilaarreglo = new Object[cant];
    }   
    
    // Metodo insertarDato, valida si se tiene espacio para agregar datos a la pila,
    // y si se puede, los agrega.
    public void insertarDato(Object num){
        if(n == pilaarreglo.length){
            System.out.println("Pila completa");
        }
        else{
            pilaarreglo[n++] = num;
            System.out.println("Un Dato Agregado.");
        }
    }
    
    public int aleatorio(){        
        aleatorio = (int)(Math.random()*100+1);        
        return aleatorio;
    }
    
    public int tamano(){
        return n;
    }  
    
    public void eliminar(){
        if(n == 0){
            System.out.println("Sin elementos en la Pila");
        }
        else{
            pilaarreglo[n--] = null;
            System.out.println("Se elimino un dato");
        }
    }
    
    public void almacenamiento(){
        if(n == pilaarreglo.length){
            System.out.println("Pila completa");
        }
        else{
            alm = pilaarreglo.length - n;
            if(alm == 1){
                System.out.println("Queda un espacio disponible en la Pila");
            }
            else{
                System.out.println("Quedan " + alm + " espacios disponibles en la Pila");
            }            
        }
    }
}
