/*
-Primera parte:
Crear una función con tres parámetros que sean
números que se suman entre sí.
Llamar a la función en el main y darle valores.

-Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene
el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        // Primera parte:
        int num1 = 4;
        int num2 = 6;
        int num3 = 3;

        suma(num1, num2, num3);

        // Segunda parte:.
        Coche miCoche = new Coche();
        miCoche.ponerPuerta();
        System.out.println("mi carro tiene " + miCoche.puertas + " puertas");

    }

    public static void suma(int a, int b, int c) {
        int resultado = 0;
        resultado = a + b + c;
        System.out.println("el valor de tu suma es: " + resultado);

    }
}

class Coche {
    public int puertas = 4;

    public void ponerPuerta() {
        this.puertas++;
    }
}