package com.patikadev;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JTextField fld_username;
    private JTextField fld_password;
    private JButton btn_login;

    public Example() {

        setContentPane(wrapper);
        setSize(600, 300);
        setTitle("Uygulama Adı");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fld_username.getText().length() == 0 || fld_password.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Tüm alanları doldur", "Hata", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }


}
