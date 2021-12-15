package sec05;

/**
 * Section0509
 */
public class Section0509 {

    public static void main(String[] args) {
        int x=21;
        int[] dat={32,7,13,27,18,21,9,3,43};

        int target=s_search(x, dat);

        if (target==-1) {
            System.out.println("見つかりませんでした");
        }else{
            System.out.println(x+"の位置は"+target+"番目");
        }

    }

    public static int s_search(int x,int[] dat) {
        
        int target = -1;
        for (int i = 0; i < dat.length; i++) {
            if (dat[i]==x) {
                target=i;
                break;
            }
        }
        return target;
    }
}