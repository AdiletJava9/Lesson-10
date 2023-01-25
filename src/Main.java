public class Main {
    public static void main(String[] args) {

        System.out.println(method(10,20,30));
    }

    public static int method(int...varrags){
        int s =0;
        for (int i = 0; i < varrags.length; i++) {
            s=s+varrags[i];
        }
        return s;

    }
}