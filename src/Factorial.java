
public class Factorial {

    public static void main(String[] args) {

        int jav;
        int fac;

        jav = 8;

        int i;
        if (jav == 0) {
            fac = 1;
        } else {
            fac = 1;
            for (i = jav; i >= 1; i--) {
                fac = fac * i;
            }
        }

        System.out.println(fac);

    }

}
