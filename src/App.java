/*
* File: App.java
* Author: Miklós Rajmund
* Copyright: 2023, Miklós Rajmund
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/itsChippie/
* Licenc: GNU GPL
*/

import controllers.MainController;

public class App {
    public static void main(String[] args) {
        new MainController("src/models/filbt.txt");
    }
}
