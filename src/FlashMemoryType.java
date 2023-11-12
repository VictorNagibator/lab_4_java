public enum FlashMemoryType {
    SLC("SLC"),
    MLC("MLC"),
    NOR("NOR"),
    NAND("NAND"),
    NAND3D("NAND3D");

    private String name;

    FlashMemoryType(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return name;
    }

    public static FlashMemoryType intToFlashMemoryType (int intType) {
        switch (intType){
            case 0:
                return SLC;
            case 1:
                return MLC;
            case 2:
                return NOR;
            case 3:
                return NAND;
            case 4:
                return NAND3D;
            default:
                throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }
}
