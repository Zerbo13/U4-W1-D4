package entities;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita{
    private int durataInSec;
    private int volume;
    private int luminosita = 50;

    public Video(String titolo, int durata, int volume, int luminosita){
        super(titolo);
        this.durataInSec = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i < durataInSec; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public void abbassaVolume(){
        volume --;
    }

    @Override
    public void alzaVolume(){
        volume ++;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita ++;
    }

    @Override
    public void diminuisciLuminosita() {
        luminosita --;
    }
}
