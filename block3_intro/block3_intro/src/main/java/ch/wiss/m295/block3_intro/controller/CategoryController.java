package ch.wiss.m295.block3_intro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.wiss.m295.block3_intro.Repository.CategoryRepository;
import ch.wiss.m295.block3_intro.model.Student;

@RestController
@RequestMapping("/category")
public class CategoryController {
  @Autowired /* Dependency Incection, Objekt wird automatisch von SpringBoot eingebunden */
  private CategoryRepository studentRepository;
  @GetMapping("/{id}")
  public ResponseEntity<Student> getStudent(@PathVariable long id) {
    // studentRepository holt passenden Student aus DB; SpringBoot transformiert Objekt in JSON */
    return ResponseEntity.ok().body(studentRepository.findById(id).get());
  }
  @GetMapping("/")
  public ResponseEntity<Iterable<Student>> getStudents() {
    // studentRepository holt alle Student aus DB; SpringBoot transformiert Objekte in JSON-Array */
    return ResponseEntity.ok().body(studentRepository.findAll());
  }
  @PostMapping("/")  /* RequestBody muss JSON-Objekt mit Student-Attributen enthalten */
  public ResponseEntity<Student> createStudent(@RequestBody Student student) {
    System.out.println("Creating student: " + student);
    return ResponseEntity.ok().body(studentRepository.save(student));
  }  
}