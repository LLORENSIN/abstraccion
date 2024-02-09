import java.util.Arrays;

class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo> {
    private double ancho;
    private double altura;

    public Rectangulo(int numLados, double ancho, double altura) {
        super(numLados);
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return ancho * altura;
    }

    @Override
    public double getPerimeter() {
        return 2 * (ancho + altura);
    }

    @Override
    public void redimensionar(int x) {
        ancho *= x;
        altura *= x;
    }
    @Override
    public int compareTo(Rectangulo otroRectangulo) {
        double diferencia = this.getArea() - otroRectangulo.getArea();
        if (diferencia < 0) {
            return -1;
        } else if (diferencia > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", altura=" + altura + ", area=" + getArea() + "]";
    }
}

public class Rectangulosordenados {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(4, 3, 2);
        Rectangulo rect2 = new Rectangulo(4, 5, 4);
        Rectangulo rect3 = new Rectangulo(4, 2, 2);
        Rectangulo rect4 = new Rectangulo(4, 4, 3);
        Rectangulo rect5 = new Rectangulo(4, 6, 1);
        Rectangulo rect6 = new Rectangulo(4, 2, 5);
        Rectangulo rect7 = new Rectangulo(4, 3, 4);
        Rectangulo rect8 = new Rectangulo(4, 2, 3);
        Rectangulo rect9 = new Rectangulo(4, 1, 6);
        Rectangulo rect10 = new Rectangulo(4, 3, 3);

        Rectangulo[] listaRectangulos = {rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8, rect9, rect10};

        Arrays.sort(listaRectangulos);

        for (Rectangulo rect : listaRectangulos) {
            System.out.println(rect);
        }
    }
}