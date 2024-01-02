import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class MyCalc1 extends WindowAdapter implements ActionListener {
    Frame f;
    Label l1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b11, b12, b13, b14, b15;
    Button badd, bsub, bmult, bdiv, bmod, bcalc, bclr, bpts, bneg, bback, bsqr, blog;
    double xd;
    double num1, num2, check;

    MyCalc1() {
        f = new Frame("MY CALCULATOR");
        // INSTANTIATING COMPONENTS
        l1 = new Label();
		//l1.setBackground(Color.WHITE);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(40, 40, 260, 60);
        b1 = new Button("1");
        b1.setBounds(50, 340, 50, 50);
		b1.setBackground(Color.CYAN);
        b2 = new Button("2");
        b2.setBounds(120, 340, 50, 50);
		b2.setBackground(Color.CYAN);
        b3 = new Button("3");
        b3.setBounds(190, 340, 50, 50);
		b3.setBackground(Color.CYAN);
        b4 = new Button("4");
        b4.setBounds(50, 270, 50, 50);
		b4.setBackground(Color.CYAN);
        b5 = new Button("5");
        b5.setBounds(120, 270, 50, 50);
		b5.setBackground(Color.CYAN);
        b6 = new Button("6");
        b6.setBounds(190, 270, 50, 50);
		b6.setBackground(Color.CYAN);
        b7 = new Button("7");
        b7.setBounds(50, 200, 50, 50);
		b7.setBackground(Color.CYAN);
        b8 = new Button("8");
        b8.setBounds(120, 200, 50, 50);
		b8.setBackground(Color.CYAN);
        b9 = new Button("9");
        b9.setBounds(190, 200, 50, 50);
		b9.setBackground(Color.CYAN);
        b0 = new Button("0");
        b0.setBounds(120, 410, 50, 50);
		b0.setBackground(Color.CYAN);
        b11 = new Button("Sin");
        b11.setBounds(120, 470, 50, 50);
        b12 = new Button("tan");
        b12.setBounds(190, 470, 50, 50);
        b13 = new Button("pow");
        b13.setBounds(260, 410, 50, 50);
        b14 = new Button("!");
        b14.setBounds(50, 470, 50, 50);
        b15 = new Button("cos");
        b15.setBounds(260, 470, 50, 50);
        bsqr = new Button("sqrt");
        bsqr.setBounds(260, 530, 50, 50);
        bneg = new Button("+/-");
        bneg.setBounds(50, 410, 50, 50);
        bpts = new Button(".");
        bpts.setBounds(190, 410, 50, 50);
        bback = new Button("back");
        bback.setBounds(120, 130, 50, 50);

        badd = new Button("+");
        badd.setBounds(260, 340, 50, 50);
        bsub = new Button("-");
        bsub.setBounds(260, 270, 50, 50);
        bmult = new Button("*");
        bmult.setBounds(260, 200, 50, 50);
        bdiv = new Button("/");
        bdiv.setBounds(260, 130, 50, 50);
        bmod = new Button("%");
        bmod.setBounds(190, 130, 50, 50);
        bcalc = new Button("=");
        bcalc.setBounds(50, 530, 125, 45);
        bclr = new Button("CE");
        bclr.setBounds(50, 130, 65, 50);
		bclr.setBackground(Color.RED);
		blog = new Button("log");
        blog.setBounds(190, 530, 50, 50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        bsqr.addActionListener(this);
        bpts.addActionListener(this);
        bneg.addActionListener(this);
        bback.addActionListener(this);
		blog.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);

        f.addWindowListener(this);
        // ADDING TO FRAME
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);

        f.add(badd);
        f.add(bsub);
        f.add(bmod);
        f.add(bmult);
        f.add(bdiv);
        f.add(bsqr);
        f.add(bmod);
        f.add(bcalc);
		f.add(blog);
        f.add(bclr);
        f.add(bpts);
        f.add(bneg);
        f.add(bback);

        f.setSize(360, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    // FOR CLOSING THE WINDOW
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String z, zt;
        // NUMBER BUTTON
        if (e.getSource() == b1) {
            zt = l1.getText();
            z = zt + "1";
            l1.setText(z);
        }
        if (e.getSource() == b2) {
            zt = l1.getText();
            z = zt + "2";
            l1.setText(z);
        }
        if (e.getSource() == b3) {
            zt = l1.getText();
            z = zt + "3";
            l1.setText(z);
        }
        if (e.getSource() == b4) {
            zt = l1.getText();
            z = zt + "4";
            l1.setText(z);
        }
        if (e.getSource() == b5) {
            zt = l1.getText();
            z = zt + "5";
            l1.setText(z);
        }
        if (e.getSource() == b6) {
            zt = l1.getText();
            z = zt + "6";
            l1.setText(z);
        }
        if (e.getSource() == b7) {
            zt = l1.getText();
            z = zt + "7";
            l1.setText(z);
        }
        if (e.getSource() == b8) {
            zt = l1.getText();
            z = zt + "8";
            l1.setText(z);
        }
        if (e.getSource() == b9) {
            zt = l1.getText();
            z = zt + "9";
            l1.setText(z);
        }
        if (e.getSource() == b0) {
            zt = l1.getText();
            z = zt + "0";
            l1.setText(z);
        }
        if (e.getSource() == bpts) { // ADD DECIMAL PTS
            zt = l1.getText();
            z = zt + ".";
            l1.setText(z);
        }
        if (e.getSource() == bneg) { // FOR NEGATIVE
            zt = l1.getText();
            z = "-" + zt;
            l1.setText(z);
        }

        if (e.getSource() == bback) { // FOR BACKSPACE
            zt = l1.getText();
            try {
                z = zt.substring(0, zt.length() - 1);
            } catch (StringIndexOutOfBoundsException f) {
                return;
            }
            l1.setText(z);
        }
        // AIRTHMETIC BUTTON
        if (e.getSource() == badd) { // FOR ADDITION
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 1;
        }
        if (e.getSource() == bsub) { // FOR SUBTRACTION
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 2;
        }
        if (e.getSource() == bmult) { // FOR MULTIPLICATION
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 3;
        }
        if (e.getSource() == bdiv) { // FOR DIVISION
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 4;
        }
        if (e.getSource() == bmod) { // FOR MOD/REMAINDER
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 5;
        }
        if (e.getSource() == b13) { // FOR MOD/REMAINDER
            try {
                num1 = Double.parseDouble(l1.getText());
            } catch (NumberFormatException f) {
                l1.setText("Invalid Format");
                return;
            }
            z = "";
            l1.setText(z);
            check = 6;
        }
        if (e.getSource() == b11) { // FOR SIN
            num1 = Double.parseDouble(l1.getText());
            double d = Math.toRadians(num1);
            xd = Math.sin(d);
            //l1.setText(String.valueOf(xd));
        }
        if (e.getSource() == b15) { // FOR COS
            num1 = Double.parseDouble(l1.getText());
            double d = Math.toRadians(num1);
            xd = Math.cos(d);
            //l1.setText(String.valueOf(xd));
        }
        if (e.getSource() == b12) { // FOR TAN
            num1 = Double.parseDouble(l1.getText());
            double d = Math.toRadians(num1);
            xd = Math.tan(d);
            //l1.setText(String.valueOf(xd));
        }
        if (e.getSource() == bsqr) { // FOR SQUARE ROOT
            num1 = Double.parseDouble(l1.getText());
            xd = Math.sqrt(num1);
            //l1.setText(String.valueOf(xd));
        }
        if (e.getSource() == b14) { // FOR FACTORIAL
            num1 = Double.parseDouble(l1.getText());
            double fact = 1;
            for (double i = 1; i <= num1; i++) {
                fact = fact * i;
            }
			xd=fact;
            //l1.setText(String.valueOf(fact));
        }
		if (e.getSource() == blog) {
            double num1 = Double.parseDouble(l1.getText());
			xd=Math.log10(num1);
            //l1.setText(String.valueOf(Math.log10(number)));
        }
        if (e.getSource() == bcalc) { // FOR CALCULATION
            num2 = Double.parseDouble(l1.getText());
            if (check == 1) { // ADDITION
                xd = num1 + num2;
                //l1.setText(String.valueOf(xd));
            }
            if (check == 2) { // SUBTRACTION
                xd = num1 - num2;
                //l1.setText(String.valueOf(xd));
            }
            if (check == 3) { // MULTIPLICATION
                xd = num1 * num2;
                //l1.setText(String.valueOf(xd));
            }
            if (check == 4) { // DIVISION
                try {
                    xd = num1 / num2;
                    //l1.setText(String.valueOf(xd));
                } catch (ArithmeticException f) {
                    l1.setText("Undefined");
                }
            }
            if (check == 5) { // MOD/REMAINDER
                xd = num1 % num2;
                //l1.setText(String.valueOf(xd));
            }
            if (check == 6) { // POW
                xd = Math.pow(num1, num2);
                //l1.setText(String.valueOf(xd));
            }
			l1.setText(String.valueOf(xd));
        }
        if (e.getSource() == bclr) { // CLEAR SCREEN
            l1.setText("");
        }
		//l1.setText(String.valueOf(xd));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->{        
        new MyCalc1();
    });
}
}
