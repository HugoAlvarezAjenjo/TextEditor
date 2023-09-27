package es.alumnosupm.hugoalvarezajenjo.logic;

import es.alumnosupm.hugoalvarezajenjo.view.EditorView;

import java.awt.*;
import java.io.*;

/**
 * The `Logic` class represents the logic and functionality of the Notepad application.
 * It manages file operations such as creating, opening, saving, and saving as files.
 * This class interacts with the graphical user interface (GUI) provided by the EditorView class.
 *
 * @author Hugo Alvarez Ajenjo
 * @version 1.0
 */
public class FileMenuActions {
    final EditorView editor;

    String fileName;
    String fileAddress;

    /**
     * Constructor for the Logic class that initializes an instance of the Logic class with a reference to the EditorView.
     *
     * @param editorView The EditorView instance that represents the graphical user interface.
     */
    public FileMenuActions(EditorView editorView) {
        this.editor = editorView;
    }

    /**
     * Creates a new, empty file in the text editor, resetting the file name and address.
     */
    public void newFile() {
        editor.textArea.setText("");
        editor.setTitle("New");
        fileName = null;
        fileAddress = null;
    }

    /**
     * Opens an existing file and loads its content into the text editor.
     */
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

    /**
     * Saves the current content of the text editor to the file. If the file doesn't exist, it behaves like "Save As."
     */
    public void saveFile() {
        if (fileName == null) {
            saveAsFile();
        } else {
            try {
                FileWriter fileWriter = new FileWriter(fileAddress + fileName);
                fileWriter.write(editor.textArea.getText());
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    /**
     * Opens a file dialog and saves the current content of the text editor to a specified file.
     */
    public void saveAsFile() {
        FileDialog fileDialog = new FileDialog(editor, "Save", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            fileName = fileDialog.getFile();
            fileAddress = fileDialog.getDirectory();
            editor.setTitle(fileName);

            saveFile();
        }
    }

    /**
     * Exits the Notepad application by closing the main window.
     */
    public void exitProgram() {
        editor.dispose();
    }

}
