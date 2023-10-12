import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(12);
        list.add("Krash");
        list.add(12.5);
        list.add("Alish");
        list.add(2007);
        meth(list);
    }
    public static <T> void meth(List <T> value){
        for (Object val: value) {
            if (val == value.get(0))
            System.out.println(val);
            if (val == value.get(value.size()-1)){
                System.out.println(val);
            }
        }
    }
}