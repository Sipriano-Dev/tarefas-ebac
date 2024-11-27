public class PessoaJuridica extends Pessoa{

    private String cnpj;


    public PessoaJuridica(String name, Integer idade, String cnpj) {
        super(name, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
