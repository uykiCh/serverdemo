package serverdemo.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UserController {

    @Autowired(required = false)
    val helloWorldString : String = "Hello, World"

    @RequestMapping(path = ["/hello"], method = [RequestMethod.GET])
    @ResponseBody
    fun helloFun() : String = helloWorldString

}