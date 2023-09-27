package es.alumnosupm.hugoalvarezajenjo.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * The `EditorView` class represents the main graphical user interface window for the Notepad application.
 * It extends the Swing class JFrame and contains a text area for editing text, as well as a menu bar.
 *
 * @author Hugo Alvarez Ajenjo
 * @version 0.0
 */
public class EditorView extends JFrame {
    ActionListener actionListener;

    public JTextArea textArea;
    public JScrollPane scrollPane;

    public JMenuBar menuBar;

    /**
     * Constructor for the EditorView class that creates the main application window.
     *
     * @param actionListener The ActionListener that will handle action events in the GUI.
     */
    public EditorView(ActionListener actionListener) {
        super("Notepad");
        setSize(520, 520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.actionListener = actionListener;

        ImageIcon img = new ImageIcon("art/Icono.png");
        setIconImage(img.getImage());

        createTextArea();
        createMenuBar();

        setVisible(true);
    }

    /**
     * Creates and configures the text area where text can be edited and adds it to the main window.
     */
    private void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        add(scrollPane);
    }

    /**
     * Creates and sets up the menu bar for the Notepad application.
     */
    private void createMenuBar() {
        menuBar = new BarMenu(actionListener);
        setJMenuBar(menuBar);
    }

}
