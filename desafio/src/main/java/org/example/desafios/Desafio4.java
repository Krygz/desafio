package org.example.desafios;

public class Desafio4 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;
        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        System.out.printf("Percentual de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de Outros: %.2f%%\n", percentualOutros);

    }
}
