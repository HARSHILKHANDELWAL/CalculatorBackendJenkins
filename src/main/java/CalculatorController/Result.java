package CalculatorController;

public class Result {
    private String type;
    private String value;


    public void setType(String type) {
        this.type = type;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public String getType() {
        return type;
    }

}