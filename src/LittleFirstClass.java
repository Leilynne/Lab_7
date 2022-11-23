public class LittleFirstClass extends FirstClass{
    private String myText;

    LittleFirstClass(String text) {
        super(text);
        this.myText = "Nothing";
    }

    LittleFirstClass(String text, String myText) {
        super(text);
        this.myText = myText;
    }

    public String toString() {
        return super.toString() + ". Значение личного текстового поля: " + myText;
    }
}
