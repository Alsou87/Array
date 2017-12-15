import java.util.Random;
public class Qwww {
    int intArray[];
    public static void main (String[] args) {
        int intArray[];
        intArray = new int[21];
        int max = intArray[0];
        int min = intArray[0];
        int posmin1=0;
        int posmax2=0;
        for (int i = 0; i < intArray.length; i++) {//задаем элементы массива
            intArray[i] = ((int) (Math.random() * 21) - 10);
            System.out.println("Элемент массива номер "+i+" равен: "+intArray[i]);
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {//первый отрицательный элемент массива
                min = intArray[i];
            }
            if (intArray[i] > 0) {
                max = intArray[i];
            }
        }
        for (int i = 0; i < intArray.length; i++) {//сравнение положительных элементов массива
            if (intArray[i] < min) {//сравнение отрицательных элементов массива
                min = intArray[i];
                posmin1=i;
            }
            if (intArray[i] < max & intArray[i]>0) {//сравнение положительных элементов массива
                max = intArray[i];
                posmax2=i;
            }
        }
        System.out.println("Максимальный отрицательный элемент массива: " + min);
        System.out.println("Минимальный положительный элемент массива: " + max);
        intArray[posmin1]=max;
        intArray[posmax2]=min;
        System.out.println("Новый массив (поменяли местами) "+posmin1+" и "+posmax2);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Элемент массива номер "+i+ " равен: "+intArray[i]);
        }

    }
    }




