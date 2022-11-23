public class FirstClass {
    private String text;

    FirstClass(String text) {
        this.text = text;
    }

    public String toString() {
        return this.getClass().getName() + " значение текстового поля: " + text;
    }
}
