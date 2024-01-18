import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWord = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWord2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        // Проверка: ссылаются ли переменные на один и тот же объект
        System.out.println(beanHelloWord.equals(beanHelloWord2));
        System.out.println(beanCat.equals(beanCat2));
    }
}