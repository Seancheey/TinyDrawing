/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment.pkg5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * @author Seancheey
 */
public class ProgrammingAssignment5 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public ProgrammingAssignment5() {
        super("Java2D Drawings by Qiyi Shan");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MainPanel());
    }

    public static void main(String[] args) {
        new ProgrammingAssignment5().setVisible(true);
    }

}

class MainPanel extends JPanel {

    public SettingPanel settingPanel;
    public DrawingPanel drawingPanel;
    public GraphicSettings settings;
    private JLabel statusLabel;

    public MainPanel() {
        settings = new GraphicSettings();

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 0.1;
        settingPanel = new SettingPanel(settings);
        settingPanel.mainPanel = this;
        grid.setConstraints(settingPanel, c);
        c.gridy = 1;
        c.gridheight = 5;
        c.weighty = 0.9;
        c.fill = GridBagConstraints.BOTH;
        drawingPanel = new DrawingPanel(settings);
        grid.setConstraints(drawingPanel, c);
        add(settingPanel);
        add(drawingPanel);
        setLayout(grid);
    }
}
