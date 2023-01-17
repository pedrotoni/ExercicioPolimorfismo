public class JogadorFutebol extends Esportista {

    private String nome;
    private Integer numeroDeGols = 0;
    private Integer numeroDeFaltas = 0;

    public JogadorFutebol(String nome) {
        this.nome = nome;
    }

    @Override
    public void pontuar() {
        this.numeroDeGols += 1;
        System.out.println(this.nome+" marcou um gol!");

        if (this.numeroDeGols == 1) {
            System.out.println("Total "+this.nome+": "+this.numeroDeGols+" gol.\n");
        } else if (this.numeroDeGols > 1) {
            System.out.println("Total "+this.nome+": "+this.numeroDeGols+" gols.\n");
        }
    }

    public void cometerFalta(boolean isGrave) {
        this.numeroDeFaltas += 1;
        System.out.println(this.nome+" marcou uma falta!");
        if (this.numeroDeFaltas == 2) {
            System.out.println(this.nome+" cometeu duas faltas e tomou cartão amarelo.\n");
        }

        if (this.numeroDeFaltas == 4) {
            System.out.println(this.nome+" cometeu quatro faltas e foi expulso(a).\n");
        }

        if (isGrave) {
            System.out.println(this.nome+" cometeu falta grave e foi expulso(a)!\n");
        }
    }
}
