
package clocks;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author rabin
 */
public class Clock extends javax.swing.JFrame {
int timeRun=0;
    
    public Clock() {
        initComponents();
        new Thread(){
            public void run(){
                
                while(timeRun==0){
                            Calendar cal=new GregorianCalendar();
                            int hour=cal.get(Calendar.HOUR);
                            int min=cal.get(Calendar.MINUTE);
                            int sec=cal.get(Calendar.SECOND);
                            int am_pm=cal.get(Calendar.AM_PM);

                            String day_night ="";
                            if (am_pm==1){
                                day_night="PM";
                            }
                            else{
                                day_night="AM";
                            }
                            String time=hour+":"+min+":"+sec+":"+day_night;
                            clock.setText(time);
                }
            }  
    }.start();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        clock = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MY DIGIITAL CLOCK");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setForeground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 60, 30));

        jTextField1.setBackground(new java.awt.Color(255, 204, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Stop Watch Application");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 170, 30));

        jButton4.setForeground(new java.awt.Color(255, 204, 0));
        jButton4.setText("Stop");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 30, 60, 30));

        jButton3.setForeground(new java.awt.Color(255, 204, 0));
        jButton3.setText("Pause");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 30));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 170, 60));

        clock.setFont(new java.awt.Font("DS-Digital", 1, 60)); // NOI18N
        clock.setForeground(new java.awt.Color(255, 255, 255));
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setText("00:00:00:PM");
        getContentPane().add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 410, 110));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clocks/14_6922_oboi_mac_os_1366x768.jpg"))); // NOI18N
        bg.setAlignmentY(0.0F);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        StopWatch Sw= new StopWatch();
       Sw.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clock().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel clock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
