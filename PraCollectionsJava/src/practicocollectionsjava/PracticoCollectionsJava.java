/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;
import java.util.*;
/**
 *
 * @mirtha Usuario
 */
public class PracticoCollectionsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<clientes> Tipoclientes = new ArrayList<>();
        //Set <clientes> Tipoclientes=new HashSet<clientes>();
        //LinkedList<clientes> Tipoclientes = new LinkedList<>();
        
        
//        alumnos CL1= new clientes ("javier ", 454666454, "b vargas");
//        alumnos CL2= new clientes ("Exequiel", 45363653, "b centro");
//        
//        
//        
//        Tipoclientes.add(CL1);
//        Tipoclientes.add(CL2);
        
        
//        for (clientes obj : Tipoclientes)
//        System.out.println(obj.getNombre());
        
        
//        for ( clientes : Tipoclientes) {
//
//            System.out.println(clientes.getNombre()+ " " + clientes.getDNI() + " "
//            + clientes.getdireccion());
//            
//        }
        
//        System.out.println(Tipoclientes);
//        
//        ListIterator<clientes> ite = Tipoclientes.listIterator(); 
//        
//        ite.next();
//        ite.add(CL2);
//        Tipoclientes.forEach(obj -> System.out.println(obj));
        
        
        Set<Clientes> players = new TreeSet<>(Comparator.reverseOrder());
        
        Clientes CL1= new Clientes ("mirtha vargas", 14666555, "b centro");
        Clientes CL2= new Clientes ("eduardo bazan", 12323456, "b quebrada");
        
        players.add(CL1);
        players.add(CL2);
        
        players.forEach(obj -> System.out.print(obj));
        
    }
    
    }
    

