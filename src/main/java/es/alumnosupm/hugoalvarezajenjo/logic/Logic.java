package es.alumnosupm.hugoalvarezajenjo.logic;

import es.alumnosupm.hugoalvarezajenjo.view.EditorView;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Logic {
    final EditorView editor;

    String fileName;
    String fileAddress;

    public Logic(EditorView editorView) {
        this.editor = editorView;
    }

    public void newFile() {
        editor.textArea.setText("");
        editor.setTitle("New");
    }

    public void openFile() {
        FileDialog fileDialog = new FileDialog(editor, "Open", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            fileName = fileDialog.getFile();
            fileAddress = fileDialog.getDirectory();
            editor.setTitle(fileName);
            editor.textArea.setText("");

            try {
                final BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));

                String line = br.readLine();
                while (line != null) {
                    editor.textArea.append(line + "\n");
                    line = br.readLine();
                }
                br.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e); // Archivo no encontrado
            } catch (IOException e) {
                throw new RuntimeException(e); // Error de lectura
            }
        }
    }

    public void saveFile() {

    }

    public void saveAsFile() {

    }

    public void exitProgram() {
        editor.dispose();
    }
}
