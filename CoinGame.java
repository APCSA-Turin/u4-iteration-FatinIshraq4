
    public class CoinGame {


        private int startingCoins;  // starting number of coins
        private int maxRounds;      // maximum number of rounds played
        private int roundTracker = 1; // ADDED TO ENABLE TESTING
        
        
        public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
        }
         
        /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
            THIS WAS AN "implementation not shown" METHOD IN THE ORIGINAL FRQ,
            BUT IS INCLUDED HERE TO ENABLE TESTING
          */
        public int getPlayer1Move() {
          int result;
          if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
          } else if (roundTracker == 3) {
            result = 1;
          } else {
            result = 3;
          }
          roundTracker++;
          return result;
        }
         
        /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
          * as described in part (a).
          */
        public int getPlayer2Move(int round) {
        /* COPY/PASTE YOUR SOLUTION TO PART A HERE */
        int result = 0;
        if (round%3==0) {
          result = 3;
        } else if (round%2==0) {
          result = 2;
        } else {
          result = 1;
        }
        return result; 
      
        }
        
        
        /** Plays a simulated game between two players, as described in part
          * (b).
          */
        public void playGame() {
        /* COPY/PASTE YOUR SOLUTION TO PART B HERE */
        int coin1 = startingCoins;
int coin2 = startingCoins;
int round = 1;
while (round<=maxRounds && coin1>=3 && coin2>=3) {
    int p1 = getPlayer1Move();
    int p2 = getPlayer2Move(round);
    if (p1==p2) {
        coin1-=p1;
        coin2 = coin2 - p2 + 1;
    } else if ((Math.abs(p1-p2)) == 1) {
        coin1-=p1;
        coin2 = coin2 - p2 + 1;
    } else {
        coin1 = coin1 - p1 + 2;
        coin2-=p2;
    }
round++;
}
if (coin1==coin2) {
System.out.println("tie game");
} else if (coin1>coin2) {
System.out.println("player 1 wins");
} else {
System.out.println("player 2 wins");
}

        }
        public static void main(String[] args) {
            CoinGame game1 = new CoinGame(10, 5);
game1.playGame();

CoinGame game2 = new CoinGame(10, 4);
game2.playGame();

CoinGame game3 = new CoinGame(10, 3);
game3.playGame();

CoinGame game4 = new CoinGame(10, 2);
game4.playGame();

CoinGame game5 = new CoinGame(10, 6);
game5.playGame();

CoinGame game6 = new CoinGame(5, 4);
game6.playGame();

CoinGame game7 = new CoinGame(7, 4);
game7.playGame();

        }
        }
        

