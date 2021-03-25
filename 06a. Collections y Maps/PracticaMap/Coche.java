public class Coche {
    String marca;
    String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
