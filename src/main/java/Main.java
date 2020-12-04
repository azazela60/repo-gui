
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        1.	Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        2.	Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
        соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        3.	Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        */

        Random rand = new Random ();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt (10);
        int heigth = rand.nextInt (10);
        actions[0] = new Human ("Василий", distance, heigth);

        distance = rand.nextInt (10);
        heigth = rand.nextInt (10);
        actions[1] = new Robot ("R2D2", distance, heigth);

        distance = rand.nextInt (10);
        heigth = rand.nextInt (10);
        actions[2] = new Cat ("Барсик", distance, heigth);

        Barrier[] barriers = new Barrier[7];

        boolean isTreadmill;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt (10);
            isTreadmill = rand.nextBoolean ();
            if (isTreadmill) {
                barriers[i] = new Treadmill ("Run " + i, distance);
            } else {
                barriers[i] = new Wall ("Wall " + i, distance);
            }
        }

        for (Actions action : actions) {
            boolean result = true;
            for (Barrier barrier : barriers) {


                result = barrier.moving (action);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println ("Success!!");
            } else {
                System.out.println ("unsuccessfully!!");
            }
        }
    }
}

