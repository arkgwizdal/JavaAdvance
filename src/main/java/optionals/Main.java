package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        String empty = null;

        // ofNullable używamy gdy w optional moze być null
        Optional<String> stringOptional = Optional.ofNullable(empty);

        System.out.println(stringOptional);

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }


        String name = "Tomek";

        // .of używamy gdu w optionalu nie ma null
        Optional<String> nameOptional = Optional.of(name);

        var name1 = nameOptional.orElse("Kamil");  // wyświetli tomek dlatego że jest wartoś zapisna w Otpionalu
        System.out.println(".orElse : " +name1);

        name1 = stringOptional.orElse("Kmail"); // wyświetli Kamil gdyż w StrinOptional nie ma zapisanej wartości jest null
        System.out.println("orElse : "+name1);

        // .orElseGet()
        var name3 = nameOptional.orElseGet(() -> "Kamilos " );
        System.out.println(".orEleseGet() : "+name3);

        //orElseThrow()
        System.out.println("orElseThrow() dla null : ");
        stringOptional.orElseThrow(() -> new RuntimeException("W optionalu nic nie było!"));
        System.out.println("orElseThrow() dla Tmek : ");
        nameOptional.orElseThrow(() -> new RuntimeException("W optionalu nic nie było!"));



    }
}
