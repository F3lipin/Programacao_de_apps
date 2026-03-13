public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Cauan", 19, "Engenheiro Civil");
        Cliente c1 = new Cliente("Ana", 25, "ana@email.com");

        System.out.println(f1.getidade() + " " +f1.getcargo());
        System.out.println(c1.getemail());
    }
}
