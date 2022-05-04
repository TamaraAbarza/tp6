
package tp6;

import dir.Directorio;
import dir.Cliente;
import java.util.ArrayList;


public class Tp6 {

    
    public static void main(String[] args) {
       
        Cliente c1 = new Cliente("Pedro","Perez", 123, "San Luis", "calle falsa 123");
        Cliente c2 = new Cliente("Luciano","Cejas",345,"San Luis","direcion123");
        Cliente c3 = new Cliente("Chester","Abarza", 23, "San Luis", "calle falsa 123");
        Cliente c4 = new Cliente("liliana","Perez",34235,"Mendoza","direcion1232");
        Directorio directorio = new Directorio();
        directorio.agregarCliente(12343212, c1);
        directorio.agregarCliente(134553, c2);
        directorio.agregarCliente(1432112, c3);
        directorio.agregarCliente(1321232, c4);
        directorio.agregarCliente(1232, c1);
        System.out.println("Buscar cliente por telefono: ");
        System.out.println(directorio.buscarCliente(12343212).toString());
        System.out.println("Buscar telefonos por apellido Perez: "+directorio.buscarTelefonos("Perez"));
        System.out.println("Buscar cliente por ciudad de San Luis: ");
        System.out.println(directorio.buscarClientes("San Luis"));
    //   System.out.println("Borrar cliente:");
    //    System.out.println(directorio.borrarCliente(1321232).toString());
    //BUSCO CLIENTE QUE NO EXISTE POR TELEFONO 
        System.out.println("busco cliente "+directorio.buscarCliente(11111111));
    }
}
