package models;
/*
* File: Employee.java
* Author: Miklós Rajmund
* Copyright: 2023, Miklós Rajmund
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/itsChippie/
* Licenc: GNU GPL
*/

public class Employee {
    public String nev;
    public String telepules;
    public String cim;
    public String szuletes;
    public int fizetes;

    public Employee(String nev, String telepules, String cim, String szuletes, int fizetes) {
        this.nev = nev;
        this.telepules = telepules;
        this.cim = cim;
        this.szuletes = szuletes;
        this.fizetes = fizetes;
    }

    //nev
    public String getNev(){
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    //telepules
    public String getTelepules(){
        return telepules;
    }
    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    //cim
    public String getCim(){
        return cim;
    }
    public void setCim(String cim) {
        this.cim = cim;
    }

    //szuletes
    public String getSzuletes(){
        return szuletes;
    }
    public void setSzuletes(String szuletes) {
        this.szuletes = szuletes;
    }

    //fizetes
    public int getFizetes(){
        return fizetes;
    }
    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }
}