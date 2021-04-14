package ee.bcs.valiit.controller;

import ee.bcs.valiit.tasks.Lesson3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson3Controllerid {

//    http://localhost:8080/factorial/10
    @GetMapping("factorial/{a}")
    public int factorial(@PathVariable("a") int a){
        return Lesson3.factorial(a);
    }
//    http://localhost:8080/reverseString?a=kadri
    @GetMapping ("reverseString")
    public String reverseString(@RequestParam("a") String a){
        return Lesson3.reverseString(a);
    }

//    http://localhost:8080/isPrime?a=37
    @GetMapping("isPrime")
    public boolean isPrime(@RequestParam("a") int a){
        return Lesson3.isPrime(a);
    }

//    http://localhost:8080/sort/4,5,6,7,2,3,9,1
    @GetMapping("sort/{a}")
    public int [] sort(@PathVariable("a")int [] a){
        return Lesson3.sort(a);
    }
}
