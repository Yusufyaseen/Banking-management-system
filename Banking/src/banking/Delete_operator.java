/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author karim hassan
 */
public class Delete_operator extends JFrame {

    JButton b1;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    
    
    public Delete_operator() {
        
        this.setTitle("Delete operator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setLocation(400, 200);
        this.setResizable(false);
       
        l1 = new JLabel("user name :");
        l2 = new JLabel("password :");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Delete");
        this.setLayout(null);
        l1.setBounds(20, 20, 100, 25);
        l2.setBounds(20,60 , 100, 25);
        t1.setBounds(140, 20, 100, 25);
        t2.setBounds(140, 60, 100, 25);
        b1.setBounds(30, 110, 100, 25);
        this.add(l1);this.add(l2);
        this.add(t1);this.add(t2);
        this.add(b1);
          
       
    }
     
}
