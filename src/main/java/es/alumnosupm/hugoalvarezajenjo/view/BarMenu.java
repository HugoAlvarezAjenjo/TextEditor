package es.alumnosupm.hugoalvarezajenjo.view;

import javax.swing.*;

public class BarMenu extends JMenuBar {

    JMenu fileMenu, editMenu, menuFormat, menuColor;

    JMenuItem miFileNew, miFileOpen, miFileSave, miFileSaveAs, miFileExit;

    public BarMenu() {
        super();
        createFileMenu();
    }

    private void createFileMenu() {
        fileMenu = new JMenu("File");
        add(fileMenu);

        miFileNew = new JMenuItem("New");
        fileMenu.add(miFileNew);

        miFileOpen = new JMenuItem("Open");
        fileMenu.add(miFileOpen);

        miFileSave = new JMenuItem("Save");
        fileMenu.add(miFileSave);

        miFileSaveAs = new JMenuItem("Save As");
        fileMenu.add(miFileSaveAs);

        miFileExit = new JMenuItem("Exit");
        fileMenu.add(miFileExit);
    }
}
