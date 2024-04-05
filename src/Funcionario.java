import java.util.Objects;

public class Funcionario extends Pessoa {
    private int idFuncionario;

    public Funcionario(int idFuncionario, String nome, String endereco ) {
        super(nome,endereco);
        this.idFuncionario = idFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return idFuncionario == that.idFuncionario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idFuncionario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
