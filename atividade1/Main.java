package atividade1;

public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador(16, 500, 4, 2.5f); 
        SistemaOperacional SO = new SistemaOperacional(comp);

        Programa p1 = new Programa(4, 50, 2, 10000);   // Sucesso
        Programa p2 = new Programa(8, 600, 2, 20000);  // Erro SSD
        Programa p3 = new Programa(32, 100, 4, 50000); // Erro RAM

        System.out.println("\nPrograma 1:");
        SO.executarPrograma(p1);

        System.out.println("\nPrograma 2:");
        SO.executarPrograma(p2);

        System.out.println("\nPrograma 3:");
        SO.executarPrograma(p3);
    }
}
