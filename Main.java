/*
 * Primera parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 */
public class Main {

    public static void main(String[] args) {
        // primera parte
        int resultado = 0;
        resultado = suma(5, 9, 3);
        System.out.println("la suma de los numeros es " + resultado);

        // segunda parte
        Coche miCoche = new Coche();
        miCoche.aumentarPuerta();
        System.out.println("La cantidad de puertas de mi coche es " + miCoche.numPuerta);

    }

    // primera parte
    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
/*
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de
 * puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */

class Coche {
    int numPuerta = 4;

    public void aumentarPuerta() {
        this.numPuerta++;
    }
}