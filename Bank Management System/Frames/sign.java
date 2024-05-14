package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
//import Classes.*;





public class sign extends JFrame implements ActionListener,MouseListener
{
	JPanel panel3;
	ImageIcon im,logoSet;
	JLabel cl,name,fatherName,mail,dob,radbutton,dep,marital,city,username,pin,address;
	JLabel heading,logo,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField NameField,fatherText,mailtext,dobField,addressField,cityField,userField,L6,L7;
	JPasswordField paf,pinField;
	Color cl3,cl4,newcolor;
	JRadioButton r1,r2,r3,married,unmarried,other;
	Font mfont,font,font2,font3;
	JButton submit,back;
	ButtonGroup bg,bgs;
	user u=null;
	users us=null;
	
	
	public sign(users us)
	{
		super("Sign Up page");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(350,50);
		this.setResizable(false);
		ImageIcon iframe = new ImageIcon("Images/mm.png");
		this.setIconImage(iframe.getImage());
		this.us=us;
		
		im = new ImageIcon("Images/abstract.jpg");
		ImageIcon bankL = new ImageIcon("Images/bankL.png");
		Image i1 = bankL.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon(i1);
		cl3 = new Color(237, 237, 237);
		cl4 = new Color(76, 112, 255);
		Color newcolor = new Color(203, 235, 233);
		mfont = new Font("Cambria", Font.PLAIN, 16);
		Font infoFont = new Font("Cambria",Font.BOLD,24);
		Font iFont = new Font("Cambria",Font.BOLD,16);
		
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(Color.decode("#585ce0"));
		
		JLabel info = new JLabel("Application Form NO.6211");
		info.setBounds(150,0,300,50);
		info.setFont(infoFont);
		info.setForeground(Color.WHITE);
		panel3.add(info);
		
		JLabel personalDetails  = new JLabel("Page 1:Personal Details");
		personalDetails.setBounds(200,45,200,30);
		personalDetails.setFont(iFont);
		personalDetails.setForeground(Color.WHITE);
		panel3.add(personalDetails);
		
		JLabel bankLogo = new JLabel(i2);
		bankLogo.setBounds(60,0,80,80);
		panel3.add(bankLogo);
		
		name = new JLabel("User Name:");
		name.setBounds(70,100,100,40);
		name.setForeground(Color.WHITE);
		panel3.add(name);
		NameField = new JTextField();
		NameField.setBounds(200,100,190,30);
		NameField.setBackground(cl3);
		NameField.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(NameField);
		
		
		fatherName = new JLabel("Father's Name:");
		fatherName.setBounds(70,150,100,40);
		fatherName.setForeground(Color.WHITE);
		panel3.add(fatherName);
		fatherText = new JTextField();
		fatherText.setBounds(200,150,190,30);
		fatherText.setBackground(cl3);
		fatherText.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(fatherText);
		
		
		radbutton = new JLabel("Gender : ");
		radbutton.setBounds(70,200,110,30);
		radbutton.setForeground(Color.WHITE);
		panel3.add(radbutton);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(200,200,70,30);
		panel3.add(r1);
		r2 = new JRadioButton("Female");
		r2.setBounds(280,200,70,30);
		panel3.add(r2);
		r3 = new JRadioButton("Other");
		r3.setBounds(360,200,70,30);
		panel3.add(r3);
		
		bgs = new ButtonGroup();
		bgs.add(r1);
		bgs.add(r2);
		bgs.add(r3);
		
		
		dob = new JLabel("Date of Birth:");
		dob.setBounds(70,250,100,40);
		dob.setForeground(Color.WHITE);
		panel3.add(dob);
		dobField = new JTextField();
		dobField.setBounds(200,250,190,30);
		dobField.setBackground(cl3);
		dobField.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(dobField);
		
		mail = new JLabel("Email Address:");
		mail.setBounds(70,300,100,40);
		mail.setForeground(Color.WHITE);
		panel3.add(mail);
		mailtext = new JTextField();
		mailtext.setBounds(200,300,190,30);
		mailtext.setBackground(cl3);
		mailtext.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(mailtext);
		
		marital = new JLabel("Marital Status : ");
		marital.setBounds(70,350,100,40);
		marital.setForeground(Color.WHITE);
		panel3.add(marital);
		
		married = new JRadioButton("Married");
		married.setBounds(200,350,70,30);
		panel3.add(married);
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(280,350,90,30);
		panel3.add(unmarried);
		other = new JRadioButton("Other");
		other.setBounds(380,350,70,30);
		panel3.add(other);
		
		bg = new ButtonGroup();
		bg.add(married);
		bg.add(unmarried);
		bg.add(other);
		
		
		address = new JLabel("Address:");
		address.setBounds(70,400,100,30);
		address.setForeground(Color.WHITE);
		panel3.add(address);
		addressField = new JTextField();
		addressField.setBounds(200,400,190,30);
		addressField.setBackground(cl3);
		addressField.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(addressField);
		
		city = new JLabel("City:");
		city.setBounds(70,450,100,30);
		city.setForeground(Color.WHITE);
		panel3.add(city);
		cityField = new JTextField();
		cityField.setBounds(200,450,190,30);
		cityField.setBackground(cl3);
		cityField.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(cityField);
		
		username = new JLabel("Your Name:");
		username.setBounds(70,500,100,30);
		username.setForeground(Color.WHITE);
		panel3.add(username);
		userField = new JTextField();
		userField.setBounds(200,500,190,30);
		userField.setBackground(cl3);
		userField.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(userField);
		
		pin = new JLabel("PIN:");
		pin.setBounds(70,550,100,30);
		pin.setForeground(Color.WHITE);
		panel3.add(pin);
		pinField = new JPasswordField();
		pinField.setBounds(200,550,190,30);
		pinField.setBackground(cl3);
		pinField.setEchoChar('*');
		pinField.setHorizontalAlignment(JLabel.LEFT);
		panel3.add(pinField);
		
		submit = new JButton("submit");
		submit.setBounds(500, 602, 80, 30);
		submit.setBackground(Color.RED);
		submit.setForeground(Color.WHITE);
		submit.setBorder(new LineBorder(Color.YELLOW));
		submit.addActionListener(this);
		submit.addMouseListener(this);
		panel3.add(submit);
		
		back = new JButton("Back");
		back.setBounds(400, 602, 80, 30);
		back.setBackground(Color.RED);
		back.setForeground(Color.WHITE);
		back.setBorder(new LineBorder(Color.YELLOW));
		back.addActionListener(this);
		back.addMouseListener(this);
		panel3.add(back);
			
		
		
		this.add(panel3);
	}
	
	
				public void mouseClicked(MouseEvent me){
					
				}
				public void mouseEntered(MouseEvent me){
					if(me.getSource()==submit){
					submit.setBackground(Color.CYAN);
					submit.setForeground(Color.BLACK);
					}
					else if(me.getSource()==back){
					back.setBackground(Color.CYAN);
					back.setForeground(Color.BLACK);
					}
				}
				public void mouseReleased(MouseEvent me){}
				public void mouseExited(MouseEvent me){
					if(me.getSource()==submit){
					submit.setBackground(Color.RED);
					submit.setForeground(Color.WHITE);
					}
					else if(me.getSource()==back){
					back.setBackground(Color.RED);
					back.setForeground(Color.WHITE);
					}
				}
				public void mousePressed(MouseEvent me){
					
				}
				
	
	public void actionPerformed(ActionEvent ae){
		
		String usname = NameField.getText();
		String fatherName = fatherText.getText();
		String mail = mailtext.getText();
		String dob = dobField.getText();
		String city = cityField.getText();
		String address = addressField.getText();
		String username = userField.getText();
		String pin = pinField.getText();
		
		String radbutton = null;
					if(r1.isSelected()){
						radbutton = "Male";
					}
					else if(r2.isSelected()){
						radbutton = "Female";
					}
					else if(r3.isSelected()){
						radbutton = "Other";
					}
					
		String marital = null;
					if(married.isSelected()){
						marital = "Married";
					}
					else if(unmarried.isSelected()){
						marital = "Unmarried";
						
					}
					else if(other.isSelected()){
						marital = "Other";
					}
		
			
					if(ae.getSource()==back){
						dispose();
						frame ff = new frame(us);
						ff.setVisible(true);
					}
				
					
					else if(ae.getSource()==submit && usname.isEmpty() || fatherName.isEmpty() || mail.isEmpty() || dob.isEmpty() || city.isEmpty()
					|| address.isEmpty() || username.isEmpty()||pin.isEmpty() )
					{
						JOptionPane.showMessageDialog(null,"Please fill up all the section","Warning!",2);
					
					}
				
				
					else
					{
						
						user u = new user(usname,address,fatherName,mail,username,pin,dob,radbutton,marital);
						us.addUser(u);
						
						
						
						
						
						
						JOptionPane.showMessageDialog(null,"Account create succesfully");
						dispose();
						frame ff = new frame(us);
						ff.setVisible(true);
						
						
					}
					
					
					
				}
		
		
		
	}
	
			