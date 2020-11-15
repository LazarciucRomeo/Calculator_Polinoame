import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Interfata {
    private JFrame j;
    private Polinom polinom1;
    private Polinom polinom2;
    public Interfata() {

        initializare();
    }

    public void initializare(){

        JFrame frame = new JFrame ("Calculator Polinoame");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(null);
        JLabel l = new JLabel (" Polinom1:");
        final JTextField tf = new JTextField(12);
        JLabel l1 = new JLabel (" Polinom2:");
        final JTextField tf1 = new JTextField(12);
        JLabel l2 = new JLabel (" Rezultat:");
        final JTextField tf2 = new JTextField(12);

        panel1.setLayout(new FlowLayout());
        panel1.add(l);
        panel1.add(tf);
        panel1.add(l1);
        panel1.add(tf1);
        panel1.add(l2);
        panel1.add(tf2);


        JButton b1 = new JButton("Adunare");
        JButton b2 = new JButton("Scadere");
        JButton b3 = new JButton("Derivare");
        JButton b4 = new JButton("Integrare");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);



        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String s1 = tf.getText();
                String s2 = tf1.getText();

                polinom1 = new Polinom();
                polinom2 = new Polinom();
                polinom1=PrelucrarePolinom.token(s1);
                polinom2=PrelucrarePolinom.token(s2);
                polinom1.Adunare(polinom2);
                tf2.setText(polinom1.toString());
            }

        });
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String s1 = tf.getText();
                String s2 = tf1.getText();


                polinom1 = new Polinom();
                polinom2 = new Polinom();
                polinom1=PrelucrarePolinom.token(s1);
                polinom2=PrelucrarePolinom.token(s2);
                polinom1.Scadere(polinom2);
                tf2.setText(polinom1.toString());
            }

        });
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String s1 = tf.getText();
                String s2 = tf1.getText();

                polinom1 = new Polinom();
                polinom1=PrelucrarePolinom.token(s1);
                polinom1.Derivare();
                tf2.setText(polinom1.toString());
            }

        });

        b4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String s1 = tf.getText();
                String s2 = tf1.getText();


                polinom1 = new Polinom();
                polinom1=PrelucrarePolinom.token(s1);
                polinom1.Integrare();
                tf2.setText(polinom1.toString());
            }

        });



    }
}

