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
public class MouseListenerExample {
     public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("MouseListener Example");

        // Membuat label untuk menampilkan pesan
        JLabel label = new JLabel("Arahkan dan klik mouse pada area ini.");
        label.setBounds(50, 50, 300, 30); // Memperbaiki ukuran dan posisi label

        // Menambah MouseListener ke label
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Menambahkan label ke frame
        frame.add(label);

        // Mengatur frame
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Memperbaiki penulisan fungsi
    }
}
