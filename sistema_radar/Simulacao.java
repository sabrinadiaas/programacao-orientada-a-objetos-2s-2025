package sistema_radar;
public class Simulacao {
    public static void main(String[] args) {
        Carro porsche = new Carro("LBM1501", 0, 2026, "Taycan");

        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(porsche);

        porsche.acelerar(); //10
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar();
        porsche.acelerar(); //70

        radar.avaliarVelocidade(porsche);

    }
}
