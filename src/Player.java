import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Player {

    ArrayList<String> playerHand = new ArrayList<>();
    String name;
    int total_;

    Player(String n){
        name = n;

    }
    void setPlayer(int total){
        total_ = total;

    }


}

class CreatePlayer {

    static ArrayList<Player> players = new ArrayList<>();
    static byte i = 1;
    static byte j = 0;

    static void CreatingPlayers() {
        Scanner keyboard = new Scanner(System.in);
        byte nrOfPlayers;
        String playerName;

        DeckOfCards.MakeADeck();
        System.out.print("How many players? ");
        nrOfPlayers = keyboard.nextByte();

        while (i <= nrOfPlayers) {
            System.out.println("Name Player" + i);
            playerName = keyboard.next();
            players.add(new Player(playerName));
            DeckOfCards.PickRandomCard(2, j);

            j++;
            i++;
        }

    }
}


class PlayerHandCounter {

    static int playerIndex_;
    static int i;
    static String valueOfCard;
    static int sum;
    static int highestHand;


    static void CountHand(int playerIndex) {
        playerIndex_ = playerIndex;
        i = 0;
        sum = 0;

        while (i <= CreatePlayer.players.get(playerIndex_).playerHand.size() - 1) {

            valueOfCard = CreatePlayer.players.get(playerIndex_).playerHand.get(i).replaceAll("\\D+", "");
            sum = sum + Integer.parseInt(valueOfCard);
            i++;
        }
        CreatePlayer.players.get(playerIndex_).setPlayer(sum);

    }

    // dealer
    static void CountHand() {
        i = 0;
        sum = 0;

        while (i <= Dealer.dealerHand.size()-1) {

            valueOfCard = Dealer.dealerHand.get(i).replaceAll("\\D+", "");
            sum = sum + Integer.parseInt(valueOfCard);
            i++;
        }
        Dealer.total_ = sum;

    }

    static void HighestHand() {
        ArrayList<Integer> maxValue = new ArrayList<>();
        int j = 0;
        while (j < CreatePlayer.players.size()) {
            if (CreatePlayer.players.get(j).total_ < 21) {
                maxValue.add(CreatePlayer.players.get(j).total_);
            }
            j++;
        }
        highestHand = Collections.max(maxValue)-3;

    }
}

class Dealer{

    static ArrayList<String> dealerHand = new ArrayList<>();
    static String name = "DEALER";
    static int total_;

    Dealer(){

    }

    void setTotal_(int total){
        total_ = total;

    }

    static void CreateDealer(){
        new Dealer();
    }

    static void DealersTurn(){


        Scanner keyboard = new Scanner(System.in);
        String yesOrNo;

        PlayerHandCounter.HighestHand();

            while (Dealer.total_ < PlayerHandCounter.highestHand ) {

                DeckOfCards.PickRandomCard(1);
                PlayerHandCounter.CountHand();
            }
        }
    }


