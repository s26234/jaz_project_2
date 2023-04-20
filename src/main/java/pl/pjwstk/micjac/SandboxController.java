package pl.pjwstk.micjac;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class SandboxController {
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world");
    }
    // exercise 2
    @GetMapping("/model")
    public ResponseEntity<Car> model() {
        return ResponseEntity.ok(new Car("Mazda"));
    }
    // exercise 3
    @GetMapping("/{somePathVariable}")
    public ResponseEntity<String> pathVariableExample (@PathVariable String somePathVariable) {
        return ResponseEntity.ok(somePathVariable);
    }
    // exercise 3 - sposób 2
    //    @GetMapping("/{id}")
    //    public ResponseEntity<String> pathVariableExample (@PathVariable (name = "id")String somePathVariable) {
    //        return ResponseEntity.ok(somePathVariable);
    //    }

    // exercise 4
    @GetMapping
    public ResponseEntity<String> requestParamVariable (@RequestParam String someRequestParam) {
        return ResponseEntity.ok(someRequestParam);
    }

    // exercise 5
    @PostMapping
    public ResponseEntity<Car> postCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }



}
