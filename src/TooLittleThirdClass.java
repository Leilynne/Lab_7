public class TooLittleThirdClass extends LittleThirdClass {

    public String text;

    TooLittleThirdClass(int number, char symbol, String text) {
        super(number, symbol);
        this.text = text;
    }

    public void setData(int number, char symbol, String text) {
        super.setData(number, symbol);
        this.text = text;
    }

    public String toString() {
        return super.toString() + " Значение текстового поля: " + text + ".";
    }
}
