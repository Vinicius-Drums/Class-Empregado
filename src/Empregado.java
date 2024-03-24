public class Empregado {
    // Atributos
    private long cpf;
    private String nomeCompleto;
    private double salario;

    // Construtor
    public Empregado(long cpf, String nomeCompleto, double salario) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
        
    }

    // Método para promover o empregado
    public void promover(float percentualAumento) {
        double aumento = this.salario * (percentualAumento / 100.0);
        this.salario += aumento;
        System.out.println();
        System.out.println("O empregado " + this.nomeCompleto + " foi promovido com um aumento de " + percentualAumento + "%. Novo salário: R$" + this.salario);
        System.out.println();
    }

    // Getters e Setters
    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
