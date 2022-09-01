/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebac
 */
public class Producto implements IProducto {

    private String nombreDeProducto;
    private Comparable CodProducto;
    private int Precio;
    private int Stock;

    public Producto(String nombreDeProducto, Comparable CodProducto, int Precio, int Stock) {
        this.nombreDeProducto = nombreDeProducto;
        this.CodProducto = CodProducto;
        this.Precio = Precio;
        this.Stock = Stock;
    }
    
    @Override
    public Comparable getCodProducto() {
        return this.CodProducto;
    }

    @Override
    public Integer getPrecio() {
        return this.Precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.Precio = precio;
    }

    @Override
    public Integer getStock() {
        return this.Stock;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        this.Stock += stock;
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        if (this.Stock >= stock){
            this.Stock -= stock;
        } else {
            this.Stock = 0;
        }
    }

    @Override
    public String getNombre() {
        return this.nombreDeProducto;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombreDeProducto = nombre;
    }
    
}
