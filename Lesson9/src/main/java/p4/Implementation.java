package p4;

/**
 * множественное наследование через интерфейсы
 */
public class Implementation implements T1, T2 {
    @Override
    public void method() {
        System.out.println(defaultMessage());
        //логика
    }


    //заставляют вас его заимплементировать как ты хочешь
    @Override
    public String defaultMessage() {
        return null;
    }

}
