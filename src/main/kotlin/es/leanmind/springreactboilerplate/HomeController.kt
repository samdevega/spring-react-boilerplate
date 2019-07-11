package es.leanmind.springreactboilerplate

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {
    @GetMapping("/home")
    fun index(): String {
        return "Home"
    }
}