/*
* File: Filereader.java
* Author: Miklós Rajmund
* Copyright: 2023, Miklós Rajmund
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/itsChippie/
* Licenc: GNU GPL
*/
package controllers;

import java.util.List;

import models.Employee;
import models.Filereader;

public class MainController {
    private List<Employee> employeeList;

    public MainController(String filePath) {
        this.employeeList = Filereader.loadData(filePath);
        bobr();
    }

    public void bobr() {
        MainConsole.showData(employeeList);
    }
}
