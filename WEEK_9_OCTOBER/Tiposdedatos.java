public class Tiposdedatos {

    public static void main(String[] args) {
        var datos = new Scanner(System.in);
        System.out.println("Dame tu edad: ");
        var edad = datos.nextInt();
        System.out.println("dame tu estatura: ");
        var estatura = datos.nextDouble();
        System.out.println("dame tu nombre: ");
        datos.nextLine();
        var name = datos.nextLine();
        System.out.println("tu estatura edad es: "+edad);
        System.out.println("tu estatura es: "+estatura);
        System.out.println("\" nombre del jugador es: "+name);
    }
}
