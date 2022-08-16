package setTask;

public class CustomEntity {
    private String textAttribute;
    public int numberAttribute;

    @Override
    public String toString() {
        return "CustomEntity{" +
                "textAttribute='" + textAttribute + '\'' +
                ", numberAttribute=" + numberAttribute +
                '}';
    }

    public CustomEntity(String textAttribute, int numberAttribute){
        this.textAttribute = textAttribute;
        this.numberAttribute = numberAttribute;
    }

    public String getTextAttribute() {
        return textAttribute;
    }

    public void setTextAttribute(String textAttribute) {
        this.textAttribute = textAttribute;
    }

    public int getNumberAttribute() {
        return numberAttribute;
    }

    public void setNumberAttribute(int numberAttribute) {
        this.numberAttribute = numberAttribute;
    }
}
