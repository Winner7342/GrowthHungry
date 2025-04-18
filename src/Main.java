//public class Main {
//    public static void main(String[] args) {
//        int number = 10;
//        double pi = 3.14;
//        char a = 'a';
//        boolean b = true;
//        String s = "hello";
//        String n = s + " world";
//        System.out.println(n);
//    }
//}
//        public class Main {
//            public static void main(String[] args) {
//        int a = 20;
//        int b = 10;
//       // int c = a + b;
//        int d = a / b;
// +,-,/,%,==,!=
//        System.out.println(d);
//    }
//}


//
//public class Main {
//          public static void main(String[] args) {
//int a = 25;
//int b = 5;
//int c = a % b;
//int d = a / b;
// / => 16 / 5 = 3 (1/5)
//          //    % => 16/5 = 3 ([1]/5)
//              // +,-,/,%,==,!=
//
//              System.out.println(c);
//              System.out.println(d);
//          }
//          }

//public class Main {
//    public static void main(String[] args) {
//        double a = 10, b = 5;
//        double e = 11, d = 5;
//        double c = e / d;
//        System.out.println(c);
//    }
//}

//
//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//    System.out.println("Hello " + name);
//    }
//}

//import java.util.Scaner;
//public class Main {
//    public static void main (String[]args){
//        Scanner Eziz = new Scanner(System.in);
//        String name = Eziz.next
//    }
//
//}

//

//import  java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String s = sc.next();
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//        System.out.println(s);
//        System.out.println(a + b);
//    }
//    }


//
//import  java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    String s = sc.next();
//    int a = 1, b = 2;
//        System.out.println(s);
//    }
//    }


//import  java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        boolean execute = true;
//    if (execute){
//        System.out.println("Hello");
//    }
//    }
//    }
//
 //If else conditions

//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//int a = 1, b =1;
//        if (a == b){
//            System.out.println("equal");
//        }else{
//            System.out.println(" not equal");
//        }
//    }
//}

//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt();
//        if (a == b){
//            System.out.println("equal");
//        }else{
//            System.out.println(" not equal");
//        }
//    }
//}

//Continue working with if else conditions in a different ways
//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        //  <,>, <=, >=
//        if (n < 5) {
//            System.out.println("the value is less");
//        } else {
//            if (n > 5) {
//                System.out.println("the value is bigger");
//            } else {
//                if(n == 5){
//                    System.out.println("The value is equal");
//                }
//            }
//        }
//    }
//}

//Else if

//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        //a -> A
//        //b -> B
//        //c -> C
//        //invalid character
//        String s = sc.next();
//        if (s.equals("a")) {
//            System.out.println("A");
//        } else {
//            if (s.equals("b")) {
//                System.out.println("B");
//            } else {
//                if (s.equals("c")) {
//                    System.out.println("C");
//                } else {
//                    System.out.println("Invalid character");
//
//                }
//            }
//        }
//    }
//}


//Switch method
//import  java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int dayNumber = sc.nextInt();
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wensday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Love this day");
//                break;
//            case 6:
//                System.out.println("Clean cook and chill");
//                break;
//            case 7:
//                System.out.println("Enjoy your day");
//                break;
//            default:
//                System.out.println("Invalid day number");
//        }
//
//    }
//}

//Session #2 Arrays and Loops

//public class Main {
//    public static void main(String[] args){
//        int[] array = new int[5];
//        array[0] = 10;
//        System.out.println(array[0]);
//    }
//
//}

//
//public class Main {
//    public static void main(String[] args){
//double[] array = new double[100];
//array[0] = 10;
//array[1] = 20;
//array[2] = 30;
//
//System.out.println(array[0]);
//        System.out.println(array[1]);
//
//    }
//
//}


//Increament opertaors

//
//public class Main {
//    public static void main(String[]args){
//int i = 10;
//i++;
//   i--;     //i = i + 1; same thing as i++
//        System.out.println(i);
//    }
//}

//Loops: For,While,Do-While;

//
//public class Main {
//    public static void main(String[]args){
//String[] months = new String[]{
//"January",
//        "February",
//        "March",
//        "April",
//        "June",
//        "July",
//        "August",
//        "Seprember",
//        "November",
//        "December"
//};
//for (int i = 0; i < months.length; i++){
//System.out.println(months[i]);
//}
   // }
   // }

//Wihle and do while;

//public class Main {
//    public static void main(String[] args) {
//      int i = 0;
//      do {
//      System.out.println(i);
//      i++;
//      } while i < 5 ;
//    }


