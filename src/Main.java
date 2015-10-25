import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("WELCOME TO BLACKJACK");
        // skapar spelare och tilldelar dom 2 kort var
        CreatePlayer.CreatingPlayers();
        ChoiseOfNewCard.ChoiseOfNewCard();
        Dealer.CreateDealer();
        Dealer.DealersTurn();
        Other.Win();

        // hur man tilldelar en specifik spelare nya kort (antal kort, index av spelare)
        //DeckOfCards.PickRandomCard(1, 0);


        //hämtar och skriver ut en specifik spelares namn
        //System.out.print(CreatePlayer.players.get(0).name);

        // räknar en specifik spelares hand och omvandlar det til en int som sedan sparas i objectet Player som total_
        //PlayerHandCounter.CountHand(0);

        // hur man skriver ut en specifik spelares hand
        //System.out.println(CreatePlayer.players.get(0).playerHand);

        // hämtar det totala värdet av en specifik spelares hand
        //System.out.print(CreatePlayer.players.get(0).total_);




       /* DeckOfCards.MakeADeck();
        DeckOfCards.PickRandomCard(1);
        CreatePlayer.CreatingPlayers();
        System.out.println("in Main");
        System.out.println(CreatePlayer.players.get(1).name);
        CreatePlayer.players.get(1).playerHand.add(DeckOfCards.valueOfIndex);
        System.out.println(CreatePlayer.players.get(1).playerHand.get(0));*/



      /*  // före jag tagit kort
        DeckOfCards.MakeADeck();
        System.out.println(DeckOfCards.fullDeck);
        System.out.println(DeckOfCards.fullDeck.size());

        // efter jag tagit kort
        DeckOfCards.PickRandomCard(1);
        System.out.println(DeckOfCards.fullDeck);
        System.out.println(DeckOfCards.fullDeck.size());
        System.out.println(DeckOfCards.valueOfIndex);
        System.out.println(DeckOfCards.nrOfCards_);
        DeckOfCards.PickRandomCard(2);
        System.out.println(DeckOfCards.nrOfCards_);
        System.out.println(DeckOfCards.valueOfIndex);*/
    }
}