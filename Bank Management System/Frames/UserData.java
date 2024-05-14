package Frames;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;
//import Classes.*;

public class UserData extends JFrame implements ActionListener
{

    private Container c;
    private ImageIcon icon;
    private JLabel label1;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private JButton btn1, btn2, btn3, btn4, btn5, nBtn;
    private Cursor cursor;
	

    private String[] column = { "User Name", "Address", "Email", "Father's Name", "Balance", "PIN" };
    private String[][] rows = {
		
								{"Md. Azizur Rahim 23-54123-3","Barishal","mdar@gmail.com","Sakib Ali","1500.0","1234"},
								{"Tanjim Islam Zinnia","Dhaka","tiz@gmail.com","Sahidul Islam","8100.0","5664"},
								{"Tirtho Bishas","Dhaka","tb@gmail.com","Rohul Sarkar ","440.0","7234"},
								{"MD. Saidur Rahman Rohan","Rajshahi","srr@gmail.com","Sujon Rahman","580.0","345678"},
								{"Zinnia","Bashundhara","zinnia@gmail.com","Arish Hoq","400.0","34567876545"},
								{"Munia","Kuril","mun@gmail.com","Sajid Islam","600.0","76545677"},
								{"Tanjim Zinnia","Rangpur","tanj@gmail.com","Sahid Sheikh","800.0","8373645"},
		
		
		
		
								};
	//adminPanel ad;
	user u;
	users us;
	

    UserData(user u,users us) 
	{
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("User Data");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		//this.ad=ad;
		this.u=u;
		this.us=us;
		

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        //icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
       // this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("User Data");
        label1.setBounds(200, 10, 400, 80);
        label1.setFont(f1);
        c.add(label1);

        // JButtons
        btn1 = new JButton("Refresh");
        btn1.setBounds(54, 418, 184, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
		btn1.addActionListener(this);
        c.add(btn1);

       /* btn2 = new JButton("Delete");
        btn2.setBounds(248, 418, 184, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
		//btn2.addActionListener(this);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);*/

        btn3 = new JButton("Add");
        btn3.setBounds(442, 418, 184, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.YELLOW);
        btn3.setBackground(Color.decode("#2E75B6"));
		btn3.addActionListener(this);
        c.add(btn3);

        btn4 = new JButton("Exit");
        btn4.setBounds(54, 480, 278, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#C00000"));
		btn4.addActionListener(this);
        c.add(btn4);

        btn5 = new JButton("Back");
        btn5.setBounds(342, 480, 284, 50);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#2E75B6"));
		btn5.addActionListener(this);
        c.add(btn5);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // JTable Layout
        table = new JTable(rows,column);
		//table.setEnabled(false);
		
       

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 578, 300);
        scroll.setBackground(Color.WHITE);
        c.add(scroll);
		
	
		
	}
		
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==btn1){
				dispose();
				UserData uu = new UserData(u,us);
				uu.setVisible(true);
			}
			
			else if(ae.getSource()==btn3){
				dispose();
				addAccount ac = new addAccount(u,us);
				ac.setVisible(true);
			}
			else if(ae.getSource()==btn4){
				dispose();
			}
			else if(ae.getSource()==btn5){
				dispose();
				adminPanel ap = new adminPanel(u,us);
				ap.setVisible(true);
			}
		}
		
		
}
	
	

 
