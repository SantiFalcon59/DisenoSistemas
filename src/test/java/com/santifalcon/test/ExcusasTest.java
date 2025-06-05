package com.santifalcon.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
import com.santifalcon.tp1.prontuario.Prontuario;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExcusasTest {

    private Recepcionista recepcionista;
    private SupervisorArea supervisor;
    private GerenteRRHH gerente;
    private CEO ceo;
    private EncargadoDefault encargadoDefault;
    private RechazadorExcusas rechazador;
    private ManejadoresDeExcusas manejadoresDeExcusas;
    private Empleado empleado;

    @BeforeEach
    void setUp() {
        ceo = new CEO("Juan CEO", "juan.ceo@excusas.com",123);

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
/*
    @Test
    void testRecepcionistaAceptaExcusaTrivial() {
        Excusa excusa = new Excusa(empleado, "me quedé dormido", new TipoTrivialExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
        assertEquals(recepcionista, excusa.getProcesadoPor());
    }

    @Test
    void testSupervisorProcesaExcusaModerada() {
        Excusa excusa = new Excusa(empleado, "se cortó la luz", new TipoCorteLuzExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
        assertEquals(supervisor, excusa.getProcesadoPor());
    }

    @Test
    void testGerenteProcesaExcusaCompleja() {
        Excusa excusa = new Excusa(empleado, "una paloma robó mi bicicleta", new TipoComplejaExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
        assertEquals(gerente, excusa.getProcesadoPor());
    }
    
    @Test
    void testRecepcionistaRechazaExcusaModeradaYLaProcesaElSupervisor() {
        Excusa excusa = new Excusa(empleado, "tuve que cuidar a un familiar", new TipoCuidarFamiliarExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);
        assertEquals(supervisor, excusa.getProcesadoPor());
    }

    @Test
    void testSupervisorModoVagoNoProcesaYLaProcesaElGerente() {
        supervisor.modoVago();
        Excusa excusa = new Excusa(empleado, "se cortó la luz", new TipoCorteLuzExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);

        assertEquals(rechazador, excusa.getProcesadoPor());
    }

    @Test
    void testSupervisorModoProductivoEvaluaYProcesa() {
        supervisor.modoProductivo();
        Excusa excusa = new Excusa(empleado, "tuve que cuidar a un familiar", new TipoCuidarFamiliarExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);

        assertEquals(supervisor, excusa.getProcesadoPor());
    }
*/
    @Test
    void testCEOProcesaExcusaInverosimilYGeneraProntuarioConObservers() {
        manejadoresDeExcusas.agregar(ceo);

        Excusa excusa = new Excusa(empleado, "una oveja ninja me secuestró", new TipoInverosimilExcusa());
        manejadoresDeExcusas.manejarExcusa(excusa);

        assertEquals(ceo, excusa.getProcesadoPor());

        List<Prontuario> prontuarios = AdministradorProntuarios.getInstance().getProntuarios();

        assertFalse(prontuarios.isEmpty());
        
        Prontuario generado = prontuarios.get(0);
        assertEquals(empleado, generado.getEmpleado());
        assertTrue(generado.getExcusa().getMensaje().contains("oveja ninja"));
        assertTrue(ceo.isNotificado());

    }


}
