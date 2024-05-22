public class Estagiario extends Funcionario{
    private String Supervisor;

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String supervisor) {
        Supervisor = supervisor;
    }
    public Estagiario(String nome, String cpf, double salario, String Supervisor) {
        super(nome, cpf, salario);
        this.Supervisor = Supervisor;
    }
    public void exibirDetalhes() {
        System.out.println("Nome:" + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Supervisor" + Supervisor);
    }
}
