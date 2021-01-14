package sample.view;

import sample.controller.SampleAppController;

import javax.swing.*;

public class SamplePanel extends JPanel {
    private SampleAppController baseController;

    public SamplePanel(SampleAppController baseController) {
        this.baseController = baseController;
    }
}
