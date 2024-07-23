public class Comida {
    private String nome;
    private int avaliacao;

    public Comida(String nome, int avaliacao){
        this.nome=nome;
        this.avaliacao=avaliacao;
    }

    public String getNome(){
        return nome;
    }
    public void setNomeComida(String nome){
        this.nome=nome;
    }
    public int getAvaliacao(){
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao){
        this.avaliacao=avaliacao;
    }
    public void Informacoes(){
        if(avaliacao>=7){
        System.out.println(getNome()+ " é muito bom e possui nota "+getAvaliacao() );
        }
        else {
            System.out.println(getNome()+" não é bom e possui nota "+getAvaliacao());
        }
    }


}
