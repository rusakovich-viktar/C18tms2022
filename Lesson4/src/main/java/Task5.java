//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически, (расширяющее приведение)
//    я (явное) – если нужно использовать явное преобразование, (сужающее приведение)
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn
//}
public class Task5 {
    public static void main(String[] args) {
        System.out.println("""
                            byte    Short   Char    Int    Long   float  double  boolean
                                
                byte          т     ня      я       ня      ня      ня      ня      x
                Short         я     т       я       ня      ня      ня      ня      x
                Char          я     я       т       ня      ня      ня      ня      x
                Int           я     я       я       т       ня      ня      ня      x
                Long          я     я       я       я       т       ня      ня      x
                float         я     я       я       я       я       т       ня      x
                double        я     я       я       я       я       я       т       x
                boolean       x     х       х       х       х       х       х       т""");
    }
}
