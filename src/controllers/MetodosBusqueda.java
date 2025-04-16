package controllers;

import models.Person;
import views.ShowConsole;

public class MetodosBusqueda {

    //Todas las variables se instancias en el constructor de la clase
    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonCode();
        showPersonName();
    }


    public int busquedaLineal(int[] arreglo ,  int numeroBuscado){
        for (int i = 0; i <arreglo.length; i++ ){
            if (arreglo[i] == numeroBuscado){
                return i;
            }
        } return -1;
    }

    public int findPersonByCode(int code){
        for(int i = 0; i < people.length ; i++ ){
            if (people[i].getCode() == code){
                return i;
            }
        }
        return -1;
    }

    public int findPersonByName(String name){
        for(int i = 0; i < people.length ; i++ ){
            if (people[i].getName().equals(name)){
                return i;   
            }
        }
        return -1;
    }

    public void showPersonCode(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con código " + codeToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
            showConsole.showMessage(people[indexPerson] + "");
            
        }else {
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public void showPersonName(){
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0){
            showConsole.showMessage("Persona con nombre " + nameToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
            //showConsole.showMessage(people[indexPerson] + "");
            
        }else {
            showConsole.showMessage("Persona no encontrada");
        }
    }
}
