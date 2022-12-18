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
        calButton.addActionListener(e -> onClickAbout());
    }

 
    public void onClickCal(){
        String apageStr = this.mainFrame.apagePanel.getValue();
        String alphaStr = this.mainFrame.alphaPanle.getValue();
        double apage = Double.parseDouble(alphaStr);
        double alpha = Double.parseDouble(alphaStr);
        Double result = apage * 4 ;
        Double radian = alpha * Math.PI / 180;
        Double area = Math.pow(apage, 2) * Math.sin(radian);
        this.mainFrame.resultPanel.setValue(area.toString());

    }

    private void onClickAbout() {
        String aboutString = "Lelepi\nVerzió: 0.1\nBaráth Dávid, 2022";
        JOptionPane.showMessageDialog(mainFrame,aboutString);
    }

}
