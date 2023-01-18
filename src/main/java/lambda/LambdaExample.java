package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {
        Hospital internist = new Internist();
        internist.treat();


//  *****  Standardowa implementacja ***
// ********************************************
//    Hospital opthamologist = new Hospital() {
//        @Override
//        public void treat() {
//            System.out.println("Okulista zaczyna leczyć");
//        }
//    };


 //***********  -------------    Zapis WYRAŻENIE LAMBDA !!! ------------   ***************
        // działa tylko i wyłącznie gdy w interfejsie jest jedna metoda zeby było wiadomo co ma być uruchomione
        Hospital opthamologist = () -> System.out.println("Okulista zaczyna leczyć");
// ***************************************************************************************
    opthamologist.treat();
    /*
    Doctor doctor = new Doctor() {
        @Override
        public String process(String s) {
            return "Hellow doctor " + s+" !";
        }
    };
    */

        Doctor doctor = (String s) -> "Hellow doctor " + s +" !"; // przyw wiekszej ilosći iteracji dajemy w { }

    var greetings = doctor.process("Damian");
        System.out.println(greetings);

        List<String> doctors = List.of("Damian", "Karol", "Matylda", "Tamara");
/*
        var editedList = editedDoctors(doctors,
        new Doctor() {
                    @Override
                    public String process(String s) {
                        return s.toUpperCase();
                    }
                };
*/
        // WYrażenie lambda pozwala na dodanie do każdego lekaża Hello przed imieniem
        var editedList = editedDoctors(doctors, (s) -> "Hello "+s);
        System.out.println(editedList);

        // Wurażenie lambda pozwala na zliczenie liczby znaków  w imieniu każdego lekarza
        var couterdDoctorsList = coutedDoctors(doctors, d-> d.length());
        System.out.println(couterdDoctorsList);
    }

    private static List<Integer> coutedDoctors(List<String> doctors,
                                              IntigerInterfaceFunkcjional funkcjionalInterface){
        var resoult = new ArrayList<Integer>();
        for (String d:doctors){
            resoult.add(funkcjionalInterface.process(d));
        }
        return resoult;

    }

    private static List<String> editedDoctors(List<String> doctors, Doctor doctor){
        var result = new ArrayList<String>();
        for (String name : doctors ){
            result.add(doctor.process(name));
        }return result;
    }
//    @Override
//    public String getDoctorName(){
//        return "Tomek";
//    }
}
