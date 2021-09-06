package jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class ConfigurationApplication {


    @Autowired
    Environment env;

    @Bean
    @Profile("production")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    @Bean(destroyMethod = "shutdown")
    @Profile("test")
    public DataSource testDataSource() {

        return new EmbeddedDatabaseBuilder().
                setType(EmbeddedDatabaseType.H2).
                addScript("schema.sql").
                addScript("data.sql").
                build();
        /*
        https://stackoverflow.com/questions/2012292/spring-configuration-for-embedded-h2-database-for-tests
        <!-- provides a H2 console to look into the db if necessary -->
<bean id="org.h2.tools.Server-WebServer" class="org.h2.tools.Server"
    factory-method="createWebServer" depends-on="database.dataSource"
    init-method="start" lazy-init="false">
    <constructor-arg value="-web,-webPort,11111" />
</bean>
         */
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }

    @Bean
    public LibrairieService librairieService() {
        return new LibrairieService();
    }


}