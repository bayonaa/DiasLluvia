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

    public int trimestreLluvioso() {
        int[] trimestreLluvioso = new int[4];
        for (int i = 0; i < registroDiasLluvia.length; i++) {
            for (int j = 0; j < registroDiasLluvia[i].length; j++) {
                if (registroDiasLluvia[i][j]) {
                    int diaDelAño = j + 1;

                    if (diaDelAño <= 90) {
                        trimestreLluvioso[0]++;
                    } else if (diaDelAño <= 180) {
                        trimestreLluvioso[1]++;
                    } else if (diaDelAño <= 270) {
                        trimestreLluvioso[2]++;
                    } else {
                        trimestreLluvioso[3]++;
                    }
                }
            }
        }

        int max = trimestreLluvioso[0];
        int trimestreMasLluvioso = 1;
        for (int i = 1; i < trimestreLluvioso.length; i++) {
            if (trimestreLluvioso[i] > max) {
                max = trimestreLluvioso[i];
                trimestreMasLluvioso = i + 1;
            }
        }
        return trimestreMasLluvioso;
    }
}