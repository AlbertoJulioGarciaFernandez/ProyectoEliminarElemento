package proyectoeliminarelemento;
/**
 *  **PRO (UT6) - Ejercicios**
 * 5.- Eliminar: Suponiendo una clase Miarray que tiene el atributo arrayEnteros 
 * (creado en un constructor de la clase), diseñar un método eliminarelemento que 
 * el elemento del array que esté en la posición indicada por el índice sea 
 * eliminado. El programa deberá informar si el cambio se ha podido realizar, para 
 * eliminar un elemento desplazar los valores de los vectores.
 * 
 * @author Alberto Julio García Fernández
 */
public class MiArray {
    private int[] arrayEnteros;        
    
    /*Definición de un constructor no parametrizado, en el cual creamos el objeto 
    entero arrayEnteros de la clase Array, y que tiene 5 elementos:*/
    MiArray(){
        arrayEnteros=new int[]{1,2,3,4,5};        
    }
    
    /**
     * 
     * @return arrayEnteros Objeto de clase Array de elementos enteros
     */
    public int[] getArrayEnteros() {
        return arrayEnteros;
    }        
    
    /**
     * 
     * @param pos La posición del elemento que se desea eliminar
     */
    public void eliminarElemento(int pos){
        int n;
        
        System.out.println("El array actualmente es el siguiente:");
        for(n=0;n<arrayEnteros.length;n++){
            System.out.println("Posición "+(n+1)+"-> "+arrayEnteros[n]);
        }
        
        System.out.println("A continuación, se procederá a la eliminación del "
                + "elemento localizado en la posición "+pos+", es decir, el "
                + "número "+arrayEnteros[pos-1]);
        
        /*Cuando la/el usuari@ haya introducido la posición, se procederá a 
        substituir el contenido de esa posición con un cero, eliminándose como 
        consecuencia ese elemento:*/
        arrayEnteros[pos-1]=0;
        
        System.out.println("El array ha quedado así:");
        for(n=0;n<arrayEnteros.length;n++){
            System.out.println("Posición "+(n+1)+"-> "+arrayEnteros[n]);
        }
    }
}
