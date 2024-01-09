
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,payments,viewBookedHotel,
            bookhotel,destinations,viewhotel,viewpackage,
            bookpackage,viewPersonalDetails,updatePersonalDetails,
            checkpackage,calculators,notepad;
    Dashboard(String username){
        //setBounds(0,0,1600,1000);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setLayout(null);
        
        JPanel p1 =new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));//header color
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 =i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel icon =new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
         
        
        JLabel heading =new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 =new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));//header color
        p2.setBounds(0,65,300,900);
        add(p2);
        
        
        addPersonalDetails =new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails =new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails =new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails =new JButton("Delete personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);
        
        checkpackage =new JButton("Check packages");
        checkpackage.setBounds(0,200,300,50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.white);
        checkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0,0,0,110));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
        bookpackage =new JButton("Book packages");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        
        viewpackage =new JButton("View packages");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotel =new JButton("View Hotels");
        viewhotel.setBounds(0,350,300,50);
        viewhotel.setBackground(new Color(0,0,102));
        viewhotel.setForeground(Color.white);
        viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotel.setMargin(new Insets(0,0,0,130));
        viewhotel.addActionListener(this);
        
        
        p2.add(viewhotel);
        
        bookhotel =new JButton("Book Hotels");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewBookedHotel =new JButton("View Booked Hotels");
        viewBookedHotel.setBounds(0,450,300,50);
        viewBookedHotel.setBackground(new Color(0,0,102));
        viewBookedHotel.setForeground(Color.white);
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0,0,0,70));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
     
        destinations =new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
         payments =new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculators =new JButton("Calculator");
        calculators.setBounds(0,600,300,50);
        calculators.setBackground(new Color(0,0,102));
        calculators.setForeground(Color.white);
        calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        notepad =new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        JButton about =new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        p2.add(about);

        ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 =i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel image =new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text =new JLabel("Travel and tourism management");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.white);
        text.setFont(new Font("Tahoma",Font.BOLD,55));
        image.add(text);
        
        
       
        
        
        
    
        
        
        setVisible(true);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        }else if (ae.getSource()== updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource()==checkpackage){
            new CheckPackage();
        }else if(ae.getSource()== bookpackage){
            new BookPackage(username);
        }else if (ae.getSource()== viewpackage){
            new ViewPackage(username);
        }else if  (ae.getSource()== viewhotel) {
            new CheckHotels(); 
        }else if  (ae.getSource()==destinations ) {
            new Destinations(); 
        }else if  (ae.getSource()==bookhotel ) {
            new BookHotel(username); 
        }else if  (ae.getSource()== viewBookedHotel) {
            new ViewBookedHotel(username); 
        }else if  (ae.getSource()== payments) {
            new Payment();
        }else if  (ae.getSource()== calculators) {
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e){
               e.printStackTrace(); 
            }
          
        }else if  (ae.getSource()== notepad) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e){
               e.printStackTrace(); 
            }
             
            
        
   
        }
    }
    
    
    
    
    public static void main(String[] args) {
        new Dashboard("");
        
    }
    
}
