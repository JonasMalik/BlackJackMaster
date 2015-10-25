import java.util.ArrayList;
import java.util.Random;


public class DeckOfCards {

    static String[] suits = { "Spade", "Clubs", "Hearts", "Diamonds" };
    static String valueOfIndex;
    static int nrOfCards_;
    static int indexOfPlayer_;
    static ArrayList<String> fullDeck = new ArrayList<>();


    static void MakeADeck () {

        for(int i = 0; i < suits.length; i++) {
            for(int j = 1; j < 14; j++) {
                fullDeck.add(j+" "+suits[i]+"\n");
            }
        }
    }

      static void PickRandomCard(int nrOfCards, int indexOfPlayer){

          nrOfCards_ = nrOfCards;
          indexOfPlayer_ = indexOfPlayer;
          Random rand = new Random();
          int i = 1;

          while (i<=nrOfCards_) {
              int randindex = rand.nextInt(fullDeck.size());
              valueOfIndex = fullDeck.get(randindex);
              fullDeck.remove(randindex);
              CreatePlayer.players.get(indexOfPlayer_).playerHand.add(valueOfIndex);
              i++;
          }


    }

    static void PickRandomCard(int nrOfCards){

        nrOfCards_ = nrOfCards;
        Random rand = new Random();
        int i = 1;

        while (i<=nrOfCards_) {
            int randindex = rand.nextInt(fullDeck.size());
            valueOfIndex = fullDeck.get(randindex);
            fullDeck.remove(randindex);
            Dealer.dealerHand.add(valueOfIndex);
            i++;
        }


    }

}