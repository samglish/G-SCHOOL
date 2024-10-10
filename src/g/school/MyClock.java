/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.school;

/**
 *
 * @author samglish
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.util.Date;

public class MyClock extends javax.swing.JFrame {

    public static void main(String[] args) {
        new MyClock();
    }

    public MyClock() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                  UIManager.
                     setLookAndFeel(
                      UIManager.getSystemLookAndFeelClassName()
                     );
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Date/heure en temps réel");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new MyPanel());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    MyClock() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class MyPanel extends JPanel 
    {
       private JLabel horloge;

       public MyPanel() {
         setLayout(new BorderLayout());
         horloge = new JLabel();
         horloge.setHorizontalAlignment(JLabel.CENTER);
         horloge.setFont(
           UIManager.getFont("Label.font").deriveFont(Font.BOLD, 50f)
         );
         horloge.setText(
           DateFormat.getDateTimeInstance().format(new Date())
         );
         add(horloge);

         Timer t = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              horloge.setText(
                 DateFormat.getDateTimeInstance().format(new Date())
              );
            }
         });
         t.setRepeats(true);
         t.setCoalesce(true);
         t.setInitialDelay(0);
         t.start();
       }
    }
}
