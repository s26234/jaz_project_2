package pl.pjwstk.micjac;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {


        @GetMapping("/{diffPathVariable}")
        public ResponseEntity<String> diffPathVariable (@PathVariable String diffPathVariable) {
            return ResponseEntity.ok(diffPathVariable);
        }

        @GetMapping
        public ResponseEntity<String> diffRequestParam (@RequestParam String diffRequestParam) {
            return ResponseEntity.ok(diffRequestParam);
        }

        @PutMapping("/diffPathVariable/{pathVarForPut}")
        public ResponseEntity<String> pathVariableForPut(@PathVariable String pathVarForPut) {
            return ResponseEntity.ok(pathVarForPut);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Car> updateCar (@PathVariable int id,  @RequestBody Car updateCar) {
            System.out.println(id);
            System.out.println(updateCar.getModel());
            updateCar.setId(id);
            return ResponseEntity.ok(updateCar);
        }

        @PostMapping(value ="/create",consumes = {MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE,
                        MediaType.APPLICATION_XML_VALUE})
        public ResponseEntity<Car> createCar (@RequestBody Car car) {
            return ResponseEntity.ok(car);
        }
        @DeleteMapping("/{id}")
        public ResponseEntity<String> pathVariableDelete (@PathVariable int id, String pathVarDel) {
            return ResponseEntity.ok(pathVarDel);
        }


}
