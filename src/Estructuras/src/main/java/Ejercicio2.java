import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    static List<Double> alturas= new ArrayList<>();

    public static void main(String[] args) {
        int numAlmunos= numeroAlumnos();
        double media;
        int alumnosSuperior;
        int alumnosInferior;
        leerAlturas(numAlmunos);
        media = media();
        alumnosSuperior = calcularAlumnosAlturaSuperior(media);
        alumnosInferior = calcularAlumnosAlturaInferior(media);
        System.out.printf("La media es de %f %n", media);
        System.out.printf("Hay %d alumnos con altura mayor a la media %f %n", alumnosSuperior, media);
        System.out.printf("Hay %d alumnos con altura menor a la media %f %n", alumnosInferior, media);
    }
    public static int numeroAlumnos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de alumnos");
        return teclado.nextInt();
    }
    public static void leerAlturas(int cuantas){
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduce %d alturas: %n", cuantas);
        for (int i = 0; i < cuantas; i++) {
            alturas.add(teclado.nextDouble());
        }
    }
    public static double media(){
        double total= 0;
        for (Double altura: alturas){
            total += altura;
        }
        return total / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(Double media){
        int cuantos = 0;
        for (Double altura: alturas){
            if (altura > media) cuantos++;
        }
        return cuantos;
    }
    public static int calcularAlumnosAlturaInferior(Double media){
        int cuantos = 0;
        for (Double altura: alturas){
            if (altura < media) cuantos++;
        }
        return cuantos;
    }
}
