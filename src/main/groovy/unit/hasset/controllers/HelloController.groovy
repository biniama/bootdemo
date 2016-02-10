package unit.hasset.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by biniamasnake on 09/02/16.
 */
@RestController
class HelloController {

    @RequestMapping("/")
    def index() {
        //return [ greeting: "Greetings from Spring Boot!" ]
        return "Greetings from Spring Boot!"
    }
}
