/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmanagementsystemproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Maddi Vivek
 */
public class About extends JFrame implements ActionListener{
    JButton back;
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        TextArea area = new TextArea("The Travel and Tourism Management System is a comprehensive software solution \n" +
"designed to streamline and enhance the operations of travel agencies, tour operators, and \n" +
"hospitality providers. This system integrates cutting-edge technology to facilitate efficient \n" +
"management and booking of travel-related services, resulting in improved customer \n" +
"experiences and increased business profitability.\n" +
"The Travel and Tourism Management System is a valuable tool for businesses in the \n" +
"travel and tourism industry, helping them streamline their operations, reduce \n" +
"administrative overhead, and ultimately offer superior services to their customers. By \n" +
"harnessing the power of technology, this system enables businesses to stay competitive in \n" +
"a rapidly evolving industry.\n" +
"In an era where travelers seek convenience, personalization, and efficiency, the Travel \n" +
"and Tourism Management System is the solution that empowers businesses to meet and \n" +
"exceed these expectations.",10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        back = new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
        }
    }   
    
    public static void main(String[] args){
        new About();
        
    }
}
