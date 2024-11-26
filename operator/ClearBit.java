package operator;

public class ClearBit {
    public static void main(String[] args) {
        int pos = 2;
        int bitMask = 1<<pos;
        int n = 5;                          //0101
        int notbitMask = ~(bitMask);
        int newNumber = notbitMask & n ;
        System.out.println(newNumber);          // 1 --> 0001 --> position 2 is "0"
    }
}
