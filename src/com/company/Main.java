package com.company;

public class Main {

    public static void main(String[] args) {
        final int NUMBER_OF_THREADS = 3;
        Marcador marcador = new Marcador();
        Thread[] threads = new Thread[NUMBER_OF_THREADS];

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            threads[i] = new Thread(new Dado(marcador));
        }

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            threads[i].start();
        }

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Se ha interrumpido");
            }
        }

        for (int i = 0; i < marcador.getMarcador().size(); i++) {
            System.out.printf("Número %d: %d veces \n", i+1, marcador.getMarcador().get(i));
        }

        System.out.printf("Total de veces: ");

        for (int i = 0; i < marcador.getMarcador().size(); i++) {
            if (i == 0){
                System.out.printf("%d ", marcador.getMarcador().get(i));
            } else {
                System.out.printf("+ %d ", marcador.getMarcador().get(i));
            }
        }

        System.out.printf("= 30000");
    }
}
