public class Traverse {
    public static void main(String[] args) {
        String t[] = new String[4];
        t[0] = "First";
        t[1] = "Second";
        t[2] = "Third";
        t[3] = "Last";

        for (int i = 0; i < t.length ; i++) {
            System.out.println(t[0]);
        }

        String tt[] = {"First","Second","Third","Last"};
        for (String i:tt
             ) {
            System.out.println(i);

        }

        String ttt[] = {"First","Second","Third","Last"};
        for (int i = 0; i < ttt.length; i++) {
            System.out.println(ttt[3]);
        }
    }





}
