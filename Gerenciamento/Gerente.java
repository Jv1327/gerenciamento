public class Gerente extends Funcionario{
    private double bonus;

    public void ExibirDetalhes(){
        
    }

    public Gerente (String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void exibirDetalhes() {
        System.out.println("Bonus: " + bonus );
    }
}
