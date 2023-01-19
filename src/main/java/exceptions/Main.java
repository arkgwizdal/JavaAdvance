package exceptions;

class Main {
    public static void main(String[] args) {
        int[] ints = new int[0];
        // ints[1] = 1;

        try{
            throwException();
        } catch (RuntimeException ex){
            ex.printStackTrace();
        }


    }

    private static void throwException(){
        throw new RuntimeException("Błąd");
    }
}
