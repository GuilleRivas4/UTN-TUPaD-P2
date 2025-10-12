
package trabajopractico6_1;

import java.util.ArrayList;

public class TrabajoPractico6 {

    
    public static void main(String[] args) {
        
        Producto manzana = new Producto("1", "Manzana", 500, 10, CategoriaProducto.ALIMENTOS);
        Producto banana = new Producto("2", "Banzana", 300, 7, CategoriaProducto.ALIMENTOS);
        Producto television = new Producto("5", "Television", 3000, 16, CategoriaProducto.ELECTRONICA);
        Producto cocina = new Producto("9", "Cocina", 2300, 3, CategoriaProducto.HOGAR);
        Producto remera = new Producto("15", "Remera", 14, 13, CategoriaProducto.ROPA);
        
        Inventario inventario = new Inventario();
        inventario.agregarProductos(manzana);
        inventario.agregarProductos(banana);
        inventario.agregarProductos(television);
        inventario.agregarProductos(cocina);
        inventario.agregarProductos(remera);
        
        System.out.println("Listando todos los productos del inventario");
        System.out.println("************************");
        inventario.listarProductos();
        System.out.println("************************");
        
        System.out.println("Buscando por ID");
        System.out.println("************************");
        Producto producto5 = inventario.buscarProductoPorId("5");
        producto5.mostrarInfo();
        System.out.println("************************");
        
        
        System.out.println("Filtrando por categoria");
        System.out.println("************************");
        ArrayList<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto alimento : alimentos) {
            alimento.mostrarInfo();
        }
        System.out.println("************************");
        
        System.out.println("Eliminado y listando");
        System.out.println("************************");
        inventario.eliminarProducto("15");
        inventario.listarProductos();
        System.out.println("************************");
        
        System.out.println("Actualizando stock");
        System.out.println("************************");
        inventario.actualizarStock("1", 30);
        inventario.listarProductos();
        System.out.println("************************");
        
        System.out.println("Mostrando stock total");
        System.out.println("************************");
        inventario.obtenerTotalStock();
        System.out.println("************************");
        
        System.out.println("Filtrando productos con precios entre $1000 y $3000");
        System.out.println("************************");
        ArrayList<Producto> productosEntrePrecios = inventario.filtrarPorPrecio(1000, 3000);
        for (Producto producto : productosEntrePrecios) {
            producto.mostrarInfo();
        }
        System.out.println("************************");
        
        System.out.println("Mostrando las categorias");
        System.out.println("************************");
        inventario.mostrarCategoriasDisponibles();
        System.out.println("************************");
        
        
    }

}
