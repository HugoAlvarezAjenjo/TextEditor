package es.alumnosupm.hugoalvarezajenjo.view;

import javax.swing.*;

public class EditorView extends JFrame {

    JTextArea textArea;
    JScrollPane scrollPane;

    JMenuBar menuBar;
    JMenu fileMenu, editMenu, menuFormat, menuColor;

    JMenuItem miFileNew, miFileOpen, miFileSave, miFileSaveAs, miFileExit;

    public EditorView () {
        super("Notepad");
        setSize(520, 520);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createTextArea();
        createMenuBar();

        setVisible(true);
    }

    private void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane);
    }

    private void createMenuBar() {
        menuBar = new BarMenu();
        setJMenuBar(menuBar);
    }

}
