public class TruthTable {
    public static void main(String[] args) {
        System.out.println("таблица истинности");
        String s = """              
                                    && AND (И)        ||  OR (ИЛИ)   ^ XOR(исключающее ИЛИ)      !  NOT
                                    ЗАГС              ДЕТСКИЙ САДИК          ПРОГУЛКА              НЕ
                 __x____y______|__жених_&&_невеста__|_мама_||_папа__|____^велосипед^____|____!x_(отрицание)_____|
                 true  true    |     true           |      true     |         false     |          false
                 false true    |     false          |      true     |         true      |          true   
                 true  false   |     false          |      true     |         true      |          false   
                 false false   |     false          |      false    |         false     |          true   
                                            
                """;

        boolean a = true;
        boolean b = false;

        if (a && b) {
            //
        }

//        A || B истинно, если истинно A или B, или оба сразу.
//        A ^  B истинно, если истинно A или B, но не оба сразу.
//        Операция ^  исключает последний вариант («оба сразу») и по этой причине называется исключающим «ИЛИ».
//        Операция || включает последний вариант («оба сразу») и по этой причине иногда называется включающим «ИЛИ».
        System.out.println(s);
    }
}
