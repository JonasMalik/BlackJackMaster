import java.util.Scanner;

/**
 * Created by jonas on 2015-10-15.
 */
public class ChoiseOfNewCard {

    static void ChoiseOfNewCard(){

        Scanner keyboard = new Scanner(System.in);
        String yesOrNo;

        Other.Cls(20);
        // Loopar spelare
        for(int i = 0; i < CreatePlayer.players.size(); i++) {

            // Loopar frågan om du vill dra ett nytt kort
            while (CreatePlayer.players.get(i).total_< 21) {
                PlayerHandCounter.CountHand(i);
                System.out.println("\n"+CreatePlayer.players.get(i).name+ ":\nHand value is: " + CreatePlayer.players.get(i).total_);
                System.out.print("Do you want to draw a new card? \n(Y/N)");
                yesOrNo = keyboard.next();

                // Sker om du vill dra ett nytt kort
                if (yesOrNo.equals("y") || yesOrNo.equals("Y")){
                    DeckOfCards.PickRandomCard(1, i);
                    PlayerHandCounter.CountHand(i);
                }

                // Sker om du inte vill dra ett nytt kort
                else if (yesOrNo.equals("n") || yesOrNo.equals("N")){
                    break;
                }

                // Sker om du ej skriver vad som begärs
                else {
                    System.out.println("Try again!");
                }
            }

            // Hoppar 20 rader
            Other.Cls(20);

            // Kollar om det är någon spelare efter,
            // om det är en spelare så skrivs "Next player!" ut
            if (i < CreatePlayer.players.size()-1) {
                System.out.println(CreatePlayer.players.get(i).name+" ended up with card value "+CreatePlayer.players.get(i).total_+"\n\n");
                System.out.println("Next player!");
            }
        }
    }
}

