package design_patterns.abstract_factory_pattern;

class HDFC implements Bank {
    private final String BNAME;

    public HDFC() {
        BNAME = "HDFC BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
