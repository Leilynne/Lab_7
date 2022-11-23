public class LittleFifthClassTwo extends FifthClass{
    protected char symbol;

    public LittleFifthClassTwo(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getName() +
                ". Текстовое поле: " + text + ". Символьное поле: " + symbol);
    }
}
