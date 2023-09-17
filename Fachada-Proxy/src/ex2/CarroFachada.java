package ex2;

public class CarroFachada {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Portas portas;
    private Farol farol;
    private Radio radio;

    public CarroFachada() {
        this.motor = new Motor();
        this.cinto = new CintoDeSeguranca();
        this.portas = new Portas();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void ligarCarro() {
        motor.ligar();
        portas.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacao("Rádio Rock");
    }

    public void desligarCarro() {
        motor.desligar();
        portas.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
