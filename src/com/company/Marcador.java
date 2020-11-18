package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Marcador {

    private List<LongAdder> marcador = new ArrayList<>(6);
    Random r = new Random();

    public void increment(){
        marcador.get(r.nextInt(6)).increment();
    }

    public List<LongAdder> getMarcador() {
        return marcador;
    }


}
