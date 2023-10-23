import com.list.AL;

public class Main {
    public static void main(String[] args) {

        AL al = new AL();

        al.addNumber(2);
        al.addNumbers();
        al.addNumberInPosition(2,1);
        al.sizeOf();
        al.returnThis(1);
        System.out.println(al.exitsThis(2));
        al.firstIndexOfThis(2);
        al.lastIndexOfThis(2);
        al.iterator();
        al.sort();
        al.iterator();
    }
}
