package firststeps.byteshortintlong;

public class Main {
    public static void main(String[] args){
        int myValue = 10000;

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = " + myMinShortValue);
        System.out.println("short Maximum Value = " + myMaxShortValue);

        long myLongVar = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMinLongValue);
        System.out.println("long Maximum Value = " + myMaxLongValue);

//        casting

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2 );

        short myNewShortValue = (short) (myMinShortValue / 2);

        byte anyByteNumber = 100;
        short anyShortNumber = 30000;
        int anyIntNumber = 1000000;

        long myVeryLongVariable = 50000L + 10L * (anyByteNumber + anyShortNumber + anyIntNumber);
        System.out.println(myVeryLongVariable );
    }
}
