import javax.swing.*;


public class GameFrame extends JFrame{
	ImageIcon icon ;
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this .setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		try {
            icon = new ImageIcon(getClass().getResource("snake.png"));
            this.setIconImage(icon.getImage());
        } catch (Exception e) {
            System.out.println("Error loading icon: " + e.getMessage());
        }
		
	}

}
