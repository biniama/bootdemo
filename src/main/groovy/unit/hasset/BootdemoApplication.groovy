package unit.hasset

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class BootdemoApplication {

	static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(BootdemoApplication, args)

        println("Let's inspect the beans provided by Spring Boot:")

        String[] beanNames = ctx.getBeanDefinitionNames()

        beanNames.sort().each {
            println it
        }
	}
}
