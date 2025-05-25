package ListaVIII;

import java.util.Scanner;

public class ListaVIII_Alice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual questão deseja executar? (1-6) ");
        int q = scanner.nextInt();

        switch (q) {
            case 1:
                q1();
                break;

            case 2:
                q2();
                break;

            case 3:
                System.out.println(q3(5, 6, 8));
                break;

            case 4:
                System.out.println(q4(-10));
                break;

            case 5:
                System.out.println(q5(10.0, 1000.0));
                break;

            case 6:
                q6();
                break;

            default:
                break;
        }

        scanner.close();
    }

    public static void q1(){
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void q2() {
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static int q3 (int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static char q4 (int n) {
        if (n > 0){
            return 'P';
        }else{
            return 'N';
        }
    }

    public static double q5 (double taxaImposto, double custo) {
        double valorImposto = custo * (taxaImposto / 100);
        return custo + valorImposto;
    }

    public static int q6conversao (int hora, char conversor) {
        if (conversor == 'A') {
            if (hora == 0) {
                return 12;
            } else {
                return hora;
            }
        } else {
            return hora - 12;
        }
    }

    public static String q6saida (int hora, int minuto) {
        char conversor = 'P';
        if (hora < 12){
            conversor = 'A';
        }

        int horaConvertida = q6conversao (hora, conversor);

        return horaConvertida + ":" + minuto + " " + conversor;
    }

    public static void q6() {
        while (true){
            System.out.println ("Entre com hora/minuto (HH:MM) ");
            String[] entradas = scanner.next().split(":");

            int hora = Integer.parseInt(entradas[0]);
            int minuto = Integer.parseInt(entradas[1]);

            System.out.println (q6saida (hora, minuto));

            System.out.println ("Deseja fazer mais uma conversão? (S/N) ");
            char r = scanner.next().charAt(0);

            if (r == 'N') {
                break;
            }

        }
    }

}
