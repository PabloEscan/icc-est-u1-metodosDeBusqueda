package views;

import java.util.Scanner;

public class ShowConsole {
    //Interactuar con el usuario 


    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner(){
        System.out.println("*** Metodos de Busqueda ***");
    }

    public int inputCode(){
        System.out.println("Ingrese un codigo");
        int code = scanner.nextInt();
        return code;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}