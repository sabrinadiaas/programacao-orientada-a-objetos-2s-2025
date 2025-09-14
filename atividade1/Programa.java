package atividade1;

public class Programa {
    private Integer memoriaRAMAlocada;
    private Integer SSDocupado;
    private Integer nucleos;
    private Integer quantidadeOPeracoes;

    public Programa (Integer memoriaRAMAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.SSDocupado = SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOPeracoes = quantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() {
        return this.memoriaRAMAlocada;
     }

    public void setMemoriaRAMAlocada(Integer memoriaRAMAlocada) {
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return this.SSDocupado;
    }

    public void setSSDOcupado (Integer SSDOcupado) {
        this.SSDocupado = SSDOcupado;
    }

    public Integer getNucleos() {
        return this.nucleos;
     }

    public void setNucleos(Integer nucleos) {
        this.nucleos = nucleos;
    }

    public Integer getQuantidadeOperacoes() {
        return this.quantidadeOPeracoes;
     }

    public void setQuantidadeOperacoes(Integer quantidadeOperacoes) {
        this.quantidadeOPeracoes = quantidadeOperacoes;
    }
}
