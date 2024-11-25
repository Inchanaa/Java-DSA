package operator;

public class SetBit {
    public static void main(String[] args) {
        int position = 1;
        int bitMask = 1<<position;
        int n = 5 ;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}

