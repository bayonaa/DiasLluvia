package es.iesmz.tests;

public class DiasLluvia {
    private boolean[][] registroDiasLluvia;

    public DiasLluvia() {
        registroDiasLluvia = new boolean[12][31];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Mes o día inválido.");
            return false;
        }
        registroDiasLluvia[mes - 1][dia - 1] = lluvia;
        return true;
    }
}