public class Switch_case_Viejo {
    public static void main(String[] args) {
        int IDusuario = 4;
        String rol;

        switch (IDusuario) {
            case 1:
                rol = "Es administrativo";
                break;
            case 2:
                rol = "Es estudiante";
                break;
            case 3:
                rol = "Es gestor de conocimiento";
                break;
            case 4:
                rol = "Es egresado";
                break;
            default:
                rol = "No hace parte de la universidad";
                break;

        }
        System.out.println("-*-*-*-Rol de usuario en la universidad: "+ rol+ " -*-*-*-*-");
    }
}
