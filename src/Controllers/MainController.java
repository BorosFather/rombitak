/*
* File: MainController.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft II N
* Date: 2022-12-18
* Github: https://github.com/BorosFather
* Licenc: GNU GPL
*/
package Controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import Views.MainFrame;

public class MainController {
    MainFrame mainFrame;

    public MainController(){
        this.mainFrame = new MainFrame();
        this.handleEvents();
    }

    private void handleEvents() {
        JButton calButton = this.mainFrame.buttonPanel.calButton;
        JButton aboutButton = this.mainFrame.buttonPanel.aboutButton;
        calButton.addActionListener(e -> onClickCal());
        aboutButton.addActionListener(e -> onClickAbout());
    }

 
    public void onClickCal(){
        String apageStr = this.mainFrame.apagePanel.getValue();
        String alphaStr = this.mainFrame.alphaPanle.getValue();
        double apage = Double.parseDouble(apageStr);
        double alpha = Double.parseDouble(alphaStr);
        Double result = apage * 4 ;
        Double radian = alpha * Math.PI / 180;
        Double area = Math.pow(apage, 2) * Math.sin(radian);
        this.mainFrame.resultPanel.setValue(result.toString());
        this.mainFrame.areaPanel.setValue(area.toString());

    }

    private void onClickAbout() {
        String aboutString = "rombitak\nVerzió: 0.1\nBoros Zoltán as BorosFather\n2022-12-18";
        JOptionPane.showMessageDialog(mainFrame,aboutString);
    }

}
