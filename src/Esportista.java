public abstract class Esportista {

    public Esportista() {}

    /*metodo pontuar() foi sobreescrito na classe JogadorFutebol
    e teve sobrecarga na classe JogadorBasquete.
     */
    public void pontuar() {
        System.out.println("Você pontuou!");
    }
    /*metodo cometerFalta() foi sobreescrito na classe JogadorBasquete
     e teve sobrecarga na classe JogadorFutebol*/
    public void cometerFalta() {
        System.out.println("Você cometeu uma falta!");
    }

}
