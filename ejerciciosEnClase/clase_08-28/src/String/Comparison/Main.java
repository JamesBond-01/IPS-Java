package String.Comparison;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // String
        String s = "Leandro";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start));

        //String Builder
        StringBuilder sb = new StringBuilder("Leandro");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        String s2 = sb.toString();
        System.out.println("StringBuilder: " + (end2 - start2));

        //String Buffer
        StringBuffer sbff = new StringBuffer("Leandro");
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sbff.append(i);
        }
        long end3 = System.currentTimeMillis();
        String s3 = sbff.toString();
        System.out.println("StringBuffer: " + (end3 - start3));
        System.out.println("String == StringBuilder -> " + s.equals(s2) + "\nString == StringBuffer -> " + s.equals(s3));
    }
}