package es.alumnosupm.hugoalvarezajenjo.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class EditorView extends JFrame {
    ActionListener actionListener;

    public JTextArea textArea;
    public JScrollPane scrollPane;

    public JMenuBar menuBar;

    public EditorView (ActionListener actionListener) {
        super("Notepad");
        setSize(520, 520);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.actionListener = actionListener;

        ImageIcon img = new ImageIcon("art/Icono.png");
        setIconImage(img.getImage());

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
        menuBar = new BarMenu(actionListener);
        setJMenuBar(menuBar);
    }

}
