public class Game {

    public static void play(Player player1, Player player2){
        System.out.print("Player1이 ");
        player1.getStrategy().throwOut();

        System.out.print("Player2가 ");
        player2.getStrategy().throwOut();
        if (player1.getStrategy().equals(player2.getStrategy())) {
            System.out.println("무승부입니다.");
        } else if (player1.getStrategy().equals(new Rock())) {
            if (player2.getStrategy().equals(new Scissors())) {
                System.out.println("Player1이 이겼습니다.");
            } else {
                System.out.println("Player2가 이겼습니다.");
            }
        } else if (player1.getStrategy().equals(new Scissors())) {
            if (player2.getStrategy().equals(new Rock())) {
                System.out.println("Player2가 이겼습니다.");
            } else {
                System.out.println("Player1이 이겼습니다.");
            }
        } else {
            if (player2.getStrategy().equals(new Rock())) {
                System.out.println("Player1이 이겼습니다.");
            } else {
                System.out.println("Player2가 이겼습니다.");
            }
        }
        System.out.println();
    }
}
