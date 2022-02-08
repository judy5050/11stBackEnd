import config.Config;
import java.util.Arrays;
import java.util.List;
import logic.BubbleSort;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.StringSortService;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        StringSortService service=new StringSortService(new BubbleSort<>());
        List<String> list = service.doSort(Arrays.asList(args));
        System.out.println("hello world- result"+list );
    }
}
