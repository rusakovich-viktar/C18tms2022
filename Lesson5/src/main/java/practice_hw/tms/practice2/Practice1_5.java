package practice_hw.tms.practice2;

//https://metanit.com/java/tutorial/2.6.php
public class Practice1_5 {
    public static void main(String[] args) {
        //поговорим про операторы ветвления

        //задача про светофор

        //задача про сезоны года

        // что будет
//        byte number = 2;
//        switch (number) {
//            case 13:
////            case 13:
//            case 129:
//        }


        one:
        //именнованый блок
        {
            System.out.println("start of one");
            two:
            {
                System.out.println("start of two");
                three:
                {
                    System.out.println("start of three");
                    if (true) {
                        break three;
                    }
                    System.out.println("end of three");
                }
                System.out.println("end of two");
            }
            System.out.println("end of one");
        }


//        int monthIndex = 0;
//        //switch
//        switchExample(monthIndex);
/*
Выражение в switch должно иметь тип char, byte, short, int, enum (начиная с Java 6) или String(начиная с Java 7).
Использование любого другого типа, например float, приведет к ошибке компиляции.
 */
    }

    private static void switchExample(int monthIndex) {
        switch (monthIndex) {
            case 0:
                System.out.println("январь");
                break;
            case 1:
                System.out.println("февраль");
                break;
            case 2:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            default:
                System.out.println("не нашли месяц");

        }
    }


}
