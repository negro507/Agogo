
import java.util.ArrayList;
import java.util.List;

public class Productos {
    private int id;
    private String nombre;
    private double valorCompra;
    private int cantidad;
    private double ganancia;
    
    public Productos(){}

    // Constructor
    public Productos(int id, String nombre, double valorCompra, int cantidad, double ganancia) {
        this.id = id;
        this.nombre = nombre;
        this.valorCompra = valorCompra;
        this.cantidad = cantidad;
        this.ganancia = ganancia;  // Calculamos la ganancia
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
}

    

