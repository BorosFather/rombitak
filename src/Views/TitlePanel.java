package Views;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TitlePanel extends JPanel{
    JLabel mainLabel;

    public TitlePanel(){
        this.mainLabel = new JLabel("Rombusz terület és kerület számítás");
        this.mainLabel.setFont(new Font("Times new roman", Font.BOLD, 12));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 5, 10));

        this.add(mainLabel);
    }
}
