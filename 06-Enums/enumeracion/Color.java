package enumeracion;

public enum Color {
    RED("0x3333"),
    GREEN("0x3456"),
    BLUE("0x4332");

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
