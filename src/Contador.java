import java.util.Scanner;

import com.contador.exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("===========Contador==========\n");
            Scanner sh = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int valueA = sh.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int valueB = sh.nextInt();
            contar(valueA, valueB);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int valueA, int valueB) throws ParametrosInvalidosException {
        if (valueA > valueB) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = valueB - valueA;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
