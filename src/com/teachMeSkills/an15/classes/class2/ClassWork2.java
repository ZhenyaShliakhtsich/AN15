package com.teachMeSkills.an15.classes.class2;

public class ClassWork2 {
    public static void main(String[] args) {
        // while for do-while

        for (int i = 0; i < 10; i++) {
            System.out.println("Это второе занятие! " + i);
        }
        int a = 0;
        while (a < 15) {
            System.out.println("while number " + a);
            a++;
        }

        int z = 10;

        do {
            System.out.println(z);
            z--;
            System.out.println(z);
        } while (z > 0);

        int b = 10;
        while (true) {
            b--;
            if (b == 3) {
                break;
            }

            System.out.println(b);
        }


        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println("i = " + i);
        }
        first:
        {
            for (int i = 0; i < 20; i++) {
                System.out.println("во внешнем for и в блоке first " + i);
                for (int i1 = 0; i1 < 10; i1++) {
                    System.out.println("в внутреннем for и в блоке first " + i1);
                    if (i1 == 3){
                        break first;
                    }
                }
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println("нечетное число = " + i);
            }
        }

        String string = "ff";

        System.out.println(string);

        System.out.println("ff".equals(string));

        String string1 = "Hello";
        String string2 = ", World!";
        String string3 = string1 + string2;
        System.out.println(string3);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(", ");
        stringBuffer.append("World!");

        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("World!");

        System.out.println(stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder("Hello, World!");

        System.out.println(stringBuilder1);


    }
}
