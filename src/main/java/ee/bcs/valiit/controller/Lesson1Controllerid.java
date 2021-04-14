package ee.bcs.valiit.controller;

import ee.bcs.valiit.tasks.Lesson1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson1Controllerid {

    //http://localhost:8080/min?a=3&b=5 //?
    @GetMapping("min")
    public int min(@RequestParam("a") int a,
                   @RequestParam("b") int b) {
        return Lesson1.min(a, b);
    }

    //http://localhost:8080/max/5/2
    @GetMapping("max/{x}/{y}")
    public int max(@PathVariable("x") int x, @PathVariable("y") int y) {
        return Lesson1.max(x, y);
    }

    ////http://localhost:8080/abs?a=-5
    @GetMapping("abs")
    public int abs(@RequestParam("a") int a) {
        return Lesson1.abs(a);
    }

    //http://localhost:8080/isEven/8
    @GetMapping("isEven/{a}")
    public boolean isEven(@PathVariable("a") int a) {
        return Lesson1.isEven(a);
    }

    //http://localhost:8080/min3?a=3&b=5&c=1
    @GetMapping("min3")
    public int min3(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c) {
        return Lesson1.min3(a, b, c);
    }

    //http://localhost:8080/max3/3/7/2
    @GetMapping("max3/{a}/{b}/{c}")
    public int max3(@PathVariable("a") int a,
                    @PathVariable("b") int b,
                    @PathVariable("c") int c) {
        return Lesson1.max3(a, b, c);
    }
}
