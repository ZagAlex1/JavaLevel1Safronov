package ru.geekbrains.lessons.lesson8.Components;

import javax.swing.*;
import java.awt.*;

public class OperatorJButton extends JButton {
    public OperatorJButton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.BOLD,30));
        setBackground(new Color(189, 45, 65));
    }
}
