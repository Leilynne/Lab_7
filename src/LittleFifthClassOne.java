public class LittleFifthClassOne extends FifthClass{
   protected int number;

       public LittleFifthClassOne(String text, int number) {
        super(text);
        this.number = number;
    }
    @Override
    public void print() {
        System.out.println(this.getClass().getName() +
                ". Текстовое поле: " + text + ". Числовое поле: " + number);
    }
}
