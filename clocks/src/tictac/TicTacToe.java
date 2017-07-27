package tictac;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Notification;
import tictac.Computer;
import tictac.Human;
import tictac.Player;


public class TicTacToe extends javax.swing.JFrame {
    static int winComb[][] = {{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};
    public static int[][] state = {{0,0,0},{0,0,0},{0,0,0}};
    Player pl1 = new Human();
    Player pl2 = new Computer("mind\\layer");
    public static int butClicked = 0;
    int w1=0 , w2 = 0 , dr = 0;
    public TicTacToe() {
        initComponents();
    }
    
    public void start(){
        if(w1==500)System.exit(0);
        int current = 1 , turn = 1;
        int w=0;
        while((w=checkWin(turn,state))==0)
        {
            if(current == 1)
            {
                pl1.playTurn(1,turn);
                refreshGrid();
                current = 2;
            }
            else if(current == 2 )
            {
                pl2.playTurn(2,turn);
                refreshGrid();
                current = 1;
            }
            turn++;
            try {Thread.sleep(0);} catch (InterruptedException ex) {Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);}
        }
        if(w==1)
        {
            pl1.notifyWin(1);
            pl2.notifyLose(2);
            print("Player 1 Won The Game !");
            w1++;
        }
        else if(w==2)
        {
            pl2.notifyWin(1);
            pl1.notifyLose(2);
            print("Player 2 Won The Game !");
            w2++;
        }
        else if(w==-1)
        {
            print("Game DRAW !");
            dr++;
        }
        try {Thread.sleep(0);} catch (InterruptedException ex) {Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public void refreshGrid(){
        b11.setText(state[0][0]==1?"X":(state[0][0]==2?"O":""));
        b12.setText(state[0][1]==1?"X":(state[0][1]==2?"O":""));
        b13.setText(state[0][2]==1?"X":(state[0][2]==2?"O":""));
        b21.setText(state[1][0]==1?"X":(state[1][0]==2?"O":""));
        b22.setText(state[1][1]==1?"X":(state[1][1]==2?"O":""));
        b23.setText(state[1][2]==1?"X":(state[1][2]==2?"O":""));
        b31.setText(state[2][0]==1?"X":(state[2][0]==2?"O":""));
        b32.setText(state[2][1]==1?"X":(state[2][1]==2?"O":""));
        b33.setText(state[2][2]==1?"X":(state[2][2]==2?"O":""));
        jLabel1.setText(" X wins : "+w1);
        jLabel2.setText(" O wins : "+w2);
        jLabel3.setText(" Draws  : "+dr);
    }
    
    public static int checkWin(int turn,int[][] st){
        int ret = 0;
        String x ="";
        String o ="";
        int i=0 , j=0 , c=0 , p , q;
        for(p=0;p<3;p++)
        {
            for(q=0;q<3;q++)
            {
                c++;
                if(st[p][q]==1)
                {
                    x+=c;
                }
                else if(st[p][q]==2)
                {
                    o+=c;
                }
            }
        }
        //print(x+" : "+o);
        ret = checkWin2(x,o);
        
        if(turn==10 && ret==0)
        {
            ret = -1;
        }
        return ret;
    }
    public static int checkWin2(String x,String o){
        int ret = 0;
        int p;
        for(p=0;p<8;p++)
        {
            
            if(x.indexOf((char)winComb[p][0]+'0')>-1 && x.indexOf((char)winComb[p][1]+'0')>-1 && x.indexOf((char)winComb[p][2]+'0')>-1)
            {
                ret = 1;
                break;
            }
            if(o.indexOf((char)winComb[p][0]+'0')>-1 && o.indexOf((char)winComb[p][1]+'0')>-1 && o.indexOf((char)winComb[p][2]+'0')>-1)
            {
                ret = 2;
                break;
            }
        }
        
        return ret;
    }
    public void print(String s){
        Notification.setText("\t"+s);
    }
    
    public void gameInit(){
        state[0][0] = 0;
        state[0][1] = 0;
        state[0][2] = 0;
        state[1][0] = 0;
        state[1][1] = 0;
        state[1][2] = 0;
        state[2][0] = 0;
        state[2][1] = 0;
        state[2][2] = 0;
        refreshGrid();
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "TicTacToe_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        b21 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        Notification = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(600, 400));

        b21.setBackground(new java.awt.Color(255, 255, 255));
        b21.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b22.setBackground(new java.awt.Color(255, 255, 255));
        b22.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b12.setBackground(new java.awt.Color(255, 255, 255));
        b12.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });

        b23.setBackground(new java.awt.Color(255, 255, 255));
        b23.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

       b31.setBackground(new java.awt.Color(255, 255, 255));
        b31.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });

        b32.setBackground(new java.awt.Color(255, 255, 255));
        b32.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });

        b33.setBackground(new java.awt.Color(255, 255, 255));
        b33.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        b33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });

        Notification.setBackground(new java.awt.Color(255, 255, 0));
        Notification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Notification.setForeground(new java.awt.Color(0, 0, 102));
        Notification.setText("Tic - Tac - Toe");
        Notification.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)


        
