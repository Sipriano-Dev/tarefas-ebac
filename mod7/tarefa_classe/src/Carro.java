public class Carro {

    private String modelo;
    private String ano;

    public Carro() {

    }

    public Carro(String modelo, String ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Carro em movimento");
    }

}
