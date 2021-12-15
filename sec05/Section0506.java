package sec05;

/**
 * Section0505
 */
public class Section0506 {

    public static void main(String[] args) {
        String address="ocs2121@gmail.com";
        String text="お疲れ様です。明日の課題について詳細を教えてください。";
        email(address, text);
    }

    public static void email(String address,String text) {
        System.out.println(address+"に、以下のメールを送信しました");
        System.out.println("件名： 無題");
        System.out.println("本文："+text);
    }

    public static void email(String title,String address,String text) {
        System.out.println(address+"に、以下のメールを送信しました");
        System.out.println("件名："+title);
        System.out.println("本文："+text);
    }
}