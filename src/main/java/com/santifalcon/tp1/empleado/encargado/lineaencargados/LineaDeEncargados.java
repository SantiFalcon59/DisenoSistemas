package com.santifalcon.tp1.empleado.encargado.lineaencargados;

import java.util.ArrayList;
import java.util.List;
import com.santifalcon.tp1.empleado.encargado.Encargado;

public class LineaDeEncargados {

    private List<Encargado> encargados;
    private Encargado ultimoEncargado;

    public LineaDeEncargados(Encargado encargadoInicial, Encargado encargadoFinal) {
        this.encargados = new ArrayList<>();
        this.encargados.add(encargadoInicial);
        this.encargados.add(encargadoFinal);   
        this.ultimoEncargado = encargadoFinal;  
        encargadoInicial.setSiguiente(encargadoFinal); 
    }


    public void agregarAlFinal(Encargado encargado) {
        this.encargados.add(this.encargados.size() - 1, encargado);
        Encargado penultimo = this.encargados.get(this.encargados.size() - 2);
        penultimo.setSiguiente(encargado);
        encargado.setSiguiente(this.ultimoEncargado); 
    }
}
