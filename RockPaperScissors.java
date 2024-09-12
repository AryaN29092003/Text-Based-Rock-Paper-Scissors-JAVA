import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class RockPaperScissors extends JFrame{
    private JTextField PCchoice;
    private JTextField Outcome;
    private JLabel PCinput;
    private JLabel Result;
    private JButton Rock;
    private JButton Paper;
    private JButton Scissors;
    private JPanel Main_RPS;


    String[] PCchoices = {"Rock", "Paper", "Scissors"};
    Random r = new Random();

    public RockPaperScissors(){



        Rock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int random = r.nextInt(PCchoices.length);
                String PCInput1 = PCchoices[random];
                if (PCInput1.equals("Rock")) {
                    Outcome.setText(" It's a tie");
                    PCchoice.setText(PCInput1);
                } else if (PCInput1.equals("Paper")) {
                    Outcome.setText("You Lost");
                    PCchoice.setText(PCInput1);
                } else if (PCInput1.equals("Scissors")) {
                    Outcome.setText("You Won");
                    PCchoice.setText(PCInput1);
                }
            }
        });

        Paper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int random = r.nextInt(PCchoices.length);
                String PCInput2 = PCchoices[random];
                if (PCInput2.equals("Paper")) {
                    Outcome.setText(" It's a tie");
                    PCchoice.setText(PCInput2);
                } else if (PCInput2.equals("Scissors")) {
                    Outcome.setText("You Lost");
                    PCchoice.setText(PCInput2);
                } else if (PCInput2.equals("Rock")) {
                    Outcome.setText("You Won");
                    PCchoice.setText(PCInput2);
                }
            }
        });
        Scissors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int random = r.nextInt(PCchoices.length);
                String PCInput3 = PCchoices[random];
                PCchoice.setText(PCInput3);
                if (PCInput3.equals("Scissors")) {
                    Outcome.setText(" It's a tie");
                    PCchoice.setText(PCInput3);
                } else if (PCInput3.equals("Rock")) {
                    Outcome.setText("You Lost");
                    PCchoice.setText(PCInput3);
                } else if (PCInput3.equals("Paper")) {
                    Outcome.setText("You Won");
                    PCchoice.setText(PCInput3);
                }
            }
        });
    }

    public static void main(String[] args) {

            RockPaperScissors j1 = new RockPaperScissors();
        j1.setContentPane(j1.Main_RPS);
        j1.setTitle("R&P&S");
        j1.setSize(550, 400);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
