package groupexamplespring.springgroupexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/")
    public String showStudent(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
    // add student

    @RequestMapping("/add")
    public String addStudent(Model model){
    model.addAttribute("student", new Student());

        return "studentform";
    }
    //save Student
    @PostMapping("/save")
    public String saveStudent(Student student){
        studentRepository.save(student);
        return "redirect:/";
    }
    // list student
  ///  @RequestMapping("/Studentdetails")
// public String showStudent(Student student){
//        for (StudentRepository studentrepo : studentRepository){
//
//        }
//        return "StudentDetails";
// }

}
