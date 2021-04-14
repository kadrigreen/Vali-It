package ee.bcs.valiit.controller;

import ee.bcs.valiit.tasks.Lesson2b;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson2bControllerid {

    //    http://localhost:8080/sampleArray
    @GetMapping("sampleArray")
    public int[] sampleArray() {
        return Lesson2b.sampleArray();
    }

    //    http://localhost:8080/generateArray/5
    @GetMapping("generateArray/{a}")
    public int[] generateArray(@PathVariable("a") int a) {
        return Lesson2b.generateArray(a);
    }

    //    http://localhost:8080/decreasingArray?a=7
    @GetMapping("decreasingArray")
    public int[] decreasingArray(@RequestParam("a") int a) {
        return Lesson2b.decreasingArray(a);
    }

    //    http://localhost:8080/yl3/10
    @GetMapping("yl3/{a}")
    public int[] yl3(@PathVariable("a") int a) {
        return Lesson2b.yl3(a);
    }
}
