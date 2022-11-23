public class TestClass {
    public static void main(String[] args) {
        FifthClass fifth = new FifthClass("Родительский класс");
        LittleFifthClassOne fifthOne = new LittleFifthClassOne("Унаследованный класс", 1);
        LittleFifthClassTwo fifthTwo = new LittleFifthClassTwo("Унаследованный класс", '=');

        fifth.print();
        fifthOne.print();
        fifthTwo.print();
    }
}
