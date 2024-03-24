public class App {

        // Método principal para teste
        public static void main(String[] args) {
            // Criando um objeto Empregado
            Empregado empregado = new Empregado(987654321, "João Barone", 3000.0);
    
            // Exibindo informações do empregado antes da promoção
            System.out.println("Antes da promoção:");
            System.out.println();
            System.out.println("Nome: " + empregado.getNomeCompleto());
            System.out.println();
            System.out.println("CPF: " + empregado.getCpf());
            System.out.println();
            System.out.println("Salário: R$" + empregado.getSalario());
    
            // Promovendo o empregado com um aumento de 10%
            empregado.promover(10);
    
            // Exibindo informações do empregado após a promoção
            System.out.println("Depois da promoção:");
            System.out.println();
            System.out.println("Nome: " + empregado.getNomeCompleto());
            System.out.println();
            System.out.println("CPF: " + empregado.getCpf());
            System.out.println();
            System.out.println("Salário: R$" + empregado.getSalario());
        }
    }
    
    

