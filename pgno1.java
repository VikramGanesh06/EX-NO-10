package Exercise10;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class pgno1 implements ActionListener
{   
        JFrame f= new JFrame();
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
        JButton b1,b2,b3,b4,mb;
        int count1=0,sub1=0;
        int count2=0,sub3=0;
        int count3=0,sub2=0;
        int tot=sub1+sub2+sub3;
        String counts1=Integer.toString(count1),Subtotals1=Integer.toString(sub1),Totals1=Integer.toString(tot);
        String counts2=Integer.toString(count1),Subtotals2=Integer.toString(sub2);
        String counts3=Integer.toString(count1),Subtotals3=Integer.toString(sub3);
   pgno1()
    {
        f.setVisible(true);
        f.setSize(1000, 500);
        f.setLayout(null);
        f.setTitle("Ordering System");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l11=new JLabel();
        l11.setText("Price ");
        l11.setBounds(295, 1, 100, 100);
        f.add(l11);
        l1=new JLabel();
        l1.setText("$15");
        l1.setBounds(300, 50, 100, 100);
        f.add(l1);
        l12=new JLabel();
        l12.setText("Count ");
        l12.setBounds(435, 1, 100, 100);
        f.add(l12);
        l4=new JLabel(); 
        l4.setText(counts1);
        l4.setBounds(450, 50, 100, 100);
        f.add(l4);
        l13=new JLabel();
        l13.setText("Sub Total ");
        l13.setBounds(575, 1, 100, 100);
        f.add(l13);
        l7=new JLabel();
        l7.setText(Subtotals1);
        l7.setBounds(600, 50, 100, 100);
        f.add(l7);
        l2=new JLabel();  
        l2.setText("$20");
        l2.setBounds(300, 120, 100, 100);
        f.add(l2);
        l5=new JLabel();
        l5.setText(counts2);
        l5.setBounds(450, 120, 100, 100);
        f.add(l5);
        l8=new JLabel();
        l8.setText(Subtotals2);
        l8.setBounds(600, 120, 100, 100);
        f.add(l8);
        l3=new JLabel();
        l3.setText("$100");
        l3.setBounds(300, 200, 100, 100);
        f.add(l3);
        l6=new JLabel();
        l6.setText(counts3);
        l6.setBounds(450, 200, 100, 100);
        f.add(l6);
        l9=new JLabel();
        l9.setText(Subtotals3);
        l9.setBounds(600, 200, 100, 100);
        f.add(l9);
        l10=new JLabel();    
        l10.setText(Totals1);
        l10.setBounds(600, 300, 100, 100);
        f.add(l10);
        l14=new JLabel("Total :");       
        l14.setBounds(550, 300, 100, 100);
        f.add(l14);
        b1=new JButton("Tea");
        b1.setBounds(100, 80, 100, 50);
        f.add(b1);
        b2=new JButton("Egg Bucks");
        b2.setBounds(100, 150, 100, 50);
        f.add(b2);
        b3=new JButton("Burger");
        b3.setBounds(100, 230, 100, 50);
        f.add(b3);
        b4=new JButton("End sale");
        b4.setBounds(450, 400, 100, 50);
        b1.addActionListener(this);
        f.add(b4);       
    }  
   
    public static void main(String[] args) 
    {
        new pgno1();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      
                
                count1+=1;
                sub1=count1*15;
                Subtotals1=Integer.toString(sub1);
                counts1=Integer.toString(count1);
                tot=sub1+sub2+sub3;
                Totals1=Integer.toString(tot);
                l4.setText(counts1);
                l7.setText(Subtotals1);
                l10.setText(Totals1);
            
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
