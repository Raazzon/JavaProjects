package clocks;




import java.awt.*;
import javax.swing.Timer;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class StopWatch extends JFrame implements ActionListener{

    
    
	private JLabel displayTimeLabel;

	
	private long watchStart, watchEnd;


	private Timer theChronometer;

	
	private long pausedTime;

	
	private boolean paused = false;

	
	private JButton activateTimerButton;

    public static void main(String[] args) {

       
        StopWatch s = new StopWatch();

       
        s.setVisible(true);

     
        s.setLocationRelativeTo(null);
    }

    public StopWatch(){

    	super();
    	setSize(400,150);
    	setLayout(new GridLayout(2,1));
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("Stop Watch");

  

    
    	Font largeFontBOLD = new Font("Calibri", Font.BOLD,20);
    	Font largeFontPLAIN = new Font("Calibri", Font.PLAIN,20);

    	JPanel buttonPanel = new JPanel();
    	buttonPanel.setLayout(new GridLayout(1,3));

    	activateTimerButton = new JButton("Start");
    	JButton stopTimerButton = new JButton("Stop");
    	JButton pauseTimerButton = new JButton("Pause");

    	
    	activateTimerButton.addActionListener(this);
    	stopTimerButton.addActionListener(this);
    	pauseTimerButton.addActionListener(this);


    	displayTimeLabel = new JLabel("Stop Watch Application");
    	displayTimeLabel.setHorizontalAlignment(JLabel.CENTER);


    	displayTimeLabel.setFont(largeFontPLAIN);
    	activateTimerButton.setFont(largeFontBOLD);
    	stopTimerButton.setFont(largeFontBOLD);
    	pauseTimerButton.setFont(largeFontBOLD);

    	
	displayTimeLabel.setOpaque(true);

      
       
    	displayTimeLabel.setBackground(new Color(255,204,51));// gold
    	displayTimeLabel.setForeground(new Color(153,0,0));// burgundy
    	stopTimerButton.setBackground(new Color(0,150,0));// dark green
    	stopTimerButton.setForeground(new Color(255,204,51));
    	activateTimerButton.setBackground(new Color(0,150,0));
    	activateTimerButton.setForeground(new Color(255,204,51));
    	pauseTimerButton.setBackground(new Color(0,150,0));
    	pauseTimerButton.setForeground(new Color(255,204,51));

    	buttonPanel.add(activateTimerButton);
    	buttonPanel.add(stopTimerButton);
    	buttonPanel.add(pauseTimerButton);
    	add(displayTimeLabel);
    	add(buttonPanel);

        
         
        theChronometer =
        new Timer(1000,new ActionListener(){
        		public void actionPerformed(ActionEvent e){
        			int seconds = (int)(System.currentTimeMillis()-watchStart)/1000;
        			int days = seconds / 86400;
					int hours = (seconds / 3600) - (days * 24);
					int min = (seconds / 60) - (days * 1440) - (hours * 60);
					int sec = seconds % 60;
        			String s = new String(""+hours+" hours "+min+ " min "+sec+" sec");
        	        displayTimeLabel.setText(s);
        		}
        });
    }


    
    public void actionPerformed(ActionEvent e){

       
    	if(e.getActionCommand().equals("Stop")){theChronometer.stop();}

    	
    	else if(e.getActionCommand().equals("Start") || e.getActionCommand().equals("Resume")){
    		if(!paused){
    		   watchStart = System.currentTimeMillis();
        	   theChronometer.start();
    		}
        	else{
        	   watchStart = System.currentTimeMillis()+pausedTime;
        	   pausedTime = 0;
        	   theChronometer.start();
        	   paused = false;

                 
        	   activateTimerButton.setText("Start");
        	}
    	}

    	else if(e.getActionCommand().equals("Pause")){
	    	long now = System.currentTimeMillis();
	    	pausedTime -= (now - watchStart);
	    	theChronometer.stop();
	    	paused = true;

		
	    	activateTimerButton.setText("Resume");
    	}
    }
}

