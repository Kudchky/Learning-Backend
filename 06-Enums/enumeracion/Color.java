package enumeracion;

public enum Color {
    RED("0x3333") {
        public void getDescription() {
            System.out.println("Color rojo");
        }
    },
    GREEN("0x3456") {
        public void getDescription() {
            System.out.println("Color verde");
        }
    },
    BLUE("0x4332") {
        public void getDescription() {
            System.out.println("Color azul");
        }
    };

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

    public abstract void getDescription();
}
