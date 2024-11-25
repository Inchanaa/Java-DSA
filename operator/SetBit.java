package operator;

public class SetBit {
    public static void main(String[] args) {
        int position = 1;
        int bitMask = 1<<position;
        int n = 5 ;
        System.out.println(bitMask);
        System.out.println(bitMask & n);
        if ( (bitMask | n) == 0 ) {
            System.out.println("zero");
            
        }else{
            System.out.println("non-zero");
        }
    }
}

