package sample.view;

import sample.controller.SampleAppController;
import sample.model.Whatsit;
import sample.model.Widget;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SamplePanel extends JPanel {

    // Creating the view for panel

    private SampleAppController baseController;
    private JLabel nameLabel;
    private JLabel descriptionLabel;
    private JLabel weightLabel;
    private JLabel sizeLabel;
    private JTextField nameField;
    private JTextField descriptionField;
    private JTextField weightField;
    private JTextField sizeField;
    private JButton createWidgetButton;
    private JButton createWhatsitButton;
    private SpringLayout baseLayout;

    public SamplePanel(SampleAppController baseController) {
        this.baseController = baseController;

        nameLabel = new JLabel("Type the name of the Whatsit");
        descriptionLabel = new JLabel("Describe the Widget");
        weightLabel = new JLabel("Enter the weight for the Widget");
        sizeLabel = new JLabel("Enter the size of the Whatsit");

        nameField = new JTextField(20);
        descriptionField = new JTextField(20);
        weightField = new JTextField(10);
        sizeField = new JTextField(10);

        createWidgetButton = new JButton("Make a Widget!!");
        createWhatsitButton = new JButton("Make a Whatsit!!");

        baseLayout = new SpringLayout();

        setupPanel();
        setupLayout();
        setupListeners();
    }

    private void setupLayout() {
        // how the gui needs to look.

    }

    private void setupPanel() {
        this.setSize(500,500);
        this.setLayout(baseLayout);
        this.add(createWidgetButton);
        this.add(createWhatsitButton);
        this.add(descriptionField);
        this.add(nameField);
        this.add(sizeField);
        this.add(weightField);
        this.add(descriptionLabel);
        this.add(nameLabel);
        this.add(sizeLabel);
        this.add(weightLabel);
    }

    private boolean checkInteger(String currentInput) {
        boolean isInteger = false;

        try {
            Integer.parseInt(currentInput);
            isInteger = true;
        } catch (NumberFormatException currentException) {
            JOptionPane.showMessageDialog(this, "Please type an integer in the size field");
        }
        return isInteger;
    }

    private boolean checkDouble(String currentInput) {
        boolean isDouble = false;

        try {
            Double.parseDouble(currentInput);
            isDouble = true;
        } catch (NumberFormatException currentException) {
            JOptionPane.showMessageDialog(this, "Please type an Double in the weight field");
        }
        return isDouble;
    }

    private void setupListeners() {
        createWidgetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent click) {
                String description = descriptionField.getText();
                double currentWeight = 0.0;
                if (checkDouble(sizeField.getText())) {
                    currentWeight = Double.parseDouble(sizeField.getText());

                    if (baseController.getAppFactory().makeWidget(currentWeight,description)) {
                        JOptionPane.showMessageDialog(baseController.getAppFrame(), "Congrats, you made a widget");
                    } else {
                        JOptionPane.showMessageDialog(baseController.getAppFrame(), "Sorry, not enough resources to make widget");
                    }
                }


            }
        });

        createWhatsitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent click) {
                String name = nameField.getText();
                int size = 0;
                if (checkInteger(sizeField.getText())) {
                    size = Integer.parseInt(sizeField.getText());

                    if (baseController.getAppFactory().makeWhatsit(size, name)) {
                        JOptionPane.showMessageDialog(baseController.getAppFrame(), "Congrats, you made a whatsit");
                    } else {
                        JOptionPane.showMessageDialog(baseController.getAppFrame(), "Sorry, not enough resources to make widget");
                    }
                }

            }
        });
    }
}
