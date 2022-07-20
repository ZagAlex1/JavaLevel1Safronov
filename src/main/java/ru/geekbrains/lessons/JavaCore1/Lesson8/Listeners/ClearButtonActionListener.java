package ru.geekbrains.lessons.JavaCore1.Lesson8.Listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonActionListener implements ActionListener {

    private JTextField inputField;

    public ClearButtonActionListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inputField.setText("");
    }
}
