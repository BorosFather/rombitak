package Views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
    public JButton calButton;
    public JButton aboutButton;

    public ButtonPanel(){
        this.calButton = new JButton("Számítás");
        this.aboutButton = new JButton("About");
        this.addComponent();

    }

    public void addComponent(){
        
        this.add(this.calButton);
        this.add(this.aboutButton);
    }

    

    
}
