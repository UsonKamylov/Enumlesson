public enum Oblastar {
    BATKEN("Oruk zarlar"),
    OSH("Sulaiman too"),
    JALAL_ABAD("Kurmanbek baatyr"),
    NARYN("suuk oblast"),
    TALAS("Manas baatyr"),
    CHUI("Borbor"),
    YSSYK_KOL("Kol");
    private String ozgocholuktor;
    Oblastar(String ozgocholuktor){
        this.ozgocholuktor=ozgocholuktor;

    }




    @Override
    public String toString() {
        return "Oblastar{" +
                "ozgocholuktor='" + ozgocholuktor + '\'' +
                '}';
    }
}
