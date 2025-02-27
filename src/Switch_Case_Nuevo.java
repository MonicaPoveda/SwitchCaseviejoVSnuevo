public class Switch_Case_Nuevo {
    public static void main(String[] args) {
    int IDusuario =4;
            String rol= switch (IDusuario){
                case 1 -> "Es administrativo";
                case 2 -> "Es estudiante";
                case 3 -> "Es gestor de conocimiento";
                case 4 -> "Es egresado";
                default -> "No hace parte de la universidad";
            };
        System.out.println("-*-*-*Rol de usuario en la universidad: " +rol+ " *-*-*-* ");
    }
}
