package uia.ingenieriaSoftware.Modelo;


public class Item {
    private  String nombre;
    private  Integer cantidad;
    private  String id;

    public Item(String nombre, Integer cantidad, String id) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.id = id;
    }

    public Item() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", id=" + id +
                '}';
    }
}
