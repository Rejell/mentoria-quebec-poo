public class Vendedor extends Funcionario {
    //atributos
    private double comissao;
    private int numeroVendas;

    public Vendedor(String nome, String cpf, double comissao, int numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    @Override
    public double calcularSalario() {
        return super.getSALARIO_MINIMO() + (this.comissao * this.numeroVendas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
}
