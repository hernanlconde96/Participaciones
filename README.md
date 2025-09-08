```mermaid
classDiagram
    class Circulo2D {
        - double x
        - double y
        - double radio
        + Circulo2D()
        + Circulo2D(x: double, y: double, radio: double)
        + getX(): double
        + setX(x: double): void
        + getY(): double
        + setY(y: double): void
        + getRadio(): double
        + setRadio(radio: double): void
        + getArea(): double
        + getPerimetro(): double
        + contiene(px: double, py: double): boolean
    }
