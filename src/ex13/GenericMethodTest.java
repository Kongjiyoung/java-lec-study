package ex13;

public class GenericMethodTest {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.printf("%s  ", element); //printf는 다양한 자료형에 대한 형식 지정할 수 있음
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] iArray = {10, 20, 30, 40, 50};
        Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] cArray = {'K','O','R','E','A'};

        printArray(iArray);
        printArray(dArray);
        printArray(cArray);
    }
}
