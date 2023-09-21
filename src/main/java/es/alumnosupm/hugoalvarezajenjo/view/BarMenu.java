package es.alumnosupm.hugoalvarezajenjo.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class BarMenu extends JMenuBar {

    public JMenu fileMenu, editMenu, menuFormat, menuTheme;

    public JMenuItem miFileNew, miFileOpen, miFileSave, miFileSaveAs, miFileExit;

    public BarMenu(ActionListener actionListener) {
        super();
        createFileMenu(actionListener);
    }

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
