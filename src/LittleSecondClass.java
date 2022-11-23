public class LittleSecondClass extends SecondClass{
    public int number;

    public LittleSecondClass(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    public void setData(int number) {
        this.number = number;
        super.setText("1");
    }

    public void setData() {
        this.number = 1;
        super.setText("1");

    }
    public void setData(int number, String text) {
        this.number = number;
        super.setText(text);
    }
}
