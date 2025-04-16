package controllers;
import models.Person;
import views.ShowConsole;

public class MetodosDeBusquedaBinario {

    private Person[] people;
    private ShowConsole pantalla;


    public MetodosDeBusquedaBinario(Person[] people){
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("*** Metodo de busqueda binario ***");
    }

    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length -1;

        while(alto>=bajo ){
            int central = (bajo + alto)/2;

            if(people[central].getCode() == code){
                return central;
            }

            if(people[central].getCode() > code){
                alto = central -1;
            }else{
                bajo = central +1;
            }
        }
        return -1;
    }

    private static void orderBubbleSortName(Person[] people){
        int tamaño = people.length;

        for (int i= 0; i < tamaño-1; i++){
            for (int j = 0; j < tamaño -1 -i; j++){
                if (people[j].getName().compareToIgnoreCase(people[j+1].getName()) > 0) {
                    Person aux = people[j];
                    people[j]= people[j+1];
                    people[j+1]=  aux;
                }
            }
        }
    }
    
    private int findPersonByName(String name){
        int bajo = 0;
        int alto = people.length -1;
        orderBubbleSortName(people);

        while(alto>=bajo ){
            int central = (bajo + alto)/2;

            if(people[central].getName().equals(name)){
                return central;
            }

            if(people[central].getName().compareToIgnoreCase(name)>0){
                alto = central -1;
            }else{
                bajo = central +1;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFinde = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFinde);
        if(indexPerson == -1){
            pantalla.showMessage("Persona con codigo: " + codeToFinde + " no encontrada");
        }else{
            pantalla.showMessage("Persona con codigo: "+ codeToFinde + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    public void showPersonByName(){
        String nameToFinde = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFinde);
        if(indexPerson == -1){
            pantalla.showMessage("Persona con nombre: " + nameToFinde + " no encontrada");
        }else{
            pantalla.showMessage("Persona con nombre: "+ nameToFinde + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

}
