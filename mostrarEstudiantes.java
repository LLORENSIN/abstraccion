class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        if (this.altura != otroEstudiante.getAltura()) {
            return otroEstudiante.getAltura() - this.altura;
        }
        return this.edad - otroEstudiante.getEdad();
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " - Edad: " + edad;
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Patri", 12, 170),
            new Estudiante("Manuel", 43, 173),
            new Estudiante("Javier", 72, 189),
            new Estudiante("Alicia", 52, 168),
            new Estudiante("Alberto", 35, 189)
        };

        System.out.println("Estudiantes sin ordenar:");
        mostrarEstudiantes(estudiantes);

        Arrays.sort(estudiantes);

        System.out.println("Estudiantes ordenados:");
        mostrarEstudiantes(estudiantes);
    }

    public static void mostrarEstudiantes(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println((i + 1) + ". " + estudiantes[i]);
        }
    }
}
