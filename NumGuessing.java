import javax.swing.*;

public class NumGuessing {



        public static void main(String[] args) {
            int computeNumber = (int) (Math.random() * 100 + 1);
            int userAns = 0;
            int count = 1;
            try {
                while (userAns != computeNumber) {
                    String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                    userAns = Integer.parseInt(response);
                    JOptionPane.showMessageDialog(null, " " + determineGuess(userAns, computeNumber, count));
                    count++;
                }
            } catch (Exception e) {
            }
        }

        public static String determineGuess(int userAns, int computeNumber, int count) {
            if (userAns <= 0 || userAns > 100) {
                return "Your guess is invalid";
            } else if (userAns == computeNumber) {
                return "YEAH!! Your Number is Correct You Win the Game! \n Total Guesses : " + count;
            } else if (userAns > computeNumber) {
                return "Guess is too high, try again, \n Try Number : " + count;
            } else if (userAns < computeNumber) {
                return "Guess is too low, try again, \n Try Number :  " + count;
            } else {
                return "Your guess is incorrect \n Try Number : " + count;
            }
        }
    }

