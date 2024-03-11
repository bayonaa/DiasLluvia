package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiasLluviaTest {
    @BeforeEach
    public void beforeEach() {
        System.out.println("EXECUTE PROVA");
    }

    @Test //Test1 para el método registroDia()
    public void testRegistroDia1() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(1, 1, true));
    }

    @Test //Test2 para el método registroDia()
    public void testRegistroDia2() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(15, 6, false));
    }

    @Test //Test3 para el método registroDia()
    public void testRegistroDia3() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertFalse(diasLluvia.registroDia(32, 12, true));
    }

    @Test //Test1 para el método consultarDia()
    public void testConsultarDia1() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        assertTrue(diasLluvia.consultarDia(1, 1));
    }

    @Test //Test2 para el método consultarDia()
    public void testConsultarDia2() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        assertFalse(diasLluvia.consultarDia(1, 2));
    }

    @Test //Test3 para el método consultarDia()
    public void testConsultarDia3() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertFalse(diasLluvia.consultarDia(32, 12));
    }
}