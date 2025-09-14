package atividade1;
 
public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma(Programa p) {
        if (p.getSSDOcupado() > computador.getSSD()) {
            System.out.println("Erro: não há espaço suficiente no SSD para instalar o programa.");
            return false;
        }

        if (p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()) {
            System.out.println("Erro: não há memória RAM suficiente para executar o programa.");
            return false;
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo().floatValue() * computador.getNucleos());


        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
}
 
