import java.awt.*;

public class Persona {
    String nombre;
    Point posicion;
    double velocidadX;
    double velocidadY;

    public Persona(String nombre, Point posicion, double velocidadX, double velocidadY) throws MalformedPersonaException {
        this.nombre = nombre;
        this.posicion = posicion;
        this.setVelocidadX(velocidadX);
        this.setVelocidadY(velocidadY);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public double getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(double velocidadX) throws MalformedPersonaException{
        if(Math.abs(velocidadX) < 30)
            this.velocidadX = velocidadX;
        else
            throw new MalformedPersonaException("Velocidad excesiva");
    }

    public double getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(double velocidadY) throws MalformedPersonaException {
        if(Math.abs(velocidadY) < 30)
            this.velocidadY = velocidadY;
        else
            throw new MalformedPersonaException("Velocidad excesiva");    }

    public void actualizaPosicion(Dimension panelSize) {
        int x = (int)(this.posicion.getX() + this.velocidadX);
        int y = (int)(this.posicion.getY() + this.velocidadY);
        this.posicion = new Point(x,y);
        if(x>panelSize.getWidth() || x < 0)
            this.velocidadX = -this.velocidadX;
        if(y>panelSize.getHeight() || y < 0)
            this.velocidadY = -this.velocidadY;

    }
}