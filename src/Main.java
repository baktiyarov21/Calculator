import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Random random = new Random();
            int n = 100;
            double[] array = new double[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }

            double max = array[0]; // Массив не должен быть пустым
            double min = array[0];
            double avg = 0;
            for (int i = 0; i < array.length; i++) {
                if(max < array[i])
                    max = array[i];
                if(min > array[i])
                    min = array[i];
                avg += array[i]/array.length;
            }

            System.out.println("max = " + max);
            System.out.println("min = " + min);
            System.out.println("avg = " + avg);
        }
        /*int length = 8;
        int arr[] = new int[length];
        for (int num = 0; num < 8; num++) {
            Random random = new Random();
            arr[num] = random.nextInt(10);
        }
        for (int line : arr) {
            if (line % 2 == 0) {
                System.out.println(line);
            }
        }
            /*ThreadTest threadTest = new ThreadTest();
            Thread runnable = new Thread(threadTest);
            runnable.start();
            int arr [] = new int[10];


            int j = 0;
            while (j < 100 ) {
                System.out.println("Первая переменная равна: " + j);
                j++;
            }

        }
    }
    class ThreadTest implements Runnable{
    @Override
        public void run() {
            for(int i = 0; i < 100; i ++){
                System.out.println("Вторая переменная i равна: " + i);
            }
        }
    }*/
    }

