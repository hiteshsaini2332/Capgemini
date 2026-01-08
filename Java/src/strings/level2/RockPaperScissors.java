package strings.level2;

import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int num = (int)(Math.random() * 3);
        if (num == 0) return "rock";
        if (num == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("rock") && computer.equals("paper")) return "Computer";

        if (user.equals("paper") && computer.equals("rock")) return "User";
        if (user.equals("paper") && computer.equals("scissors")) return "Computer";

        if (user.equals("scissors") && computer.equals("paper")) return "User";
        if (user.equals("scissors") && computer.equals("rock")) return "Computer";

        return "Invalid";
    }

    static String[][] calculateStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (computerWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }

    static void displayResults(String[][] games, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i+1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("Player\tWins\tWin Percentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][3];

        int userWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();

            String computer = computerChoice();
            String winner = findWinner(user, computer);

            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(results, stats);
    }
}
