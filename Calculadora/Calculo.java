public class Calculo {
    private double[] numeros = new double[8];

    public Calculo(String[] numerosAsString) {
        for(int i = 0; i < numeros.length; i++) {
            this.numeros[i] = Integer.parseInt(numerosAsString[i]);
        }
    }

    public double multiplicao (double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double divisao (double numero1, double numero2) {
        return numero1 / numero2;
    }

    public double adicao (double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtracao (double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double fatorial (double numero) {
        double resultado = 1;

        for (double fator = 2; fator <= numero; fator++) {
            resultado *= fator;
        }

        return resultado;
    }

    public double potencia (double numero1, double numero2) {
        return Math.pow(numero1, numero2);
    }
}