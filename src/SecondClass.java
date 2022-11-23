public class SecondClass {
    private String text;

    SecondClass(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = text;
    }

    public int getText() {
        return text.length();
    }

}
