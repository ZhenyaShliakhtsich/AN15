package com.teachMeSkills.an15.VorobyovSergey.hwOne;

import java.util.Random;
import java.util.Scanner;

//При запуске приложения в консоль выводится "какой сегодня день?" (от 1 до 30).
// После того как пользователь вводит значение,
// значение должно сравниться с рандомно сгенерированным значением.
// Если пользователь не угадал, вывести в консоль "не угадал, (реальный день)".
// Продолжить работу приложения сначала. Если пользователь угадал, вывести в консоль "Угадал! Хорошего дня!"
// и завершить выполнение программы.
class Task3 {
    //Try with scanner hear. But you can get exception
    public static void main(String... args) {
        //That all we need:
        boolean isCoincidence = false; //flag
        int userNumber;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //While loop
        while (!isCoincidence){
            //limiting the result to be greater that or equal origin and less than bound.
            int randomNumberInMyLimits = random.nextInt(31  );

            System.out.println("Какой сегодня день? (от 1 до 30).");
            userNumber = scanner.nextInt();

            if (userNumber == randomNumberInMyLimits){
                System.out.println("Угадал! Хорошего дня! " + randomNumberInMyLimits);
                isCoincidence = true;
            } else {
                System.out.println("Не угадал, (реальный день - " + randomNumberInMyLimits + ")");
            }
        }
    }

}

// boolean coincidence = false; почему такое название переменной?
//Ответ: исправлено на isCoincidence как на занятии
// не компилируется
//Ответ исправлено на random.nextInt(31  ); Но в java 17 у меня все классно работало
//int nextInt(int origin, int bound) {
//   int n = bound - origin;
//   if (n > 0) {
//     return nextInt(n) + origin;
//   }
//   else {  // range not representable as int
//     int r;
//     do {
//       r = nextInt();
//     } while (r < origin || r >= bound);
//     return r;
//   }
// }