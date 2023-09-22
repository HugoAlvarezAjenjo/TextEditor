package es.alumnosupm.hugoalvarezajenjo.view;

import es.alumnosupm.hugoalvarezajenjo.logic.Logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorViewListerner implements ActionListener {

    final EditorView editorView;
    final Logic logic;
    public EditorViewListerner() {
        editorView = new EditorView(this);
        logic = new Logic(editorView);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final String command = e.getActionCommand();

        switch (command) {
            case "New" -> logic.newFile();
            case "Open" -> logic.openFile();
            case "Save" -> logic.saveFile();
            case "Save As" -> logic.saveAsFile();
            case "Exit" -> logic.exitProgram();
        }


    }
}
