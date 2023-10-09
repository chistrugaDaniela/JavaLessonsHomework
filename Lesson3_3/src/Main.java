import stringValueDefinition.StringValueDefinition;

public class Main {
    public static void main(String[] args) {
        StringValueDefinition booleanPrimitive = new StringValueDefinition("tRue");
        System.out.println(booleanPrimitive.convertStringIntoBoolean());

        StringValueDefinition bytePrimitive = new StringValueDefinition("120");
        System.out.println(bytePrimitive.convertStringIntoByte());

        StringValueDefinition shortPrimitive= new StringValueDefinition("32000");
        System.out.println(shortPrimitive.convertStringIntoShort());

        StringValueDefinition intPrimitive = new StringValueDefinition("147895632");
        System.out.println(intPrimitive.convertStringIntoInt());

        StringValueDefinition longPrimitive = new StringValueDefinition("987654321987654321");
        System.out.println(longPrimitive.convertStringIntoLong());

        StringValueDefinition doublePrimitive = new StringValueDefinition("4444.5d");
        System.out.println(doublePrimitive.convertStringIntoDouble());

        StringValueDefinition floatPrimitive = new StringValueDefinition("2354.56f");
        System.out.println(floatPrimitive.convertStringIntoFloat());
    }
}