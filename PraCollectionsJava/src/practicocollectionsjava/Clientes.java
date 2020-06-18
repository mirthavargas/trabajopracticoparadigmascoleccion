/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicocollectionsjava;

import java.util.Objects;

/**
 *
 * @mirtha Usuario
 */
public class Clientes implements Comparable<Clientes>{

    public Clientes(String nombre, Integer DNI, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
    }
    
    
    private String nombre;
    
    private Integer DNI;
    
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "clientes{" + "nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + '}';
    }

    @Override
    public int compareTo(Clientes o) {
        
        if (this.getDNI() <o.getDNI())
            
            return -1;
        
        else if (this.getDNI() >o.getDNI() )
            
            return 1;
        
        else 
            
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }

     
    

   
    
    
}
