package Kornel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUI extends JFrame {

    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicBox;

    public GUI() {
        super("Tytuł");
        setLayout(new FlowLayout());

        tf=new JTextField("This is a sentece", 20);
        tf.setFont(new Font("Serif", Font.PLAIN,14));

        add(tf);

        boldbox = new JCheckBox("Bold");
        italicBox = new JCheckBox("Italic");

        add(boldbox);
        add(italicBox);

        HandlerClass handler = new HandlerClass();

        boldbox.addItemListener(handler);
        italicBox.addItemListener(handler);





    }
    private class HandlerClass implements ItemListener {


        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            if(boldbox.isSelected() && italicBox.isSelected())
                font = new Font("serif",Font.BOLD + Font.ITALIC, 14);
            else if (boldbox.isSelected())
                font = new Font("serif",Font.BOLD, 14);
            else if (italicBox.isSelected())
                font = new Font("serif",Font.ITALIC, 14);
            else
                font = new Font("Serif",Font.PLAIN, 14);

            tf.setFont(font);
        }
    }
}


