package com.company;


public class Main {

    public static void main(String[] args) {
        int result;
        for (int i = 0; i <16; i++) {
            result=(int) Math.pow(2, i);
            System.out.print("Result = "+result+ ",  n="+i+"\n");
        }
    }
}


/*

Задание 2.2

package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int faсtorial=1;
        System.out.println("Введите значение n, 0<n<10: ");
        short n = in.nextShort();
        while (n<0 || n>10){
            System.out.println("Введено неверное значение n.");
            n = in.nextShort();}
        for (int i = 1; i <= n; i++) {
            faсtorial *= i;
        }
        System.out.println(n + "!=" + faсtorial);

    }
}

Задание 2.3

package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float difference = 0;
        float sum = 0;
        float multiplication = 0;
        System.out.println("Введите первое число :");
        float firstNumber = in.nextFloat();
        System.out.println("Введите второе число :");
        float secondNumber = in.nextFloat();
        difference = firstNumber-secondNumber;
        System.out.println("Разность этих чисел равна : " + difference);
        sum = firstNumber+secondNumber;
        System.out.println("Сумма этих чисел равна : " + sum);
        multiplication = firstNumber*secondNumber;
        System.out.println("Произведение этих чисел равно : " +  multiplication);
    }
}

Задание 2.4

package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float time = 0;
        System.out.println("Введите высоту падения материального тела h : ");
        float high = in.nextFloat();
        while (high < 0){
            System.out.println("Введены неправильные данные, попробуйте еще раз: ");
            high = in.nextFloat();
        }
        time = (float)Math.sqrt((2*high)/9.8);
        System.out.println("Время свободного падения t : " + time);
    }
}

Задание 2.5

package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float b = 0;
        System.out.println("Введите длину катета : ");
        float a = in.nextFloat();
        while(a <= 0) {
            System.out.println("Неверное значение длины катета. Введите, пожалуйста, корректные данные :");
            a = in.nextFloat();
        }
        System.out.println("Введите длину гипотенузы :");
        float c = in.nextFloat();
        while (c <= 0) {
            System.out.println("Неверное значение длины гипотенузы. Введите, пожалуйста, корректные данные :");
            c = in.nextFloat();
        }
        b = (float)Math.sqrt(c*c-a*a);
        System.out.println("Длина второго катета равна : \n" + b);
    }
}
*/

