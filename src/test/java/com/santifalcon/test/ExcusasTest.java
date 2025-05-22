package com.santifalcon.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.santifalcon.tp1.empleado.CEO;
import com.santifalcon.tp1.empleado.GerenteRRHH;
import com.santifalcon.tp1.empleado.Recepcionista;
import com.santifalcon.tp1.empleado.SupervisorArea;
import com.santifalcon.tp1.excusa.subtipos.CorteLuzExcusa;
import com.santifalcon.tp1.excusa.subtipos.DormidoExcusa;
import com.santifalcon.tp1.modoaccion.ModoAccion;
import com.santifalcon.tp1.modoaccion.ModoNormal;
import com.santifalcon.tp1.modoaccion.ModoVago;
import com.santifalcon.tp1.prontuario.AdministradorProntuarios;
import com.santifalcon.tp1.prontuario.Prontuario;
import com.santifalcon.tp1.prontuario.ProntuarioObserver;

import static org.junit.jupiter.api.Assertions.*;

public class ExcusasTest {

    private Recepcionista recepcionista;
    private SupervisorArea supervisor;
    private GerenteRRHH gerente;
    private CEO ceo;
    private ModoAccion modoNormal;
    private DormidoExcusa excusaTrivial;
    private CorteLuzExcusa excusaModerada;
    private AdministradorProntuarios administrador;

    
    /*
     * WIP
     */
    
    /*
    @BeforeEach
    public void setUp() {
        modoNormal = new ModoNormal();

        // Encargados
        recepcionista = new Recepcionista();
        supervisor = new SupervisorArea();
        gerente = new GerenteRRHH();
        ceo = new CEO();

        recepcionista.modoNormal();
        supervisor.modoNormal();
        gerente.modoNormal();
        ceo.modoNormal();

        recepcionista.setSiguiente(supervisor);
        supervisor.setSiguiente(gerente);
        gerente.setSiguiente(ceo);

        // Excusas
        excusaTrivial = new DormidoExcusa();
        excusaModerada = new CorteLuzExcusa();

        administrador = AdministradorProntuarios.getInstance();
    }

    @Test
    public void testTrivialExcusaProcesadaPorRecepcionista() {
        recepcionista.manejarExcusa(excusaTrivial);
    }

    @Test
    public void testModeradaExcusaProcesadaPorSupervisor() {
        recepcionista.manejarExcusa(excusaModerada);
    }

    @Test
    public void testModoDeAccionCambiaComportamiento() {
        recepcionista.modoVago();
        recepcionista.manejarExcusa(excusaTrivial);
    }

    @Test
    public void testSingletonAdministradorUnico() {
        AdministradorProntuarios otroAdmin = AdministradorProntuarios.getInstance();
        assertSame(administrador, otroAdmin);
    }

    @Test
    public void testNotificacionACEOs() {
        ProntuarioObserver prontuarioObserver = null;
        recepcionista.manejarExcusa(excusaModerada);
    }
    */
}
