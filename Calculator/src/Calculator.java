import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

    JFrame jf;
    JLabel display;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton bclear,bdot,bequal,badd,bminus,bmultiply,bdivide;
    int op;
    float ans;
    float temp;
    boolean newcalculation = true;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(555, 650);
        jf.setLocation(400, 150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display =new JLabel();
        display.setBounds(50, 30, 455, 45);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Serif", Font.PLAIN, 20));
        display.setBackground(Color.gray);
        display.setForeground(Color.WHITE);
        display.setOpaque(true);
        jf.add(display);


        b7=new JButton("7");
        b7.setBounds(50, 130, 80, 80);
        b7.setFont(new Font("Arial",Font.PLAIN,40));
        b7.addActionListener(this);
        jf.add(b7);

        b8=new JButton("8");
        b8.setBounds(175, 130, 80, 80);
        b8.setFont(new Font("Arial",Font.PLAIN,40));
        b8.addActionListener(this);
        jf.add(b8);

        b9=new JButton("9");
        b9.setBounds(300, 130, 80, 80);
        b9.setFont(new Font("Arial",Font.PLAIN,40));
        b9.addActionListener(this);
        jf.add(b9);

        b4=new JButton("4");
        b4.setBounds(50, 250, 80, 80);
        b4.setFont(new Font("Arial",Font.PLAIN,40));
        b4.addActionListener(this);
        jf.add(b4);

        b5=new JButton("5");
        b5.setBounds(175, 250, 80, 80);
        b5.setFont(new Font("Arial",Font.PLAIN,40));
        b5.addActionListener(this);
        jf.add(b5);

        b6=new JButton("6");
        b6.setBounds(300, 250, 80, 80);
        b6.setFont(new Font("Arial",Font.PLAIN,40));
        b6.addActionListener(this);
        jf.add(b6);

        b1=new JButton("1");
        b1.setBounds(50, 370, 80, 80);
        b1.setFont(new Font("Arial",Font.PLAIN,40));
        b1.addActionListener(this);
        jf.add(b1);

        b2=new JButton("2");
        b2.setBounds(175, 370, 80, 80);
        b2.setFont(new Font("Arial",Font.PLAIN,40));
        b2.addActionListener(this);
        jf.add(b2);

        b3=new JButton("3");
        b3.setBounds(300, 370, 80, 80);
        b3.setFont(new Font("Arial",Font.PLAIN,40));
        b3.addActionListener(this);
        jf.add(b3);

        bdot=new JButton(".");
        bdot.setBounds(50, 490, 80, 80);
        bdot.setFont(new Font("Arial",Font.PLAIN,40));
        bdot.addActionListener(this);
        jf.add(bdot);

        b0=new JButton("0");
        b0.setBounds(175, 490, 80, 80);
        b0.setFont(new Font("Arial",Font.PLAIN,40));
        b0.addActionListener(this);
        jf.add(b0);

        bequal=new JButton("=");
        bequal.setBackground(Color.DARK_GRAY);
        bequal.setBounds(300, 490, 80, 80);
        bequal.setFont(new Font("Arial",Font.PLAIN,40));
        bequal.addActionListener(this);
        jf.add(bequal);

        bdivide=new JButton("/");
        bdivide.setBackground(Color.gray);
        bdivide.setBounds(425, 130, 80, 80);
        bdivide.setFont(new Font("Arial",Font.PLAIN,40));
        bdivide.addActionListener(this);
        jf.add(bdivide);

        bmultiply=new JButton("X");
        bmultiply.setBackground(Color.gray);
        bmultiply.setBounds(425, 250, 80, 80);
        bmultiply.setFont(new Font("Arial",Font.PLAIN,40));
        bmultiply.addActionListener(this);
        jf.add(bmultiply);

        bminus=new JButton("-");
        bminus.setBackground(Color.gray);
        bminus.setBounds(425, 370, 80, 80);
        bminus.setFont(new Font("Arial",Font.PLAIN,40));
        bminus.addActionListener(this);
        jf.add(bminus);

        badd=new JButton("+");
        badd.setBackground(Color.gray);
        badd.setBounds(425, 490, 80, 80);
        badd.setFont(new Font("Arial",Font.PLAIN,40));
        badd.addActionListener(this);
        jf.add(badd);

        bclear=new JButton("Clear");
        bclear.setBackground(Color.gray);
        bclear.setBounds(50, 85, 100, 30);
        bclear.setFont(new Font("Arial",Font.PLAIN,20));
        bclear.addActionListener(this);
        jf.add(bclear);
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
    }

    public float Calculate(float first, float second, int oprat) {
        switch (oprat) {
            case 1:
                return first + second;
            case 2:
                return first - second;
            case 3:
                if (second != 0) {
                    return first / second;
                } else {
                    display.setText("Zero Error");
                    return 0;
                }
            case 4:
                return first * second;
            default:
                return 0;
        }
    }


    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b0){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"0");
        }
        
        else if(e.getSource() == b1){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"1");
        }
        
        else if(e.getSource() == b2){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"2");
        }
        
        else if(e.getSource() == b3){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"3");
        }
        
        else if(e.getSource() == b4){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"4");
        }
        
        else if(e.getSource() == b5){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"5");
        }
        
        else if(e.getSource() == b6){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"6");
        }
        
        else if(e.getSource() == b7){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"7");
        }
        
        else if(e.getSource() == b8){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"8");
        }
        
        else if(e.getSource() == b9){
            if(newcalculation){
                display.setText("");
                newcalculation=false;
            }
            display.setText(display.getText()+"9");
        }
        
        else if(e.getSource() == bdot) {
            if(newcalculation || display.getText().isEmpty()){
                display.setText("0");
                newcalculation=false;
            }
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }
        }
        
        
        else if(e.getSource() == bequal) {
            if (op != 0) {
                temp = Float.parseFloat(display.getText());
                ans = Calculate(ans, temp, op);
                display.setText(String.valueOf(ans));
                newcalculation=true;
                op=0;
            }
        }
        
        else if(e.getSource() == badd){
            if (op==0){
                ans=Float.parseFloat(display.getText());
                op=1;
                newcalculation=true;
            }else{
                temp=Float.parseFloat(display.getText());
                ans=Calculate(ans,temp,op);
                op=1;
                newcalculation=true;
            }
        }
        
        else if(e.getSource() == bminus){
            if (op==0){
                ans=Float.parseFloat(display.getText());
                op=2;
                newcalculation=true;
            }else{
                temp=Float.parseFloat(display.getText());
                ans=Calculate(ans,temp,op);
                op=2;
                newcalculation=true;
            }
        }
        
        else if(e.getSource() == bdivide){
            if (op==0){
                ans=Float.parseFloat(display.getText());
                op=3;
                newcalculation=true;
            }else{
                temp=Float.parseFloat(display.getText());
                ans=Calculate(ans,temp,op);
                op=3;
                newcalculation=true;
            }
        }
        
        else if(e.getSource() == bmultiply){
            if (op==0){
                ans=Float.parseFloat(display.getText());
                op=4;
                newcalculation=true;
            }else{
                temp=Float.parseFloat(display.getText());
                ans=Calculate(ans,temp,op);
                op=4;
                newcalculation=true;
            }
        }
        
        else if(e.getSource() == bclear){
            display.setText("");
            op=0;
        }
    }
}