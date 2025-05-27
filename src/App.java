public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Instructions
Trabajas para una tienda de informática y te encargan crear una base de datos para los nuevos ordenadores que van llegando.
Necesitas crear el objeto Ordenador, con sus atributos correspondientes: marca, modelo, memoria RAM, capacidad del disco duro, precio ... etc (cantidad y tipo de  atributos a tu gusto, pero poner al menos 3).
Debes añadir el método constructor, los getters y setters y el toString(). Recuerda no hacer copiar y pegar, ni buscar ningún método de generación de código automático. Hay que pensar y practicar, al menos por hoy!
Siéntete libre de modificar el toString a tu gusto.
Una vez definida la clase del ordenador, crea al menos 3 instancias y prueba a imprimir los objetos en dos maneras:
1. Todas sus características
2. Imprime solo características sueltas como la marca y el precio del ordenador elegido.
3. Probar a cambiar una propiedad y volver a mostrarla.
+EXTRA: para quien ya conozca la creación de clases en Java, que pruebe a crear métodos en la clase Ordenador, como por ejemplo el método oferta: le pasas un descuento como parámetro y te calcula el nuevo precio
+EXTRA: incluye un boolean como "disponibilidad". Cómo pasarías el valor true o false al string "hay disponibles" o "no hay disponibles?"

*/
        Ordenador ordenador1 = new Ordenador(1, "HP", "Pavilion 15", 16, "Intel i5", 4, 512, "SSD", 5, 699.99);
        Ordenador ordenador2 = new Ordenador(2, "Lenovo", "ThinkPad T14", 32, "Intel i7", 8, 1024, "SSD", 3, 1199.49);
        Ordenador ordenador3 = new Ordenador(3, "Asus", "ROG Strix", 64, "AMD Ryzen 9", 12, 2048, "SSD", 2, 1899.95);

        ordenador1.setDisponibilidad(ordenador1.getCantidad() > 0);
        ordenador2.setDisponibilidad(ordenador2.getCantidad() > 0);
        ordenador3.setDisponibilidad(ordenador3.getCantidad() > 0);

        System.out.println("Ordenador No. 1");
        System.out.println(ordenador1);
        System.out.println("Ordenador No. 2");
        System.out.println(ordenador2);
        System.out.println("Ordenador No. 3");
        System.out.println(ordenador3);

        System.out.println("Modificar el segundo Ordenador");
        ordenador2.setMarca("Dell");
        ordenador2.setModelo("XPS 15");
        ordenador2.setMemoriaRam(64);
        ordenador2.setProcesador("Intel i9");
        ordenador2.setNucleos(12);
        ordenador2.setCapacidadDisco(2048);
        ordenador2.setTipoDisco("SSD");
        ordenador2.setCantidad(4);
        ordenador2.setPrecio(2499.99);
        ordenador2.setDisponibilidad(ordenador2.getCantidad() > 0);

        System.out.println("Mostrar Ordenador No. 2 Actuslizado");
        System.out.println(ordenador2);

        System.out.println("Aplicar Oferta al ordenador No. 3");
        ordenador3.aplicarOferta(10);

        System.out.println("Ordenador No.2 con oferta aplicada");
        System.out.println(ordenador3);

    }
}
