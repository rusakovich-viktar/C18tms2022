package practice_hw.tms.practice2;

public class Practice4 {
    public static void main(String[] args) {
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
                        break two;
                    }
                    System.out.println("end of three");
                }
                System.out.println("end of two");
            }
            System.out.println("end of one");
        }
    }
}
