package es.alumnosupm.hugoalvarezajenjo;

import es.alumnosupm.hugoalvarezajenjo.view.EditorViewListerner;

/**
 * The `Main` class serves as the entry point of the Notepad application.
 * It creates an instance of the `EditorViewListerner` class to start the application.
 *
 * @author Hugo Alvarez Ajenjo
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        new EditorViewListerner();
    }
}