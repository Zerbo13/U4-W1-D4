package entities;

public class Immagine extends ElementoMultimediale implements Luminosita{
    private int luminosita = 50;

    public Immagine(String titolo, int luminosita){
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita ++;
    }

    @Override
    public void diminuisciLuminosita() {
        luminosita --;
    }

    public void show(){
        System.out.println(titolo + "*".repeat(luminosita));
    }
}
