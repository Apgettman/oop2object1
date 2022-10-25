import transport.Car;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "Минск", 35, "бренд-менеджером");
        Human anna = new Human("Аня", "Москва", 29, "методистом образовательных программ");
        Human katya = new Human("Катя", "Калиниград", 28, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 27, "директора по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 21, "сейчас нигде не работаю");
        System.out.println(maksim);
        System.out.println(anna);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        Flower rose = new Flower("Роза обыкновенная", "Красная", "Голландия", 35.59f, 3);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5f, 10);
        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(pion);
        System.out.println(gypsophila);

        Car bmw = new Car("BMW", "Z8", 3.0f, "Белый", 2021,
                "Германия", "АКПП", "Кабриолет", "А500АА97", 2,
                "Летние",null, null);
        Car lada = new Car("Lada", "Grande", 1.7f, "Желтый",
                2015, "Россия", "МКПП", "Универсал", null, 5,
                "Летние", null, null);
        Car audi = new Car("Audi", "A8", 3.0f, "Черный",
                2020, "Германия", "АКПП", "Седан", "А008АА97", 5,
                "Летние", null, null);
        Car kia = new Car("Kia", "Sportage", 2.4f, "Красный",
                2016, "Южная Корея", "АКПП", "Внедорожник", "А800АА97", 5,
                "Летние", null, null);
        Car hyundai = new Car("Hyundai", "Aventa", 2.0f, "Оранжевый",
                2020, "Южная Корея", "АКПП", "Седан", "А100АА97", 5,
                "Летние", null, null);
        System.out.println(bmw);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}
