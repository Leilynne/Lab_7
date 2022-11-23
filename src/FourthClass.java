public class FourthClass {
    public char symbol;

    FourthClass(char symbol) {
        this.symbol = symbol;
    }

    FourthClass(FourthClass oldObject) {
        this.symbol = oldObject.symbol;
    }
}

