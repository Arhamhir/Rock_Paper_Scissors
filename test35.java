import javax.swing.JOptionPane;

public class test35 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is a Rock paper scissors game", "Welcome", JOptionPane.PLAIN_MESSAGE);
        int exit;
        String options[] = { "Rock", "Paper", "Scissors" };
        String options2[] = { "Exit", "Continue" };
        while (true) {
            int Uchoice = JOptionPane.showOptionDialog(null, "Enter your choice", "CHOOSE!",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE, null,
                    options, 0);
            double num = Math.random() * 3;
            num = Math.floor(num);
            int Cchoice = (int) num;
            int[][] answers = { { 0, 1, 2 }, { 2, 0, 1 }, { 1, 2, 0 } }; // 1-Computer wins 2-User wins 0-Tie
            if (answers[Uchoice][Cchoice] == 2) {
                exit = JOptionPane.showOptionDialog(null,
                        "You choosed " + options[Uchoice] + "\nComputer chooses " + options[Cchoice]
                                + "\n<           YOU WON!           >",
                        "Congratulations",
                        Uchoice, JOptionPane.PLAIN_MESSAGE, null, options2, 0);
                if ((exit == 0) || (exit == -1))
                    break;
            } else if (answers[Uchoice][Cchoice] == 1) {
                exit = JOptionPane.showOptionDialog(null,
                        "You choosed " + options[Uchoice] + "\nComputer chooses " + options[Cchoice]
                                + "\n<           Computer wins!           >",
                        "LOL! Get better",
                        Uchoice, JOptionPane.PLAIN_MESSAGE, null, options2, 0);
                if ((exit == 0) || (exit == -1))
                    break;
            } else if (answers[Uchoice][Cchoice] == 0) {
                exit = JOptionPane.showOptionDialog(null,
                        "You choosed " + options[Uchoice] + "\nComputer chooses " + options[Cchoice]
                                + "\n<           It's a Tie!           >",
                        "IT'S A TIE!!!",
                        Uchoice, JOptionPane.PLAIN_MESSAGE, null, options2, 0);
                if ((exit == 0) || (exit == -1))
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you for Playing", "Thanks", JOptionPane.PLAIN_MESSAGE);
    }
}
