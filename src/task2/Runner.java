package task2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.stream.Stream;

public class Runner {
    //Найти дату, когда был самый большой онлайн (вернуть дату и кол-во людей)
    //НЕОБЯЗАТЕЛЬНО (СЛОЖНО) - если хотите, можете попробовать найти самый большой по онлайн период времени
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100, 500);

        Stream.generate(Runner::generateUser).limit(i); //ТУТ ваш код (решение необязательно через стримы)

    }
    public static UserOnline generateUser(){
        Random random = new Random();

        int randomYearStart = random.nextInt(2020, 2022);
        int randomMonthStart = random.nextInt(1,12);
        int randomDayStart = random.nextInt(1, Month.of(randomMonthStart).maxLength());
        int randomYearEnd = random.nextInt(2020,2022);
        int randomMonthEnd = random.nextInt(1,12);
        int randomDayEnd = random.nextInt(1, Month.of(randomMonthEnd).maxLength());

        LocalDate startUserOnline = LocalDate.of(randomYearStart, randomMonthStart, randomDayStart);
        LocalDate endUserOnline = LocalDate.of(randomYearEnd, randomMonthEnd, randomDayEnd);

        if(startUserOnline.isAfter(endUserOnline)) {
            LocalDate temp = startUserOnline;
            startUserOnline = endUserOnline;
            endUserOnline = temp;
        }

        return new UserOnline (startUserOnline, endUserOnline);
    }
}
