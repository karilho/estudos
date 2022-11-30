package JavaReflection;

public class Main {


    public static void main(String[] args) {

        Reflection re = new Reflection();
        System.out.println("\n--- Lista todos os metodos da classe pesquisada ---\n");
        re.listaNomeDosMetodos();

        System.out.println("\n--- Lista atributos da classe ---\n");
        re.atributos();

        System.out.println("\n--- Invoca metodos da classe Pessoa ---\n");
        re.invocaMetodos();
    }
}