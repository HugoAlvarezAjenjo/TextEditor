package es.alumnosupm.hugoalvarezajenjo.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The `BarMenu` class represents a custom menu bar that contains menu options related to file operations in a Notepad application.
 * It extends the Swing class JMenuBar.
 *
 * @author Hugo Alvarez Ajenjo
 * @version 1.0
 */
public class BarMenu extends JMenuBar {

    public JMenu fileMenu;

    public JMenuItem miFileNew, miFileOpen, miFileSave, miFileSaveAs, miFileExit;

    /**
     * Constructor for the BarMenu class that creates a new menu bar with file menu options.
     *
     * @param actionListener The ActionListener that will handle action events for menu items.
     */
    public BarMenu(ActionListener actionListener) {
        super();
        createFileMenu(actionListener);
    }

    /**
     * Creates and configures the "File" menu with its corresponding menu items
     * and adds an ActionListener to each menu item.
     *
     * @param actionListener The ActionListener that will handle action events for menu items.
     */
    private void createFileMenu(ActionListener actionListener) {
        fileMenu = new JMenu("File");
        add(fileMenu);

        miFileNew = new JMenuItem("New");
        fileMenu.add(miFileNew);
        miFileNew.addActionListener(actionListener);
        miFileNew.setActionCommand("New");

        miFileOpen = new JMenuItem("Open");
        fileMenu.add(miFileOpen);
        miFileOpen.addActionListener(actionListener);
        miFileOpen.setActionCommand("Open");

        miFileSave = new JMenuItem("Save");
        fileMenu.add(miFileSave);
        miFileSave.addActionListener(actionListener);
        miFileSave.setActionCommand("Save");

        miFileSaveAs = new JMenuItem("Save As");
        fileMenu.add(miFileSaveAs);
        miFileSaveAs.addActionListener(actionListener);
        miFileSaveAs.setActionCommand("Save As");

        miFileExit = new JMenuItem("Exit");
        fileMenu.add(miFileExit);
        miFileExit.addActionListener(actionListener);
        miFileExit.setActionCommand("Exit");
    }
}
