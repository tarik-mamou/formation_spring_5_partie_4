import generation.tables.pojos.Livre;
import jdbc.ConfigurationApplication;
import jdbc.LibrairieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfigurationApplication.class})
@ActiveProfiles(profiles = "test")
@EnableTransactionManagement
public class LibrairieServiceTest {
    @Autowired
    public DataSource datasource;

    @Autowired
    LibrairieService librairieService;



    @Autowired
    Environment env;

    @Test
    public  void findLivres(){
        List<Livre> livres=librairieService.findLivre3();
        System.out.println(livres);


    }
}
