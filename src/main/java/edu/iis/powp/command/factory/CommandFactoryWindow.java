package edu.iis.powp.command.factory;

import edu.iis.powp.app.gui.WindowComponent;
import edu.iis.powp.command.manager.PlotterCommandManager;
import edu.iis.powp.observer.Subscriber;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CommandFactoryWindow implements WindowComponent {

    private final CommandRegistry commandRegistry;

    public CommandFactoryWindow(final CommandRegistry commandRegistry) {
        this.commandRegistry = commandRegistry;
    }

    @Override
    public void HideIfVisibleAndShowIfHidden() {

    }
//    private PlotterCommandManager commandManager;
//
//    private JTextArea currentCommandField;
//
//    private String observerListString;
//    private JTextArea observerListField;
//
//    /**
//     *
//     */
//    private static final long serialVersionUID = 9204679248304669948L;
//
//    public CommandFactoryWindow(PlotterCommandManager commandManager) {
//        this.setTitle("Command Manager");
//        this.setSize(400, 400);
//        Container content = this.getContentPane();
//        content.setLayout(new GridBagLayout());
//
//        this.commandManager = commandManager;
//
//        GridBagConstraints c = new GridBagConstraints();
//
//        observerListField = new JTextArea("");
//        observerListField.setEditable(false);
//        c.fill = GridBagConstraints.BOTH;
//        c.weightx = 1;
//        c.gridx = 0;
//        c.weighty = 1;
//        content.add(observerListField, c);
//        updateObserverListField();
//
//        currentCommandField = new JTextArea("");
//        currentCommandField.setEditable(false);
//        c.fill = GridBagConstraints.BOTH;
//        c.weightx = 1;
//        c.gridx = 0;
//        c.weighty = 1;
//        content.add(currentCommandField, c);
//        updateCurrentCommandField();
//
//        JButton btnClearCommand = new JButton("Clear command");
//        btnClearCommand.addActionListener((ActionEvent e) -> this.clearCommand());
//        c.fill = GridBagConstraints.BOTH;
//        c.weightx = 1;
//        c.gridx = 0;
//        c.weighty = 1;
//        content.add(btnClearCommand, c);
//
//        JButton btnClearObservers = new JButton("Delete observers");
//        btnClearObservers.addActionListener((ActionEvent e) -> this.deleteObservers());
//        c.fill = GridBagConstraints.BOTH;
//        c.weightx = 1;
//        c.gridx = 0;
//        c.weighty = 1;
//        content.add(btnClearObservers, c);
//    }
//
//    private void clearCommand() {
//        commandManager.clearCurrentCommand();
//        updateCurrentCommandField();
//    }
//
//    public void updateCurrentCommandField() {
//        currentCommandField.setText(commandManager.getCurrentCommandString());
//    }
//
//    public void deleteObservers() {
//        commandManager.getChangePublisher().clearObservers();
//        this.updateObserverListField();
//    }
//
//    private void updateObserverListField() {
//        observerListString = "";
//        List<Subscriber> commandChangeSubscribers = commandManager.getChangePublisher().getSubscribers();
//        for (Subscriber observer : commandChangeSubscribers) {
//            observerListString += observer.toString() + System.lineSeparator();
//        }
//        if (commandChangeSubscribers.isEmpty())
//            observerListString = "No observers loaded";
//
//        observerListField.setText(observerListString);
//    }
//
//    @Override
//    public void HideIfVisibleAndShowIfHidden() {
//        updateObserverListField();
//        if (this.isVisible()) {
//            this.setVisible(false);
//        } else {
//            this.setVisible(true);
//        }
//    }
}