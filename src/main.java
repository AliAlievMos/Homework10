import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class main {
    String str;
    public static void main(String[] args){

        String str = "Я прожил жизнь, неизвестно зачем видел вещи, от которых отвернулся бы, в слезах или гневе, сам Господь Бог; я теперь такой же Иван Петров, как какой угодно Иван Петров; я хочу молчать, сидеть на крыльце, зажигать папиросу и рифмовать слова „лес“ и „лось“";
        ArrayList list = new ArrayList<>();


        IntStream intStream = IntStream.range(-5001,5001);
        intStream.filter(w -> w % 2 == 0).filter(w -> w > 0).forEach(list ::add);
        System.out.println(list);



        System.out.println(split(str));



    }
    public static List split (String str) {
        return Stream.of(str.split(" "))
                .map (elem -> new String(elem))
                .collect(Collectors.toList());
    }


}
