package dir;

import dir.Cliente;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class Directorio {

    //LISTA DE DIRECTORIO
    TreeMap<Long, Cliente> directorio = new TreeMap<>();

    public boolean agregarCliente(long telefono, Cliente cliente) {
        if (!directorio.containsKey(telefono)) {
            directorio.put(telefono, cliente);
            return true;
        } else {
            return false;
        }
    }

    public Cliente buscarCliente(long telefono) {
        return directorio.get(telefono);
    }

//SET NO TIENE DUPLICADOS
    public Set<Long> buscarTelefonos(String apellido) {
        HashSet<Long> telefonos = new HashSet<>();   //lista de retorno con los telefonos
        Set<Long> claves = directorio.keySet();             //obtener conjunto de claves(telefonos)
        Iterator it = claves.iterator();                               //conjunto de telefono, se recorren de a 1
        while (it.hasNext()) {
            long tel = (Long) it.next();                              //casteo para que devuelva un long
            Cliente cliente = directorio.get(tel);              //a partir del telefono obtener el cliente
            if (cliente.getApellido().equals(apellido)) {     // agrego a la lista los telefonos de los clientes que cumplan con el apellido pedido tefenos
                telefonos.add(tel);
            }
        }
        return telefonos;
    }

    public Set<Cliente> buscarClientes(String ciudad) {
        HashSet<Cliente> clientesC = new HashSet<>();
        Set<Long> claves = directorio.keySet();
        Iterator it = claves.iterator();
        while (it.hasNext()) {
            long cl = (Long) it.next();
            Cliente cliente = directorio.get(cl);
            if (cliente.getCiudad().equals(ciudad)) {
                clientesC.add(cliente);
            }
        }
        return clientesC;
    }

    public Cliente borrarCliente(long tel) {
        Cliente clienteABorrar = directorio.remove(tel);

        if (clienteABorrar != null) {
            JOptionPane.showMessageDialog(null, "Cliente Borrado");
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún cliente con el telefono ingresado");
        }

        return clienteABorrar;
    }
}
