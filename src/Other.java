/**
 * Created by jonas on 2015-10-22.
 */
public class Other {

    static void Cls(int rows){
        int i = 0;
        while (i<rows){
            System.out.println("\n");
            i++;
        }
    }

    static void Win(){

        int i = 0;

        System.out.println("Dealers cards value is: "+Dealer.total_);

        System.out.println("+=-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=");
        while (i < CreatePlayer.players.size()){

            if (Dealer.total_<=21) {

                if (CreatePlayer.players.get(i).total_ <= 21 && CreatePlayer.players.get(i).total_ >= Dealer.total_) {
                    System.out.println("|       " + CreatePlayer.players.get(i).name + ": " + CreatePlayer.players.get(i).total_ + "     WIN");
                    System.out.println("+=-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=");
                } else {

                    System.out.println("|       " + CreatePlayer.players.get(i).name + ": " + CreatePlayer.players.get(i).total_ + "     LOSE");
                    System.out.println("+=-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=");
                }
            }
            else {
                if (CreatePlayer.players.get(i).total_ <= 21) {
                    System.out.println("|       " + CreatePlayer.players.get(i).name + ": " + CreatePlayer.players.get(i).total_ + "     WIN");
                    System.out.println("+=-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=");
                } else {

                    System.out.println("|       " + CreatePlayer.players.get(i).name + ": " + CreatePlayer.players.get(i).total_ + "     LOSE");
                    System.out.println("+=-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=");
                }
            }
            i++;
        }
    }
}
