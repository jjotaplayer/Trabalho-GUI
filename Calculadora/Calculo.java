public class Calculo {

    public int multiplicacao (int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int divisao (int numero1, int numero2) {
        return numero1 / numero2;
    }

    public int adicao (int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int subtracao (int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int fatorial (int numero) {
        int resultado = 1;

        for (int fator = 2; fator <= numero; fator++) {
            resultado *= fator;
        }

        return resultado;
    }

    public int potencia (int numero1, int numero2) {
        double num1 = numero1;
        double num2 = numero2;
        double result = Math.pow(num1, num2);
        // Sloppy fix
        int resultado = (int) result;
        return resultado;
    }

    public int resto (int numero1, int numero2) {
        return numero1 % numero2;
    }

    public int raiz2 (int numero1) {
        double num1 = numero1;
        num1 = Math.sqrt(num1);
        return (int) num1;
    }
    
    public int elevadoAy (int numero1, int numero2) {
        double num1 = numero1;
        double num2 = numero2;
        num1 = Math.pow(num1, num2);
        return (int) num1;
    }
    
    public int elevadoA2 (int numero1) {
        double num1 = numero1;
        num1 = Math.pow(num1, 2);
        return (int) num1;
    }

    public int elevadoA3 (int numero1) {
        double num1 = numero1;
        num1 = Math.pow(num1, 3);
        return (int) num1;
    }

    public int elevadoAe (int numero1) {
        double num1 = numero1;
        num1 = Math.pow(num1, Math.E);
        return (int) num1;
    }
    
    public int pi (int numero1) {
        return (int) (numero1 * Math.PI);
    }
}