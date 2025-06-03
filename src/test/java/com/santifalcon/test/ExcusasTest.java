package com.santifalcon.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.santifalcon.tp1.EmailSender;
import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.CEO;
import com.santifalcon.tp1.empleado.encargado.EncargadoDefault;
import com.santifalcon.tp1.empleado.encargado.GerenteRRHH;
import com.santifalcon.tp1.empleado.encargado.Recepcionista;
import com.santifalcon.tp1.empleado.encargado.SupervisorArea;
import com.santifalcon.tp1.empleado.encargado.lineaencargados.ManejadoresDeExcusas;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.tipoexcusa.*;
import com.santifalcon.tp1.excusa.RechazadorExcusas;
import com.santifalcon.tp1.prontuario.AdministradorProntuarios;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExcusasTest {

    private Recepcionista recepcionista;
    private SupervisorArea supervisor;
    private GerenteRRHH gerente;
    private CEO ceo1;
    private CEO ceo2;
    private EncargadoDefault encargadoDefault;
    private RechazadorExcusas rechazador;
    private EmailSender emailSender;
    private ManejadoresDeExcusas manejadoresDeExcusas;
    private Empleado empleado;

    @BeforeEach
    void setUp() {
        emailSender = new EmailSender();
 
        ceo1 = new CEO("Juan CEO", "juan.ceo@excusas.com",123);
        ceo2 = new CEO("Pepe Gonzalez","pepe.gonzalez@excusas.com", 3576);

        recepcionista = new Recepcionista("Clara Hernandez", "clara.hernandez@excusas.com",5678);
        supervisor = new SupervisorArea("Rodrigo Lopez", "rodrigo.lopez@excusas.com",6547845);
        gerente = new GerenteRRHH("Leonardo Diaz","leonardo.dias@excusas.com",9076978);
        encargadoDefault = new EncargadoDefault("Julieta Perez","julieta.perez@excusas.com",458478);
        rechazador = new RechazadorExcusas();
        
        manejadoresDeExcusas = new ManejadoresDeExcusas(recepcionista, rechazador);
        manejadoresDeExcusas.agregar(supervisor);
        manejadoresDeExcusas.agregar(gerente);
        manejadoresDeExcusas.agregar(encargadoDefault);
        
        //ProntuarioObservable.getInstance().agregarObservador(ceo2);
        empleado = new Empleado("Juan", "juan@email.com", 1234);
    }

    @Test
    void testRecepcionistaAceptaExcusaTrivial() {
        Excusa excusa = new Excusa(empleado, "me quedé dormido",new TipoTrivialExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
    }
    
    
    @Test
    void testSupervisorProcesaExcusaModerada() {
        Excusa excusa = new Excusa(empleado, "se cortó la luz", new TipoCorteLuzExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
        
        //assertEquals("SupervisorArea", excusa.getProcesadoPor());
    }

    @Test
    void testGerenteProcesaExcusaCompleja() {
        Excusa excusa = new Excusa(empleado, "una paloma robó mi bicicleta", new TipoComplejaExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
        
       // assertEquals("GerenteRRHH", excusa.getProcesadoPor());
    }


}
