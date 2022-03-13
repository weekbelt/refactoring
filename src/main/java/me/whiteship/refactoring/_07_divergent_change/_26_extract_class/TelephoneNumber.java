package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class TelephoneNumber {

    private String areaCode;
    private String number;

    public TelephoneNumber() {
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "TelephoneNumber{" +
            "areaCode='" + areaCode + '\'' +
            ", number='" + number + '\'' +
            '}';
    }
}