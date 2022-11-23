public class FifthClass {
    protected String text;

    public FifthClass(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(this.getClass().getName() +
         ". Текстовое поле: " + text);
    }
}
