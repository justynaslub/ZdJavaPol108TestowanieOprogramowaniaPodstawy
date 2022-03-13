package pl.sdacademy.unit.test.basic.exercises.unit.task2;

public class StringUtil {

    public static boolean isBlank(String input) {
        return input == null || input.trim().isEmpty();
    }
}
// "" - true
// "   " - true
//"\n" - true

// "Ala ma" - false
//" . " - false