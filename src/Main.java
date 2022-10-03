public class Main {
    public static void main(String[] args) {
        Vendedor joaoVendedor =
                new Vendedor("Joao Vendedor","123456", 10.0, 5);
        double salarioJoao = joaoVendedor.calcularSalario();
        System.out.println("O salário de João é: " + salarioJoao);

        Consultor mariaConsultor =
                new Consultor("Maria Consultor", "032164", 100.0, 10L);
        System.out.println("O salário de Maria é: " + mariaConsultor.calcularSalario());

        //System.out.println("Hello world!");
    }
}
