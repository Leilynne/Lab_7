public class TooLittleFourthClass extends LittleFourthClass{
    public int number;

    TooLittleFourthClass(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    public TooLittleFourthClass(TooLittleFourthClass oldObject) {
        super(oldObject);
        this.number = oldObject.number;
    }
}
