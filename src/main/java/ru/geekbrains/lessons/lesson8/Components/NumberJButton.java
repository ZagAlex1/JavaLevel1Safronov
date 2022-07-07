package ru.geekbrains.lessons.lesson8.Components;

import javax.swing.*;
import java.awt.*;

public class NumberJButton extends JButton {
    public NumberJButton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN,25));
        setBackground(new Color(206, 222, 242));
    }
}
