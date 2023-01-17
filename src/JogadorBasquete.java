public class JogadorBasquete extends Esportista{
    private String nome;
    private Integer numeroDePontos = 0;
    private Integer numeroDeFaltas = 0;

    public JogadorBasquete() {
    }

    public JogadorBasquete(String nome) {
        this.nome = nome;
    }

    public void pontuar(boolean isDeTres) {
        if (isDeTres) {
            this.numeroDePontos += 3;
            System.out.println(this.nome+" marcou uma cesta de 3.");
            System.out.println("Pontuação total de "+this.nome+": "+this.numeroDePontos+"\n");
        } else {
            this.numeroDePontos += 2;
            System.out.println(this.nome+" marcou uma cesta de 2.");
            System.out.println("Pontuação total de "+this.nome+": "+this.numeroDePontos+"\n");
        }
    }
    @Override
    public void cometerFalta() {
        this.numeroDeFaltas += 1;
        System.out.println(this.nome+" marcou falta!");
        if (this.numeroDeFaltas == 5) {
            System.out.println(this.nome+" atingiu o limite de 5 faltas e foi expulso(a).\n");
        }
    }
}
