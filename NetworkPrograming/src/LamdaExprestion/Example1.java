package LamdaExprestion;

public class Example1 {

    public static void main(String[] args) {

        StringFunction c = (dd) -> dd + "!";
        StringFunction a = (s) -> s + "?";
        PrintFormat("Hello", c);
        PrintFormat("Hello", a);
 
    
    
//    ArrayList<Integer> numbers = new ArrayList<Integer>();
//    numbers.add(5);
//    numbers.add(9);
//    numbers.add(8);
//    numbers.add(1);
//    Consumer<Integer> method = (n) -> { System.out.println(n); };
//    numbers.forEach( method );
    
    }

    public static void PrintFormat(String str, StringFunction Format) {

        String s = Format.run(str);
        System.out.println(s);
    } 
    
    


}
