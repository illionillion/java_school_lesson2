package sec05;

/**
 * Section0508
 */
public class Section0508 {

    public static void main(String[] args) {
        int[] dat={10,20,30,40,50,60,70,80}; //データ
        int x=50; //探索地
        int target=linerSearch(x, dat);

        if (target==-1) {
            System.out.println("見つかりませんでした");
        }else{
            System.out.println(x+"は"+target+"番目の添え字");
        }
    }

    public static int linerSearch(int x ,int[] dat) {
        
        int target=-1;
        for (int i = 0; i < dat.length; i++) {
            if (dat[i]==x) {
                target=i;
                break;
            }
        }
        return target;
    }
}