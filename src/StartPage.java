import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;


public class StartPage implements ActionListener {
	JFrame f1;
	JLabel l1,l2;
	JButton b1,b2;
	Color frameColor;
	
	public StartPage() {
		f1=new JFrame("Welcome To Snake Game");
		l1=new JLabel("<html><h2>Welcome Snake Game Click Start Game To Enjoy!</h2></html>");
		l2=new JLabel("@BOSCO Junior Programmer");
		b1=new JButton("Start Game");
		b2=new JButton("Quit Game");
		frameColor=new Color(0,new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255));
		
		l1.setBounds(65, 84, 380, 100);
		l2.setBounds(105, 384, 303, 34);
		b1.setBounds(85, 228, 109, 43);
		b2.setBounds(205, 228, 109, 43);
		b1.setBackground(Color.GREEN);
		b2.setBackground(Color.RED);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		// Create a custom JPanel with rounded border
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBackground(frameColor);
        contentPane.setBorder(new RoundRectBorder(20, 20)); // Set the border radius

        
        contentPane.add(l1);
        contentPane.add(l2);
        contentPane.add(b1);
        contentPane.add(b2);

        f1.setContentPane(contentPane);
        try {
        	ImageIcon icon = new ImageIcon(getClass().getResource("snake.png"));
            f1.setIconImage(icon.getImage());
        } catch (Exception e) {
            System.out.println("Error loading icon: " + e.getMessage());
        }
		
		f1.getContentPane().setBackground(frameColor);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(null);
		f1.setPreferredSize(new Dimension(500,500));
		f1.pack();
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new GameFrame();
			f1.setVisible(false);
		}
		if(e.getSource()==b2) {
			System.exit(1);
		}
		
	}  

	
	
		
}
class RoundRectBorder extends LineBorder {
    private int arcWidth;
    private int arcHeight;

    public RoundRectBorder(int arcWidth, int arcHeight) {
        super(Color.BLACK, 1);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
    }
@Override
public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.drawRoundRect(x, y, width - 1, height - 1, arcWidth, arcHeight);
    g2.dispose();
}

}