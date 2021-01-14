package sample.view;

import sample.controller.SampleAppController;

import javax.swing.*;
/**
 * SampleFrame object that extends JFrame for use with a MVC GUI
 * Author Mc Fergus
 * data 14.1.2021
 * */
public class SampleFrame extends JFrame {

    /**
     * Reference to the application SamplePanel
     * */
    private SamplePanel basePanel;


    /**
     *Create a SampleFrame object passing a reference to the AppController for use by the SampleFrame object
     * Program baseController the reference to the AppController
     * */
    public SampleFrame(SampleAppController baseController) {
        basePanel = new SamplePanel(baseController);
        setupFrame();
    }

    /**
     * Set tge content panel, size, and makes the frame visible
     * */

    private void setupFrame() {
        this.setContentPane(basePanel);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
