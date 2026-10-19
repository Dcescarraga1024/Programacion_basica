 public static void main(String[] args) {
        // TODO code application logic here
        var consola = new Scanner(System.in);
        System.out.println("ingrese el nombre de la reseta: ");
        String namereceta= consola.nextLine();
        System.out.println("ingresa los ingredientes: ");
        String ingredientes= consola.nextLine();
        System.out.println("ingresa el tiempo de preparación (min): ");
        String tiempopre= consola.nextLine();
        System.out.println("ingresa la dificultad de la receta");
        String dificultad= consola.nextLine();
        System.out.println("nombre de la receta: " + namereceta);
        System.out.println("ingredientes: "+ingredientes);
        System.out.println("tiempo de preparacion: "+tiempopre+ " min");
        System.out.println("dificultad de la receta: "+dificultad);
        
        
        
        
        
    }
    
}
