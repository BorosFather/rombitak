/*
* File: TitlePanel.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft II N
* Date: 2022-12-18
* Github: https://github.com/BorosFather
* Licenc: GNU GPL
*/

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
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 10));

        this.add(mainLabel);
    }
}
