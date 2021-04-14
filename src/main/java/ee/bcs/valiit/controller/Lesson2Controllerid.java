package ee.bcs.valiit.controller;

import ee.bcs.valiit.tasks.Lesson2;
import ee.bcs.valiit.tasks.Lesson2c;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson2Controllerid {


    //http://localhost:8080/reverseArray/1,2,3,4,10   //TOIMIB
    @GetMapping("reverseArray/{a}")
    public int[] reverseArray(@PathVariable("a") int[] a) {
        return Lesson2.reverseArray(a);
    }

    //http://localhost:8080/reverseArray?b=5
    @GetMapping("evenNumbers")
    public int[] evenNumbers(@RequestParam("b") int b) {
        return Lesson2.evenNumbers(b);
    }

    //http://localhost:8080/min?c=3,5,6,2,1
    @GetMapping("min2")
    public int min(@RequestParam("c") int[] c) {
        return Lesson2.min(c);
    }

    //http://localhost:8080/max/4,2,5,1
    @GetMapping("max/{c}")
    public int max(@PathVariable("c") int[] c) {
        return Lesson2.max(c);
    }

    //http://localhost:8080/sum?a=2,2,4,4
    @GetMapping("sum")
    public int sum(@RequestParam("a") int[] a) {
        return Lesson2.sum(a);
    }

    //http://localhost:8080/sequence3n/10/20
    @GetMapping("sequence3n/{x}/{y}")
    public int sequence3n(@PathVariable("x") int x,
                          @PathVariable("y") int y) {
        return Lesson2c.sequence3n(x, y);
    }

}
