package ee.bcs.valiit.controller;

import ee.bcs.valiit.tasks.Lesson2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("hello-world/{nameInUrl}")
    public String helloWorld(@PathVariable("nameInUrl") String name, @RequestParam("action") String a, @RequestParam("action2") String b) {
        return a + " " + b + " " + name;
    }

    //http://localhost:8080/fibonacci/5
    @GetMapping ("fibonacci/{n}")
    public int fibonacci(@PathVariable("n") int n) {

        return Lesson2.fibonacci(n);
    }
    //http://localhost:8080/fibonacci2?n=3
    @GetMapping ("fibonacci2")
    public int fibonacci2(@RequestParam("n") int n) {

        return Lesson2.fibonacci(n);
    }


}


