package com.softlond.ecomerce.projectopos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//se utiliza para excluir la autoconfiguración automática de la fuente de datos (DataSource) en el contexto de Spring Boot. Esto significa que si tienes dependencias de bases de datos en tu proyecto (como spring-boot-starter-data-jpa).
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ProjectoposApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectoposApplication.class, args);
    }


}
