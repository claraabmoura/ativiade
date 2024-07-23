public class Pessoa {
    private int idade;
    private String nome;
    private String corCabelo;


    public Pessoa(int idade, String nome, String corCabelo){
        this.corCabelo= corCabelo;
        this.idade=idade;
        this.nome=nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getCorCabelo(){
        return  corCabelo;
    }
    public void setCorCabelo(String corCabelo){
        this.corCabelo=corCabelo;
    }

    public void Caracteristicas(){
        System.out.println(getNome() + " tem " + getIdade() + " anos " +"e o cabelo "+ getCorCabelo());
    }

}
