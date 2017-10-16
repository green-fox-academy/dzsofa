public class GameApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Game game = new Game();

        Hand player1 = new Hand("Geza", deck);
        player1.dealCards();
        System.out.println(player1.toString());
        Hand player2 = new Hand("Magdi neni", deck);
        player2.dealCards();
        System.out.println(player2.toString());

        System.out.println(game.basicCase(player1));
        System.out.println(game.basicCase(player2));
    }
}
