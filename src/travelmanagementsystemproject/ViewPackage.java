/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Maddi Vivek
 */
public class ViewPackage extends JFrame implements ActionListener{
    JButton back;
    
    ViewPackage(String username){
        setBounds(450,200,900,450);
        getContentPane().setBackground(Color.white);
        setLayout(null); 
        
        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblpackage= new JLabel("Package");
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220,90,150,25);
        add(labelpackage);
        
        JLabel lblpersons = new JLabel("Persons");
        lblpersons.setBounds(30,130,150,25);
        add(lblpersons);
        
        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);
        
         JLabel lblid = new JLabel("ID");
        lblid.setBounds(30,170,150,25);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);
        
         JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30,210,150,25);
        add(lblnumber);
        
        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);
        
         JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30,250,150,25);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220,250,150,25);
        add(labelphone);
        
         JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30,290,150,25);
        add(lblprice);
        
        JLabel labelprice = new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);
        
        
        
        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,360,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,400,500);
        add(image);
        
       
        try{
            Conn c = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                 labelid.setText(rs.getString("id"));
                  labelnumber.setText(rs.getString("number"));
                   labelpackage.setText(rs.getString("package"));
                    labelprice.setText(rs.getString("price"));
                     labelpersons.setText(rs.getString("persons"));
                    labelphone.setText(rs.getString("phone"));
                 
            }
        }catch(Exception e){
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      setVisible(false);
    }
    public static void main(String[] args){
        new ViewPackage("Vinay@123");
    }
}
