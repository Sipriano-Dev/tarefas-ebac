public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(String name, Integer idade, String cpf) {
        super(name, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
