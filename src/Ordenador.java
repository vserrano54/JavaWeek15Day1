public class Ordenador {
    private int id;
    private String marca;
    private String modelo;
    private int memoriaRam;
    private String procesador;
    private int nucleos;
    private int capacidadDisco;
    private String tipoDisco;
    private int cantidad;
    private double precio;
    private boolean disponibilidad;
    

    public Ordenador(int id, String marca, String modelo, int memoriaRam, String procesador, int nucleos, int capacidadDisco, String tipoDisco, int cantidad, double precio){
        this.id=id;
        this.marca=marca;
        this.modelo=modelo;
        this.memoriaRam=memoriaRam;
        this.procesador=procesador;
        this.nucleos=nucleos;
        this.capacidadDisco=capacidadDisco;
        this.tipoDisco=tipoDisco;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public int getMemoriaRam(){
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam){
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador(){
        return procesador;
    }

    public void setProcesador(String procesador){
        this.procesador = procesador;
    }

    public int getNucleos(){
        return nucleos;
    }

    public void setNucleos(int nucleos){
        this.nucleos = nucleos;
    }

    public int getCapacidadDisco(){
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco){
        this.capacidadDisco = capacidadDisco;
    }

    public String getTipoDisco(){
        return this.tipoDisco;
    }

    public void setTipoDisco(String tipoDisco){
        this.tipoDisco = tipoDisco;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void aplicarOferta(double descuento) {
    if (descuento < 0 || descuento > 100) {
        System.out.println("Descuento inválido. Debe estar entre 0 y 100.");
        return;
    }
        double descuentoAplicado = precio * (descuento / 100);
        precio -= descuentoAplicado;
    }

    @Override
    public String toString() {
    return "Ordenador {" +
           "\n  ID: " + id +
           "\n  Marca: " + marca +
           "\n  Modelo: " + modelo +
           "\n  Memoria RAM: " + memoriaRam + " GB" +
           "\n  Procesador: " + procesador +
           "\n  Núcleos: " + nucleos +
           "\n  Disco: " + capacidadDisco + " GB (" + tipoDisco + ")" +
           "\n  Cantidad: " + cantidad +
           "\n  Precio: $" + precio +
           "\n  Disponible: " + (disponibilidad ? "Sí" : "No") +
           "\n}";
    }



}
