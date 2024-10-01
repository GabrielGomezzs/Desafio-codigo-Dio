public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque = "";

        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "ataque desconhecido";
        }

        System.out.println("O " + tipo + " atacou usando " + ataque + "!");
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static void main(String[] args) {
        Heroi mago = new Heroi("Gandalf", 2019, "mago");
        Heroi guerreiro = new Heroi("Arthur", 35, "guerreiro");
        Heroi monge = new Heroi("Shaolin", 30, "monge");
        Heroi ninja = new Heroi("Naruto", 17, "ninja");

        mago.atacar();         // Saída: O mago atacou usando magia!
        guerreiro.atacar();    // Saída: O guerreiro atacou usando espada!
        monge.atacar();        // Saída: O monge atacou usando artes marciais!
        ninja.atacar();        // Saída: O ninja atacou usando shuriken!
    }
}
