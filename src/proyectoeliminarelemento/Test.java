package proyectoeliminarelemento;
import java.util.Scanner;
/**
 * @author Alberto Julio García Fernández
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc;
        sc=new Scanner(System.in);
        int posicion;
        
        MiArray objArray;
        objArray=new MiArray();
        
        System.out.println("\t**ELIMINAR ELEMENTO DE ARRAY**");                
        System.out.println("Por favor, introduzca la posición del elemento que "
                + "desea eliminar (nota: el tamaño del array es de "+
                objArray.getArrayEnteros().length+" números enteros");
        
        posicion=sc.nextInt();
        while(posicion<1 || posicion>objArray.getArrayEnteros().length){
            System.out.println("Error, posición incorrecta");
            System.out.println("Por favor, introduzca la posición del elemento que "
                + "desea eliminar (nota: el tamaño del array es de "+
                objArray.getArrayEnteros().length+" números enteros");
        
                posicion=sc.nextInt();            
        }
        
        objArray.eliminarElemento(posicion);
    } 
}
