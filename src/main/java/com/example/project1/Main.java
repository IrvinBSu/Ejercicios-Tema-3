package com.example.project1;

public class Main {
    public static void main (String[] args) {

        suma(10,20,30);

        coche micoche = new coche();
        micoche.IncrementarPuertas();
        System.out.println(micoche.puertas);
    }

    public static void suma (int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
    static class coche {
        public int puertas = 2;

        public void IncrementarPuertas(){
            this.puertas++;
        }
    }
}