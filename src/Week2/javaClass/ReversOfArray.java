package Week2.javaClass;

//public class ReversOfArray {
//    public static void main(String[] args) {
//        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "Avgust", "September", "November", "December"};
//        for (int i = months.length - 1; i >= 0; i--) {
//            System.out.println(months[i]);
//        }
//    }
//}

public class ReversOfArray {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "Avgust", "September", "November", "December"};
        for (int i = 0; i < months.length; i+=2) {
            System.out.println(months[i]);
           // System.out.println(months[4]);
        }
    }
}