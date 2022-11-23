public class LittleThirdClass extends ThirdClass {
    public char symbol;

    LittleThirdClass(int number, char symbol) {
        super(number);
        this.symbol = symbol;
    }

    public void setData(int number, char symbol) {
        super.setData(number);
        this.symbol = symbol;
    }

    public String toString() {
        return super.toString() + " Значение символьного поля: " + symbol + ".";
    }
}
