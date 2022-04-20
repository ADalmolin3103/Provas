public class Q1 {
    public static void main(String[] args) {
        //dado
        String nivel = "alto", altura = "certa";

        //processo
        if(nivel == "vazio" && altura == "vazio"){
            System.out.println(nivel + " e " + altura);
        } else {
            System.out.println("teste de altura");
                if (altura == "vazio"){
                    System.out.println("Altura vazio");
                    System.out.println("Nivel vazio");
                } else {
                    System.out.println("altura cadastrada");
                }
                System.out.println("outro nivel");
        }
    }
}
