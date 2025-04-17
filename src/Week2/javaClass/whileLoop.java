package Week2.javaClass;
public class whileLoop {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "Avgust", "September", "November", "December"};
//        for (int i = months.length - 1; i >= 0; i--) {
//            System.out.println(months[i]);

int i = 0;
while ( i < months.length) {
    System.out.println(months[i]);
i++;
}
    }
}
