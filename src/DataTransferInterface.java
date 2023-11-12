public enum DataTransferInterface {
    PATA("PATA"),
    SATA("SATA"),
    SAS("SAS"),
    NVME("NVME");

    private String name;

    DataTransferInterface(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return name;
    }

    public static DataTransferInterface intToDataTransferInterface (int intType) {
        switch (intType){
            case 0:
                return PATA;
            case 1:
                return SATA;
            case 2:
                return SAS;
            case 3:
                return NVME;
            default:
                throw new IllegalArgumentException("Некорректный формат данных!");
        }
    }
}
