public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str)->{
            String[] st = str.split(" ");
            return st.length;
        };
        System.out.println(wc.count("Anil is a good boy"));
    }
}
