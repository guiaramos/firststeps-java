package firststeps.floatdouble;

public class Main {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min value is = " + myMinFloatValue);
        System.out.println("Float Max Value is = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value is = " + myMinDoubleValue);
        System.out.println("Double Max Value is = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5F / 3.00F;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double kilograms = 5.98;
        double criteria = 0.45359237;
        double result = kilograms * criteria;
        System.out.println("result = "+ result);




    }
}
