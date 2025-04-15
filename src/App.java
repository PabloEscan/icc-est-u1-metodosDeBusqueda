public class App {
    public static void main(String[] args) throws Exception {

        metodosBusqueda mB = new metodosBusqueda();

        int [] arreglo = {10, 12, 32, 123, 45, 67};
        int numeroBuscado = 30;

        int resultado = mB.busquedaLineal(arreglo, numeroBuscado);
        
        if (resultado == numeroBuscado){
            System.out.println("El número: " + numeroBuscado + ", no esta en el arreglo");
        } else{
            System.out.println("El número: " + numeroBuscado + ", esta en la posicion: " + (resultado+1));
        }
    }
}
