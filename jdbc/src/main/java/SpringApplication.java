import generation.tables.pojos.Livre;
import jdbc.ConfigurationApplication;
import jdbc.LibrairieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class SpringApplication {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationApplication.class);
       // LibrairieService librairieService=context.getBean(LibrairieService.class);
       // System.out.println(librairieService.findLivre());
       //System.out.println(librairieService.findLivre2());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigurationApplication.class);
        context.getEnvironment().setActiveProfiles("production");
        //ctx.getEnvironment().setActiveProfiles("developpement");
        context.refresh();
        LibrairieService librairieService=context.getBean(LibrairieService.class);
        List<Livre> livres = librairieService.findLivre3();
        System.out.println(livres.toString());


    }
}