package com.santifalcon.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.santifalcon.tp1.empleado.Empleado;
import com.santifalcon.tp1.empleado.encargado.CEO;
import com.santifalcon.tp1.empleado.encargado.EncargadoBase;
import com.santifalcon.tp1.empleado.encargado.GerenteRRHH;
import com.santifalcon.tp1.empleado.encargado.Recepcionista;
import com.santifalcon.tp1.empleado.encargado.RechazadorExcusas;
import com.santifalcon.tp1.empleado.encargado.SupervisorArea;
import com.santifalcon.tp1.empleado.encargado.lineaencargados.LineaDeManejadoresDeExcusas;
import com.santifalcon.tp1.excusa.Excusa;
import com.santifalcon.tp1.excusa.tipoexcusa.*;
import com.santifalcon.tp1.prontuario.AdministradorProntuarios;
import com.santifalcon.tp1.prontuario.Prontuario;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ExcusasTest {

    private Recepcionista recepcionista;
    private SupervisorArea supervisor;
    private GerenteRRHH gerente;
    private CEO ceo;
    private EncargadoBase encargadoDefault;
    private RechazadorExcusas rechazador;
    private LineaDeManejadoresDeExcusas manejadoresDeExcusas;
    private Empleado empleado;

    @BeforeEach
    void setUp() {
        ceo = spy(new CEO("Juan CEO", "juan.ceo@excusas.com",123));

        recepcionista = spy(new Recepcionista("Clara Hernandez", "clara.hernandez@excusas.com",5678));
        supervisor = spy(new SupervisorArea("Rodrigo Lopez", "rodrigo.lopez@excusas.com",6547845));
        gerente = spy(new GerenteRRHH("Leonardo Diaz","leonardo.dias@excusas.com",9076978));
        encargadoDefault = spy(new EncargadoBase("Julieta Perez","julieta.perez@excusas.com",458478));
        rechazador = spy(new RechazadorExcusas());
        
        manejadoresDeExcusas = new LineaDeManejadoresDeExcusas(recepcionista, rechazador);
        manejadoresDeExcusas.agregar(supervisor);
        manejadoresDeExcusas.agregar(gerente);
        manejadoresDeExcusas.agregar(encargadoDefault);
        manejadoresDeExcusas.agregar(ceo);
        
        empleado = spy(new Empleado("Juan", "juan@email.com", 1234));
    }

    @Test
    void testRecepcionistaAceptaExcusaTrivial() {
    	Excusa excusa = empleado.presentarExcusa("me quedé dormido", new TipoTrivialExcusa(), manejadoresDeExcusas);
    	verify(recepcionista, times(1)).manejarExcusa(excusa);
    }

    @Test
    void testSupervisorProcesaExcusaModerada() {
     Excusa excusa = empleado.presentarExcusa("se cortó la luz", new TipoCorteLuzExcusa(), manejadoresDeExcusas);
 		verify(supervisor, times(1)).manejarExcusa(excusa);
    }

    @Test
    void testGerenteProcesaExcusaCompleja() {
        Excusa excusa = empleado.presentarExcusa("una paloma robó mi bicicleta", new TipoComplejaExcusa(),manejadoresDeExcusas);
    	verify(gerente, times(1)).manejarExcusa(excusa);
    }
    
    @Test
    void testRecepcionistaRechazaExcusaModeradaYLaProcesaElSupervisor() {
    	Excusa excusa= empleado.presentarExcusa( "tuve que cuidar a un familiar", new TipoCuidarFamiliarExcusa(),manejadoresDeExcusas);
    	verify(supervisor, times(1)).manejarExcusa(excusa);
    }

    @Test
    void testSupervisorModoVagoNoProcesaYLaProcesaElGerente() {
        supervisor.modoVago();
       Excusa excusa = empleado.presentarExcusa("se cortó la luz", new TipoCorteLuzExcusa(),manejadoresDeExcusas);
   	verify(rechazador, times(1)).manejarExcusa(excusa);
    }

    @Test
    void testSupervisorModoProductivoEvaluaYProcesa() {
        supervisor.modoProductivo();
       Excusa excusa= empleado.presentarExcusa("tuve que cuidar a un familiar", new TipoCuidarFamiliarExcusa(),manejadoresDeExcusas);
   	verify(supervisor, times(1)).manejarExcusa(excusa);
    }

    @Test
    void testCEOProcesaExcusaInverosimilYGeneraProntuarioConObservers() {

       Excusa excusa = empleado.presentarExcusa("una oveja ninja me secuestró", new TipoInverosimilExcusa(),manejadoresDeExcusas);
       verify(ceo, times(1)).manejarExcusa(excusa);

        List<Prontuario> prontuarios = AdministradorProntuarios.getInstance().getProntuarios();
        
        assertFalse(prontuarios.isEmpty());
        Prontuario generado = prontuarios.get(0);
        assertEquals(empleado, generado.getEmpleado());
        assertTrue(generado.getExcusa().getMensaje().contains("oveja ninja"));
        
    }


}
