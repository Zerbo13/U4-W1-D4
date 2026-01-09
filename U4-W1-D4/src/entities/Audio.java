package entities;

public class Audio extends ElementoMultimediale implements Riproducibile{
    private int durataInSec;
    private int volume = 50;

    public Audio(String titolo, int durata, int volume){
        super(titolo);
        this.durataInSec = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < durataInSec; i++) {
            System.out.println(titolo + "!".repeat(volume));
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
}

