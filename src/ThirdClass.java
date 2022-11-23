public class ThirdClass {
    public int number;

    ThirdClass(int number) {
        this.number = number;
    }

    public void setData(int number) {
        this.number = number;
    }

    public String toString() {
        return this.getClass().getName() + ". Значение целочисленного поля: " + number + ".";
    }
}
