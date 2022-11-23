public class LittleFourthClass extends FourthClass{
    public String text;

    LittleFourthClass(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public LittleFourthClass(LittleFourthClass oldObject) {
        super(oldObject);
        this.text = oldObject.text;
    }
}
