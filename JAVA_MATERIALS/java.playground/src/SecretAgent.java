public class SecretAgent {

    public static class WrongWireException extends Exception {
        public WrongWireException(String message) {
            super(message);
        }
    }


    public void cutTheWire(String wireColor) throws WrongWireException {
        if (wireColor.equals("червоний")) {
            System.out.println("Бомбу знешкоджено");
        } else if (wireColor.equals("синій")) {
            throw new WrongWireException("Не вгадав! БУУУУМ");
        } else {
            System.out.println("Проводів всього два - розріж один з них");
        }
    }
}
