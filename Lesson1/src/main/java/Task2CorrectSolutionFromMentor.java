public class Task2CorrectSolutionFromMentor {
    public static void main(String[] args) {
        int count = 0;
        for (String arg : args) {
            if (Integer.parseInt(arg) > 0) {
                count = count + 1;
            }
        }
        System.out.println("Количество положительных чисел " + count);
    }
}

/*0) В Идее создать новый модуль Lesson1. File->new -> Project-> выбираем Maven и версию java->next->Lesson1(название проекта)->Finish
1) В Lesson1 в папке src->main->java создать класс Task1, добавить метод main.
2) Внутри метод main объявить локальную переменую count типа int для подсчета количества положительных чисел, присвоить ей значение 0;(https://otus.ru/nest/post/620/)
3) Все введеные числа придут в метод main в виде аргументов String[] args
4) Необходимо пробежаться по списку аргументов испозьзуя шаблон iter
5) Внутри for конвертировать аргумент arg из String в int (https://javarush.ru/groups/posts/244-vopros-otvet-kak-v-java-praviljhno-konvertirovatjh-string-v-int--)
6) Проверить, что конвертируемое значение положительное с помощью оператора if
7) Написать условие, если значение положительное, то увеличить count на 1.
Вывести на консоль результат переменной count.
PS: запускать программу лучше руками через консоль.*/


