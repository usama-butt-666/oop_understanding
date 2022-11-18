package design_patterns.abstract_factory_pattern;

class ICICI implements Bank {
    private final String BNAME;

    ICICI() {
        BNAME = "ICICI BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
