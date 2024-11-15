import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SamplePractice {
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("Mango");
        stringList.add("Apple");
        stringList.add("Guava");
        stringList.add("Pinapple");
        stringList.add("Strawberry");
        stringList.add("");
        stringList.add("");
        long count = stringList.stream().filter(str->str.length()>5).count();
        System.out.println(count);
        long count1 = stringList.stream().filter(str->str.isEmpty()).count();
        System.out.println(count1);
        List<String> emptyStringList= stringList.stream().filter(str->str.isEmpty()).collect(Collectors.toList());
        System.out.println(emptyStringList.size());
    }
}
