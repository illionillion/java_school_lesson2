package sec04;

/**
 * Section0406
 */
public class Section0406 {

    public static void main(String[] args) {
        int[] array={1,2,3};
        intArray(array); //この呼び出しでarray配列がそれぞれ +1 される
        for(int i:array){
            System.out.println(i);
        }
    }

    public static void intArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++; //参照渡しされた配列の要素をそれぞれ +1 する
        }
    }


}