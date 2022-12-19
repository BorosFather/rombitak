/*
* File: MainFrame.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft II N
* Date: 2022-12-18
* Github: https://github.com/BorosFather
* Licenc: GNU GPL
*/
package Views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
 
    TitlePanel titlePanel;
    public ApagePanel apagePanel;
    public AlphaPanel alphaPanle;
    public AreaPanel areaPanel;
    public ReultPanel resultPanel;
    public ButtonPanel buttonPanel;
    
    public MainFrame(){
        this.titlePanel = new TitlePanel();
        this.areaPanel = new AreaPanel();
        this.resultPanel = new ReultPanel();
        this.apagePanel = new ApagePanel();
        this.alphaPanle = new AlphaPanel();
        this.buttonPanel = new ButtonPanel();
        
        this.initWindow();
        
    }

    public void initWindow(){
        this.setTitle("rombitak");
        this.setIconImage(new ImageIcon("/icon/father.png").getImage());
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        
    }

    private void addComponent() {
        this.add(this.titlePanel);
        this.add(this.apagePanel);
        this.add(this.alphaPanle);
        this.add(this.areaPanel);
        this.add(this.resultPanel);
        this.add(this.buttonPanel);
    }

 
    
}
