
public class Nombreporconsola {

    public static void main(String[] args) {
        //la variable scanner permite interpretar lo que el usuario ingresa
        var scanner = new Scanner (System.in);
        System.out.println("dame tu nombre: ");
        //permite mostrar informacion en la consola
        var name = scanner.nextLine();
        // la variable n guarda la la informacion que el usuario ingreso y scanner.nextLine para esa informacion a string
        System.out.println("El nombre del jugador: "+ name);
        
    }
}
