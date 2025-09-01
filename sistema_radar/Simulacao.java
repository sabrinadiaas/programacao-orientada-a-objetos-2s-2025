package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro porsche = new Carro();
        porsche.ano = 2026;
        porsche.modelo = "Taycan";
        porsche.placa = "LBM1501";
        porsche.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistão Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(porsche);

        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();

        radar.avaliarVelocidade(porsche);

    }
}
