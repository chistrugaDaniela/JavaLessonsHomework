package stringValueDefinition;

public class StringValueDefinition {
    String stringToBeDefined;

    public StringValueDefinition(String stringToBeDefined) {
        this.stringToBeDefined = stringToBeDefined;
    }

    public boolean convertStringIntoBoolean() {
        boolean stringIntoBoolean = Boolean.parseBoolean(stringToBeDefined);
        return stringIntoBoolean;
    }

    public byte convertStringIntoByte() {
        byte stringIntoByte = Byte.parseByte(stringToBeDefined);
        return stringIntoByte;
    }

    public short convertStringIntoShort() {
        short stringIntoShort = Short.parseShort(stringToBeDefined);
        return stringIntoShort;
    }

    public int convertStringIntoInt() {
        int stringIntoInt = Integer.parseInt(stringToBeDefined);
        return stringIntoInt;
    }

    public long convertStringIntoLong() {
        long stringIntoLong= Long.parseLong(stringToBeDefined);
        return stringIntoLong;
    }

    public double convertStringIntoDouble() {
        double stringIntoDouble = Double.parseDouble(stringToBeDefined);
        return stringIntoDouble;
    }

    public float convertStringIntoFloat() {
        float stringIntoFloat = Float.parseFloat(stringToBeDefined);
        return stringIntoFloat;
    }
}