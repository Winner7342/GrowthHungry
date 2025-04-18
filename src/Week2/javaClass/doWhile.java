package Week2.javaClass;

public class doWhile {
   public static void main(String[]args) {
       String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "Avgust", "September", "November", "December"};
       int i = 0;
       do {
           System.out.println(months[i]);
           i++;
       } while (i < months.length);

    }
}

