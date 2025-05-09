
//Clase creada para guardar los datos y la informacion de la tabla sin que se borren.

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Datoscargados {
    // representar o almacena los datos en una tabla (objeto mt)
    public static DefaultTableModel mt = crearModelo();
    
    
    private static DefaultTableModel crearModelo(){
        DefaultTableModel modelo = new DefaultTableModel(); // se usa para crear el objeto que contendra los datos de la tabla
        modelo.setColumnIdentifiers(new String[]{"ID","Nombre","Valor Compra","Cantidad:","Valor venta"});
        return modelo;
    }   
    
    
}
