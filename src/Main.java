import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число процессоров n (1-5):");
        int n = scanner.nextInt();
        /*System.out.println("Частоты ваших процессоров (1 <= fi <= 2*10^5):");
        int j = scanner.nextInt();*/
        /*for (int i = 1; i < n; i++) {

        }*/
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        int j4 = 0;
        int j5 = 0;
        int minimum = 0;
        int output = 0;
        switch (n) {
            case 1:
                System.out.println("Введите частоту первого вашего процессора");
                j1 = scanner.nextInt();
                minimum = j1;

                if (j1 % minimum == 1){
                    --j1;
                }else{
                    j1=j1;
                }
                output = j1+j2+j3+j4+j5;
                System.out.println(j1 + "=" + output);

                break;
            case 2:
                System.out.println("Введите частоту первого вашего процессора");
                j1 = scanner.nextInt();
                System.out.println("Введите частоту второго вашего процессора");
                j2 = scanner.nextInt();
                if(j2 > j1) {
                    minimum = j1;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j2 && j3 > j2 && j4 > j2 && j5 > j2){
                    minimum = j2;
                    System.out.println("Минимум равен:" + minimum);
                }else{
                    if(j1==j2 | j1==j3 | j1==j4 | j1==j5){
                        minimum = j1;
                        System.out.println("Минимум равен:" + minimum);
                    }else if(j2==j1 | j2==j3 | j2==j4 | j2==j5){
                        minimum = j2;
                        System.out.println("Минимум равен:" + minimum);
                    } else {
                        System.out.println("Минимум не выявлен");
                    }
                }

                    if (j1 % minimum == 1){
                    --j1;
                }else{
                    j1=j1;
                }
                if (j2 % minimum == 1){
                    --j2;
                }else {
                    j2 = j2;
                }

                output = j1+j2+j3+j4+j5;
                System.out.println(j1  + "+" + j2 + "+"  + "=" + output);
                break;
            case 3:
                System.out.println("Введите частоту первого вашего процессора");
                j1 = scanner.nextInt();
                System.out.println("Введите частоту второго вашего процессора");
                j2 = scanner.nextInt();
                System.out.println("Введите частоту третьего вашего процессора");
                j3 = scanner.nextInt();
                if(j2 > j1 && j3 > j1) {
                    minimum = j1;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j2 && j3 > j2 ){
                    minimum = j2;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j3 && j2 > j3){
                    minimum = j3;
                    System.out.println("Минимум равен:" + minimum);
                }else{
                    if(j1==j2 | j1==j3 | j1==j4 | j1==j5){
                        minimum = j1;
                        System.out.println("Минимум равен:" + minimum);
                    }else if(j2==j1 | j2==j3 | j2==j4 | j2==j5){
                        minimum = j2;
                        System.out.println("Минимум равен:" + minimum);
                    }else if(j3==j2 | j3==j1 | j3==j4 | j3==j5){
                        minimum = j3;
                        System.out.println("Минимум равен:" + minimum);
                    }else {
                        System.out.println("Минимум не выявлен");
                    }
                }

                if (j1 % minimum == 1){
                    --j1;
                }else{
                    j1=j1;
                }
                if (j2 % minimum == 1){
                    --j2;
                }else{
                    j2=j2;
                }
                if (j3 % minimum == 1){
                    --j3;
                }else{
                    j3=j3;
                }
                output = j1+j2+j3+j4+j5;
                System.out.println(j1  + "+" + j2 + "+" + j3 + "+" + "=" + output);

                break;
            case 4:
                System.out.println("Введите частоту первого вашего процессора");
                j1 = scanner.nextInt();
                System.out.println("Введите частоту второго вашего процессора");
                j2 = scanner.nextInt();
                System.out.println("Введите частоту третьего вашего процессора");
                j3 = scanner.nextInt();
                System.out.println("Введите частоту четвёртого вашего процессора");
                j4 = scanner.nextInt();
                if(j2 > j1 && j3 > j1 && j4 > j1) {
                    minimum = j1;
                }else if(j1 > j2 && j3 > j2 && j4 > j2){
                    minimum = j2;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j3 && j2 > j3 && j4 > j3){
                    minimum = j3;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j4 && j3 > j4 && j2 > j4){
                    minimum = j4;
                    System.out.println("Минимум равен:" + minimum);
                }else{
                if(j1==j2 | j1==j3 | j1==j4 | j1==j5){
                    minimum = j1;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j2==j1 | j2==j3 | j2==j4 | j2==j5){
                    minimum = j2;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j3==j2 | j3==j1 | j3==j4 | j3==j5){
                    minimum = j3;
                    System.out.println("Минимум равен:" + minimum);
                }
                else if(j4==j2 | j4==j1 | j4==j3 | j4==j5){
                    minimum = j4;
                    System.out.println("Минимум равен:" + minimum);
                }else {
                    System.out.println("Минимум не выявлен");
                }
        }

                if (j1 % minimum == 1){
                    --j1;
                }else{
                    j1=j1;
                }
                if (j2 % minimum == 1){
                    --j2;
                }else{
                    j2=j2;
                }
                if (j3 % minimum == 1){
                    --j3;
                }else{
                    j3=j3;
                }
                if (j4 % minimum == 1){
                    --j4;
                }else{
                    j4=j4;
                }
                output = j1+j2+j3+j4+j5;
                System.out.println(j1  + "+" + j2 + "+" + j3 + "+" + j4 + "+"  + "=" + output);

                break;
            case 5:
                System.out.println("Введите частоту первого вашего процессора");
                j1 = scanner.nextInt();
                System.out.println("Введите частоту второго вашего процессора");
                j2 = scanner.nextInt();
                System.out.println("Введите частоту третьего вашего процессора");
                j3 = scanner.nextInt();
                System.out.println("Введите частоту четвёртого вашего процессора");
                j4 = scanner.nextInt();
                System.out.println("Введите частоту пятого вашего процессора");
                j5 = scanner.nextInt();
                if(j2 > j1 && j3 > j1 && j4 > j1 && j5 > j1) {
                    minimum = j1;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j2 && j3 > j2 && j4 > j2 && j5 > j2){
                    minimum = j2;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j3 && j2 > j3 && j4 > j3 && j5 > j3){
                    minimum = j3;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j4 && j3 > j4 && j2 > j4 && j5 > j4){
                    minimum = j4;
                    System.out.println("Минимум равен:" + minimum);
                }else if(j1 > j5 && j3 > j5 && j4 > j5 && j2 > j5){
                    minimum = j5;
                    System.out.println("Минимум равен:" + minimum);
                }
                else {
                    if(j1==j2 | j1==j3 | j1==j4 | j1==j5){
                        minimum = j1;
                        System.out.println("Минимум равен:" + minimum);
                    }else if(j2==j1 | j2==j3 | j2==j4 | j2==j5){
                        minimum = j2;
                        System.out.println("Минимум равен:" + minimum);
                    }else if(j3==j2 | j3==j1 | j3==j4 | j3==j5){
                        minimum = j3;
                        System.out.println("Минимум равен:" + minimum);
                    }
                    else if(j4==j2 | j4==j1 | j4==j3 | j4==j5){
                        minimum = j4;
                        System.out.println("Минимум равен:" + minimum);
                    }else if(j5==j2 | j5==j1 | j5==j4 | j5==j3){
                        minimum = j5;
                        System.out.println("Минимум равен:" + minimum);
                    }else {
                        System.out.println("Минимум не выявлен");
                    }
                }

                if (j1 % minimum == 1){
                    --j1;
                }else{
                    j1=j1;
                }
                if (j2 % minimum == 1){
                    --j2;
                }else{
                    j2=j2;
                }
                if (j3 % minimum == 1){
                    --j3;
                }else{
                    j3=j3;
                }
                if (j4 % minimum == 1){
                    --j4;
                }else{
                    j4=j4;
                }
                if (j5 % minimum == 1){
                    --j5;
                }else{
                    j5=j5;
                }
                output = j1+j2+j3+j4+j5;
                System.out.println(j1  + "+" + j2 + "+" + j3 + "+" + j4 + "+" + j5 + "=" + output);
                break;
            default:
                System.out.println("что-то пошло не так.");
        }

    }
}
