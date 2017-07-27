/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajan
 */
import java.math.*;
public class Calculator extends javax.swing.JFrame {
    private boolean zerodisp;
    private boolean decdisp;
    private boolean dgrrad;
    private boolean sh;
    
    private byte op;
    
    private double ina;
    private double inb;
    private double out;
    public Calculator() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        display1 = new javax.swing.JTextField();
        memorydisplay = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();
        memorysave = new javax.swing.JButton();
        percentage = new javax.swing.JButton();
        onedividebyx = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        radians = new javax.swing.JRadioButton();
        cos = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        add = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        six = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        memoryclear = new javax.swing.JButton();
        memoryread = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        cuberoot = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        shift = new javax.swing.JToggleButton();
        backspace = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setResizable(false);

        display1.setBackground(new java.awt.Color(0, 0, 0));
        display1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        display1.setForeground(new java.awt.Color(255, 255, 255));
        display1.setText("0");
        display1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        display1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display1.setFocusable(false);

        memorydisplay.setBackground(new java.awt.Color(0, 0, 0));
        memorydisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memorydisplay.setForeground(new java.awt.Color(255, 255, 255));
        memorydisplay.setText("0");
        memorydisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        memorydisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memorydisplay.setFocusable(false);

        display2.setBackground(new java.awt.Color(0, 0, 0));
        display2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 255, 255));
        display2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        display2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display2.setFocusable(false);

        memorysave.setBackground(new java.awt.Color(0, 0, 0));
        memorysave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        memorysave.setForeground(new java.awt.Color(255, 255, 255));
        memorysave.setText("MS");
        memorysave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        memorysave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memorysave.setFocusable(false);
        memorysave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorysaveActionPerformed(evt);
            }
        });

        percentage.setBackground(new java.awt.Color(0, 0, 0));
        percentage.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("%");
        percentage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        percentage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        percentage.setFocusable(false);
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        onedividebyx.setBackground(new java.awt.Color(0, 0, 0));
        onedividebyx.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        onedividebyx.setForeground(new java.awt.Color(255, 255, 255));
        onedividebyx.setText("1/x");
        onedividebyx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        onedividebyx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onedividebyx.setFocusable(false);
        onedividebyx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedividebyxActionPerformed(evt);
            }
        });

        degrees.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(degrees);
        degrees.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        degrees.setForeground(new java.awt.Color(255, 255, 255));
        degrees.setText("Degree");
        degrees.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        degrees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        degrees.setFocusable(false);
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });

        radians.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radians);
        radians.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        radians.setForeground(new java.awt.Color(255, 255, 255));
        radians.setSelected(true);
        radians.setText("Radian");
        radians.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        radians.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radians.setFocusable(false);
        radians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansActionPerformed(evt);
            }
        });

        cos.setBackground(new java.awt.Color(0, 0, 0));
        cos.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        cos.setForeground(new java.awt.Color(255, 255, 255));
        cos.setText("Cos");
        cos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        pi.setBackground(new java.awt.Color(0, 0, 0));
        pi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        pi.setForeground(new java.awt.Color(255, 255, 255));
        pi.setText("π");
        pi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        pi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pi.setFocusable(false);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });

        tan.setBackground(new java.awt.Color(0, 0, 0));
        tan.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        tan.setForeground(new java.awt.Color(255, 255, 255));
        tan.setText("Tan");
        tan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        sin.setBackground(new java.awt.Color(0, 0, 0));
        sin.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        sin.setForeground(new java.awt.Color(255, 255, 255));
        sin.setText("Sin");
        sin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(0, 0, 0));
        seven.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("7");
        seven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(0, 0, 0));
        eight.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("8");
        eight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(0, 0, 0));
        nine.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("9");
        nine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        squared.setBackground(new java.awt.Color(0, 0, 0));
        squared.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        squared.setForeground(new java.awt.Color(255, 255, 255));
        squared.setText("x^2");
        squared.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        squared.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squared.setFocusable(false);
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("+");
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        subtract.setBackground(new java.awt.Color(0, 0, 0));
        subtract.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        subtract.setForeground(new java.awt.Color(255, 255, 255));
        subtract.setText("-");
        subtract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtract.setFocusable(false);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        squareroot.setBackground(new java.awt.Color(0, 0, 0));
        squareroot.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        squareroot.setForeground(new java.awt.Color(255, 255, 255));
        squareroot.setText("√x");
        squareroot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        squareroot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squareroot.setFocusable(false);
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(0, 0, 0));
        six.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("6");
        six.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(0, 0, 0));
        five.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("5");
        five.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(0, 0, 0));
        four.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("4");
        four.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(0, 0, 0));
        one.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("1");
        one.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(0, 0, 0));
        two.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("2");
        two.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(0, 0, 0));
        three.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("3");
        three.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        cubed.setBackground(new java.awt.Color(0, 0, 0));
        cubed.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        cubed.setForeground(new java.awt.Color(255, 255, 255));
        cubed.setText("x^3");
        cubed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        cubed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cubed.setFocusable(false);
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });

        memoryclear.setBackground(new java.awt.Color(0, 0, 0));
        memoryclear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        memoryclear.setForeground(new java.awt.Color(255, 255, 255));
        memoryclear.setText("MC");
        memoryclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        memoryclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryclear.setFocusable(false);
        memoryclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryclearActionPerformed(evt);
            }
        });

        memoryread.setBackground(new java.awt.Color(0, 0, 0));
        memoryread.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        memoryread.setForeground(new java.awt.Color(255, 255, 255));
        memoryread.setText("MR");
        memoryread.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        memoryread.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryread.setFocusable(false);
        memoryread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryreadActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(0, 0, 0));
        multiply.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setText("*");
        multiply.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiply.setFocusable(false);
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(0, 0, 0));
        divide.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        divide.setForeground(new java.awt.Color(255, 255, 255));
        divide.setText("/");
        divide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        cuberoot.setBackground(new java.awt.Color(0, 0, 0));
        cuberoot.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        cuberoot.setForeground(new java.awt.Color(255, 255, 255));
        cuberoot.setText("3√x");
        cuberoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        cuberoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuberoot.setFocusable(false);
        cuberoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootActionPerformed(evt);
            }
        });

        negate.setBackground(new java.awt.Color(0, 0, 0));
        negate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        negate.setForeground(new java.awt.Color(255, 255, 255));
        negate.setText("±");
        negate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        negate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        negate.setFocusable(false);
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });

        dot.setBackground(new java.awt.Color(0, 0, 0));
        dot.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        dot.setForeground(new java.awt.Color(255, 255, 255));
        dot.setText(".");
        dot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        dot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dot.setFocusable(false);
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(0, 0, 0));
        zero.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(0, 0, 0));
        equals.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        equals.setForeground(new java.awt.Color(255, 255, 255));
        equals.setText("=");
        equals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("C");
        reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 0, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CE");
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        shift.setBackground(new java.awt.Color(0, 0, 0));
        shift.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        shift.setForeground(new java.awt.Color(255, 255, 255));
        shift.setText("Sh");
        shift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        shift.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shift.setFocusable(false);
        shift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftMouseClicked(evt);
            }
        });

        backspace.setBackground(new java.awt.Color(0, 0, 0));
        backspace.setForeground(new java.awt.Color(255, 255, 255));
        backspace.setText("BC");
        backspace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display1)
                    .addComponent(display2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(negate, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(memoryread, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(memoryclear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(memorysave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(degrees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radians, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memorydisplay)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(onedividebyx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(pi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memorydisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memorysave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryclear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memoryread, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onedividebyx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radians)
                    .addComponent(degrees))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shift)
                    .addComponent(pi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(squared, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(squareroot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cubed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuberoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(negate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {memorydisplay, memorysave});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cos, pi, shift, tan});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"0");
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
       if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"1");
        zerodisp=true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"2");
        zerodisp=true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
       if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"3");
        zerodisp=true;
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
          if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"4");
        zerodisp=true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
         if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"5");
        zerodisp=true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
     if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"6");
        zerodisp=true;
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
          if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"7");
        zerodisp=true;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
          if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"8");
        zerodisp=true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
          if(!zerodisp && !decdisp){
            display1.setText(null);
        }
        display1.setText(display1.getText()+"9");
        zerodisp=true;
    }//GEN-LAST:event_nineActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if(!decdisp){
            display1.setText(display1.getText()+".");
            decdisp=true;
        }
    }//GEN-LAST:event_dotActionPerformed

    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText()));
        out = inb * -1;
        if(out>-100000000 && out<100000000){
            display1.setText(String.valueOf(out));
            }
        else{
           display1.setText("Error"); 
        }
        decdisp=true;
        out=0;  
    }//GEN-LAST:event_negateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
      display1.setText("0");
      display2.setText(null);
      zerodisp=false;
      decdisp=false;
      ina=0;
      inb=0;
      out=0;
    }//GEN-LAST:event_resetActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        display1.setText("0");
        zerodisp=false;
        decdisp=false;
    }//GEN-LAST:event_clearActionPerformed

    private void memoryreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryreadActionPerformed
        display1.setText(String.valueOf(memorydisplay.getText()));
    }//GEN-LAST:event_memoryreadActionPerformed

    private void memoryclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryclearActionPerformed
        memorydisplay.setText("0");
    }//GEN-LAST:event_memoryclearActionPerformed

    private void memorysaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorysaveActionPerformed
        memorydisplay.setText(String.valueOf(display1.getText()));
    }//GEN-LAST:event_memorysaveActionPerformed

    private void onedividebyxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedividebyxActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=1/inb;
        if(out>-100000000 && out<100000000){
            display1.setText(String.valueOf(out));
            }
        else{
           display1.setText("Error"); 
        }
        display2.setText("1/"+String.valueOf(inb));
        out=0;
        op=0;
    }//GEN-LAST:event_onedividebyxActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
        display1.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_piActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=inb*inb;
        if(out>-100000000 && out<100000000){
            display1.setText(String.valueOf(out));
            }
        else{
           display1.setText("Error"); 
        }
        display2.setText(String.valueOf(inb+"^2"));
        out=0;
        op=0;
    }//GEN-LAST:event_squaredActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=Math.sqrt(inb);
        display1.setText(String.valueOf(out));
        
        display2.setText("√"+String.valueOf(inb));
        out=0;
        op=0;
    }//GEN-LAST:event_squarerootActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
         inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=inb*inb*inb;
        if(out>-100000000 && out<100000000){
            display1.setText(String.valueOf(out));
            }
        else{
           display1.setText("Error"); 
        }
        display2.setText(String.valueOf(inb+"^3"));
        out=0;
        op=0;
    }//GEN-LAST:event_cubedActionPerformed

    private void cuberootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootActionPerformed
         inb=Double.parseDouble(String.valueOf(display1.getText()));
        out=Math.cbrt(inb);
        display1.setText(String.valueOf(out));
        
        display2.setText("3√"+String.valueOf(inb));
        out=0;
        op=0;
    }//GEN-LAST:event_cuberootActionPerformed

    private void shiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMouseClicked
        if(!sh){
           sh=true; 
        }
        else{
            sh=false;
        }
    }//GEN-LAST:event_shiftMouseClicked

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
        inb=Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
                display2.setText("sin("+String.valueOf(inb)+")");
              inb=inb*0.0174532925;  
            }
          out=Math.sin(inb);
        }
        else{
            display2.setText("sinh("+String.valueOf(inb)+")");
           out=Math.sinh(inb); 
    }//GEN-LAST:event_sinActionPerformed
    display1.setText(String.valueOf(out));
    out=0;
    op=0;
    }
    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
           inb=Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
                display2.setText("cos("+String.valueOf(inb)+")");
              inb=inb*0.0174532925;  
            }
          out=Math.cos(inb);
        }
        else{
            display2.setText("cosh("+String.valueOf(inb)+")");
           out=Math.cosh(inb); 
    }                                   
    display1.setText(String.valueOf(out));
    out=0;
    op=0;
    }//GEN-LAST:event_cosActionPerformed

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
           inb=Double.parseDouble(String.valueOf(display1.getText()));
        if(!sh){
            if(!dgrrad){
                display2.setText("tan("+String.valueOf(inb)+")");
              inb=inb*0.0174532925;  
            }
          out=Math.tan(inb);
        }
        else{
            display2.setText("tanh("+String.valueOf(inb)+")");
           out=Math.tanh(inb); 
    }                                   
    display1.setText(String.valueOf(out));
    out=0;
    op=0;
    }//GEN-LAST:event_tanActionPerformed

    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        dgrrad=false;
    }//GEN-LAST:event_degreesActionPerformed

    private void radiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansActionPerformed
        dgrrad=true;
    }//GEN-LAST:event_radiansActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina+"+"));
        op=1;
        decdisp=false;
        zerodisp=false;
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
          if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina+"-"));
        op=2;
        decdisp=false;
        zerodisp=false;
    }//GEN-LAST:event_subtractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
          if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina+"*"));
        op=3;
        decdisp=false;
        zerodisp=false;
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
          if(op==0){
            ina=Double.parseDouble(String.valueOf(display1.getText()));
        }
        else{
            inb=Double.parseDouble(String.valueOf(display1.getText()));
        }
        if(op==1){
            ina=ina+inb;
        }
        if(op==2){
            ina=ina-inb;
        }
        if(op==3){
            ina=ina*inb;
        }
        if(op==4){
            ina=ina/inb;
        }
        if(op==5){
            ina=ina*inb/100;
        }
        display1.setText("0");
        display2.setText(String.valueOf(ina+"/"));
        op=4;
        decdisp=false;
        zerodisp=false;
    }//GEN-LAST:event_divideActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
      ina=Double.parseDouble(String.valueOf(display1.getText()));
      display1.setText("0");
      display2.setText(String.valueOf(ina)+"%(");
      decdisp=false;
      zerodisp=false;
      op=5;
    }//GEN-LAST:event_percentageActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
       inb=Double.parseDouble(String.valueOf(display1.getText()));
       if(op==0){
           out=inb;
           display2.setText(display2.getText()+String.valueOf(inb));
       }
       if(op==1){
           out=ina+inb;
           display2.setText(String.valueOf(inb));
       }
       if(op==2){
           out=ina-inb;
           display2.setText(display2.getText()+String.valueOf(inb));
       }
       if(op==3){
           out=ina*inb;
           display2.setText(display2.getText()+String.valueOf(inb));
       }
       if(op==4){
           out=ina/inb;
           display2.setText(display2.getText()+String.valueOf(inb));
       }
       if(op==5){
           out=ina*inb/100;
           display2.setText(display2.getText()+String.valueOf(inb)+")");
       }
       if(out>-100000000 && out<100000000){
            display1.setText(String.valueOf(out));
            }
        else{
           display1.setText("Error"); 
        }
       ina=0;
       inb=0;
       out=0;
       op=0;
       decdisp=false;
       zerodisp=false;
    }//GEN-LAST:event_equalsActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
              String fullText = display1.getText();
        int fullTextLength = fullText.length();
        String backSpaceText = fullText.substring(0, fullTextLength-1);
        display1.setText(backSpaceText);
    }//GEN-LAST:event_backspaceActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cubed;
    private javax.swing.JButton cuberoot;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton memoryclear;
    private javax.swing.JTextField memorydisplay;
    private javax.swing.JButton memoryread;
    private javax.swing.JButton memorysave;
    private javax.swing.JButton multiply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onedividebyx;
    private javax.swing.JButton percentage;
    private javax.swing.JButton pi;
    private javax.swing.JRadioButton radians;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JToggleButton shift;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton squared;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton subtract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
