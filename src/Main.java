public class Main {

    public static void main(String[] args) {
        // 플레이어와 Strategy 초기화
        Player player1 = new Player();
        Player player2 = new Player();
        Strategy Rock = new Rock();
        Strategy Paper = new Paper();
        Strategy Scissors = new Scissors();

        player1.setStrategy(Rock);
        player2.setStrategy(Paper);

        Game.play(player1, player2);

        player1.setStrategy(Scissors);
        Game.play(player1, player2);

        player2.setStrategy(Rock);
        Game.play(player1, player2);
    }
}
