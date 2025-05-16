package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Cazadores.Cazador;

public class Agencia {

    private List<Cazador> cazadores;

    public Agencia(){
        this.cazadores = new ArrayList<>();
    }

    public Agencia(List<Cazador> cazadores){
        this.cazadores = cazadores;
    }

}
