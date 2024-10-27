/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPemrograman2;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Muhammad Rizqi
 */
public class ButtonExample {
     public static void main(String[] args) {
        // Membuat frame dengan judul "Button Example"
        JFrame frame = new JFrame("Button Example");
        
        // Membuat tombol dengan teks "Click Me"
        JButton button = new JButton("Click Me");

        // Menambah ActionListener ke JButton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // Mengatur posisi dan ukuran tombol
        button.setBounds(50, 50, 150, 30);

        // Menambahkan tombol ke frame
        frame.add(button);

        // Mengatur ukuran frame
        frame.setSize(300, 200);

        // Menonaktifkan layout manager
        frame.setLayout(null);

        // Menampilkan frame
        frame.setVisible(true);

        // Mengatur aksi saat frame ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
