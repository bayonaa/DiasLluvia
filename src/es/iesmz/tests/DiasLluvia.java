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

    public boolean consultarDia(int dia, int mes) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Mes o día inválido.");
            return false;
        }
        return registroDiasLluvia[mes - 1][dia - 1];
    }

    public int contarDiasLluviosos() {
        int cont = 0;
        for (int i = 0; i < registroDiasLluvia.length; i++) {
            for (int j = 0; j < registroDiasLluvia[i].length; j++) {
                if (registroDiasLluvia[i][j]) {
                    cont++;
                }
            }
        }
        return  cont;
    }
}