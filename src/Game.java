import java.util.Scanner;

public class Game {
    Player p1;
    Player p2;
    Dice die;

    public Game(Player p1, Player p2, Dice die) {
        this.p1 = p1;
        this.p2 = p2;
        this.die = die;
    }
    public void play() {
        Player current = p1;
        takeTurn(current);
        current = nextPlayer(current);
        takeTurn(current);

        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return this.p2;
        } else {
            return this.p1;
        } }

        public void takeTurn (Player player){
            player.toss(this.die);
        }


    public String announceWinner() {
            System.out.printf("%s rolled %d%n%s rolled %d%n", p1.getName(), p1.getScore(), p2.getName(), p2.getScore());
            if (this.p1.getScore()> this.p2.getScore()) {
                return String.format("%s won", p1.getName());
            }
            else if (this.p2.getScore() > this.p1.getScore()) {
                return String.format("%s won", p2.getName());
            }
            else {
                return String.format("(%s and %s tied", p1.getName(), p2.getName());
            }
        }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter player 1's name: ");
        String playerName = in.nextLine();
        Player p1 = new Player(playerName);
        System.out.print("\nEnter player 2's name: ");
        playerName = in.nextLine();
        Player p2 = new Player(playerName);
        System.out.print("\nEnter number of sides on your dice: ");
        int sides = Integer.parseInt(in.nextLine());

        Game g = new Game(p1, p2, new Dice(sides));
        g.play();

    }
}
