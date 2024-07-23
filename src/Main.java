public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Gato", 3, 4);

        a1.fazerBarulho();
        System.out.println(a1.getQtdPatas()+ " patas");
        Pessoa p1 = new Pessoa(19, "Clara", "Castanho");
        p1.Caracteristicas();
        Comida c1 = new Comida("Lasanha", 5);
        c1.Informacoes();
    }
}