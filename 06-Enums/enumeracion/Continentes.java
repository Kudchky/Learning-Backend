package enumeracion;

public enum Continentes {
    AMERICA(53, "1.2 millones"),
    ASIA(150, "2 millones"),
    EUROPA(89, "4.4 millones"),
    AFRICA(101, "5 millones "),
    OCEANIA(15, "6 millones");

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
}
