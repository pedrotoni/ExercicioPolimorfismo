public class Main {
    public static void main(String[] args) {
        JogadorBasquete lebron = new JogadorBasquete("Lebron");
        JogadorFutebol ronaldo = new JogadorFutebol("Ronaldo");

        //Testes método pontuar com parametro (basquete) / sem parametro (futebol)
        lebron.pontuar(false);
        lebron.pontuar(false);
        lebron.pontuar(true);
        lebron.pontuar(false);
        lebron.pontuar(true);

        ronaldo.pontuar();
        ronaldo.pontuar();
        ronaldo.pontuar();

        JogadorFutebol marta = new JogadorFutebol("Marta");
        JogadorFutebol neymar = new JogadorFutebol("Neymar");
        JogadorBasquete curry = new JogadorBasquete("Stephen Curry");

        //teste metodo cometerFalta sem parametro(basquete).
        curry.cometerFalta();
        curry.cometerFalta();
        curry.cometerFalta();
        curry.cometerFalta();
        curry.cometerFalta();

        //teste metodo cometerFalta com parametro isGrave == true;
        marta.cometerFalta(true);

        //teste metodo cometerFalta com parametro isGrave == false;
        neymar.cometerFalta(false);
        neymar.cometerFalta(false);
        neymar.cometerFalta(false);
        neymar.cometerFalta(false);
    }
}