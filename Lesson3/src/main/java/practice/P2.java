package practice;

public class P2 {
    public static void main(String[] args) {
        {
            //        int d;
            int d = 1;
            int res = d + 3;
            System.out.println(d);
            System.out.println(res);
        }

        //вопрос!
        String Chis, CHIS, cHIS, chis = "123";


        {
            //byte(8бит)  -2^7 ....2^7 -1 (-128 -127 -126 ....127)
            int a = 129;
            long b = a;  // преобразование типов: от типа int к типу byte
            System.out.println(b); //-127
        }

        {
            int a = 6;
            byte b = (byte) a;  // преобразование типов: от типа int к типу byte
            System.out.println(b); //
        }

        {
            byte b = 7;
            int d = b;  // преобразование от byte к int
            System.out.println(d);
        }

        {
//Явные преобразования
//Обычно это сужающие преобразования (narrowing) от типа с большей разрядностью к типу с меньшей разрядностью:
            long a = 4;
            int b = (int) a;
            System.out.println(b);
        }

        {
            //Потеря данных при преобразовании
            {
                int a = 5;
                byte b = (byte) a;
                System.out.println(b);
            }

            {
                int a = 258;
                byte b = (byte) a; //-128 ... 0  1 2 ... 127
                System.out.println(b);

                long r = Integer.MAX_VALUE;
                System.out.println((long) r + 1);


                byte kk = (byte) 128;
                System.out.println(kk);

//                System.out.println((byte)kk + (byte)1);
            }
        }
    }


}
