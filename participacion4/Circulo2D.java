package part4;

public class Circulo2D {
    private double x;
    private double y;
    private double radio;

   
    public Circulo2D(double x, double y, double radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

   
    public Circulo2D() {
        this.x = 0;
        this.y = 0;
        this.radio = 1;
    }

   
    public double getArea() {
        return Math.PI * radio * radio;
    }

   
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

  
    public boolean contiene(double px, double py) {
        double distancia = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distancia <= radio;
    }

   

    
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
