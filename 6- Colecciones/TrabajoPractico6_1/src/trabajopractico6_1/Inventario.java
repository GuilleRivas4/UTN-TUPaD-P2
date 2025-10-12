

package trabajopractico6_1;

import java.util.ArrayList;


public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario(){
        this.productos = new ArrayList<>();
    }
    
    // Metodo para agregar productos
    public void agregarProductos (Producto p){
       if (p != null) {
           this.productos.add(p);
       }else {
           System.out.println("El producto ingresado no es valido");
       }
   }
   
    // Metodo para listar los productos
    public void listarProductos(){
        for(Producto producto: productos){
            producto.mostrarInfo();
        }
    }
    
    // Metodo para buscar un producto por su ID
    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while (i < this.productos.size() && !this.productos.get(i).getId().equals(id) ){
            i++;
        }
        if (i < this.productos.size()){
            productoEncontrado = this.productos.get(i);
        }
         return productoEncontrado;
    }
    
    // Metodo para eliminar un producto por su ID
    public Producto eliminarProducto(String id){
        Producto producto = this.buscarProductoPorId(id);
        this.productos.remove(producto);
        return producto;
    }
    
    // Metodo para actualizar el stock de un producto por su ID
    public void actualizarStock(String id, int nuevaCantidad){
        Producto producto = this.buscarProductoPorId(id);
        if (producto != null && nuevaCantidad >= 0){
            producto.setCantidad(nuevaCantidad);
        }else {
            System.out.println("La cantidad ingresada no es valida");
        }
    }
    
    // Metodo para filtrar por categoria
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> productosPorCategoria = new ArrayList<>();
        for (Producto producto : productos ) {
            if (producto.getCategoria() == categoria) {
                productosPorCategoria.add(producto);
            }
        }
        return productosPorCategoria;
    }
    
    public void obtenerTotalStock(){
        for (Producto producto : productos ){
            System.out.println("Producto: " + producto.getNombre() + " cantidad: " + producto.getCantidad());
        }
    }
    
    public Producto obtenerProductoConMayorStock(){
        Producto productoConMayorStock = null;
        int MayorStock = 0;
        for (Producto producto : productos) {
            if (producto.getCantidad() > MayorStock){
                MayorStock = producto.getCantidad();
                productoConMayorStock = producto;
            }
        }
        return productoConMayorStock;             
    }
    
    public ArrayList<Producto> filtrarPorPrecio(double min, double max){
        ArrayList<Producto> productosPorPrecio = new ArrayList<>();
        for (Producto producto : productos ) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosPorPrecio.add(producto);
            }
        }
        return productosPorPrecio;
    }
    
    public void mostrarCategoriasDisponibles(){
        System.out.println("Categorias disponibles");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " + categoria + ": " + categoria.getDescripcion());
        }
    }
    
}
