public class Main {

    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(10, 20, 30);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.ponerPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class coche {
    public int puertas = 4;
    public void ponerPuerta(){
        this.puertas++;
    }
        }