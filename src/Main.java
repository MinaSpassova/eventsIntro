
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("clicker game");
        JLabel showNumber = new JLabel("0");
        JButton increase = new JButton("+");
        JButton decrease = new JButton("-");
        JButton reset = new JButton("reset");

        frame.setLayout(new GridLayout(2, 2));
        frame.setSize(500, 500);
        frame.add(showNumber);
        frame.add(reset);
        frame.add(increase);
        frame.add(decrease);

        frame.setVisible(true);

        increase.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int counter = Integer.parseInt(showNumber.getText());
                counter++;
                showNumber.setText(String.valueOf(counter));
            }
        });

        decrease.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int counter = Integer.parseInt(showNumber.getText());
                counter--;
                showNumber.setText(String.valueOf(counter));
            }
        });

        reset.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                showNumber.setText("0");
            }
        });

    }
}

