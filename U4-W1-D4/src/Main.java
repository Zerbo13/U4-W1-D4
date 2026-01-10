import entities.ElementoMultimediale;
import entities.Audio;
import entities.Video;
import entities.Immagine;
import entities.Riproducibile;
import entities.Luminosita;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String titolo;
        int durataInSec;

        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elements = new ElementoMultimediale[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("1 Video, 2 Audio, 3 Immagine");
            int tipologia = Integer.parseInt(scanner.nextLine());
            switch (tipologia){

                //VIDEO
                case 1 : {
                    System.out.println("Inserisci il titolo: ");
                    titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata del video (in secondi): ");
                    durataInSec = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del video: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosità del video: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Video(titolo, durataInSec, volume, luminosita);
                    break;
                }

                //AUDIO
                case 2 : {
                    System.out.println("Inserisci il titolo: ");
                    titolo = scanner.nextLine();
                    System.out.println("Inserisci la durata dell'audio (in secondi): ");
                    durataInSec = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume dell'audio: ");
                    int volume = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Audio(titolo, durataInSec, volume);
                    break;
                }

                //IMMAGINI
                case 3 : {
                    System.out.println("Inserisci il titolo: ");
                    titolo = scanner.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine: ");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    elements[i] = new Immagine(titolo, luminosita);
                    break;
                }

                default : {
                    System.out.println("Numero inserito errato!");
                    i--;
                }
            }
        }

        int scegli = -1;
        while (scegli != 0) {
            System.out.println("Scegli un numero da 1 a 5 per far apperire l'elemento desiderato (usa 0 per uscire) :");
            scegli = Integer.parseInt(scanner.nextLine());

            if(scegli > 0 && scegli < 5){
                ElementoMultimediale elemento = elements[scegli -1];

                if(elemento instanceof Riproducibile){
                    ((Riproducibile)elemento).play();
                } else if
                (elemento instanceof  Immagine){
                    ((Immagine) elemento).show();
                }
            }
        }
        }
    }
