import entities.ElementoMultimediale;
import entities.Audio;
import entities.Video;
import entities.Immagine;
import entities.Riproducibile;
import entities.Luminosita;
import entities.ArrayClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String titolo;
        int durataInSec;
        ArrayClass a = new ArrayClass();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il titolo: ");
            titolo = scanner.nextLine();

            System.out.println("1 Video, 2 Audio, 3 Immagine");
            int num = scanner.nextInt();
            switch (num){
                case 1 : {
                    System.out.println("Inserisci la durata del video: ");
                    durataInSec = scanner.nextInt();
                    break;
                }

                case 2 : {
                    System.out.println("Inserisci la durata dell'audio: ");
                    durataInSec = scanner.nextInt();
                    break;
                }

                case 3 : {
                    break;
                }

                default : {
                    System.out.println("Numero inserito errato!");
                }
            }
        }
        }
    }
