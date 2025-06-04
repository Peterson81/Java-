import java.util.Scanner;

public class Main {

   
    interface DispositivoEletronico {
        void ligar();
        void desligar();
    }

    static class Smartphone implements DispositivoEletronico {
        @Override
        public void ligar() {
            System.out.println("Smartphone ligado.");
        }

        @Override
        public void desligar() {
            System.out.println("Smartphone desligado.");
        }
    }


    static class Televisao implements DispositivoEletronico {
        @Override
        public void ligar() {
            System.out.println("TV ligada.");
        }

        @Override
        public void desligar() {
            System.out.println("TV desligada.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico televisao = new Televisao();

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Ligar Smartphone");
            System.out.println("2 - Desligar Smartphone");
            System.out.println("3 - Ligar Televisão");
            System.out.println("4 - Desligar Televisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    smartphone.ligar();
                    break;
                case 2:
                    smartphone.desligar();
                    break;
                case 3:
                    televisao.ligar();
                    break;
                case 4:
                    televisao.desligar();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
