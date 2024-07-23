public class Animal {

    private String especie;
    private int idade;
    private int qtdPatas;


    public Animal(String especie, int idade, int qtdPatas) {
        this.especie = especie;
        this.idade = idade;
        this.qtdPatas= qtdPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;


    }
    public void setIdade (int idade){
        this.idade=idade;
    }


    public void setQtdPatas(int qtdPatas){
        this.qtdPatas=qtdPatas;
    }

    public void fazerBarulho(){
        System.out.println("Barulho do " +this.getEspecie());


    }


}
