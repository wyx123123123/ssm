package controller;

import domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ICarservice;

import java.util.List;

@Controller
@RequestMapping("/F")
public class Carcontroller {
    @Autowired
    private ICarservice carservice;
    @RequestMapping("/f")
    public String findall(Model model){
        List<Car> findall = carservice.findall();
        model.addAttribute("all",findall);
        return "car";
    }
    @RequestMapping("/ff")
    public List<Car> findal(){
        List<Car> findall = carservice.findall(new Car(2, null, null));
        return findall;
    }
    @RequestMapping("/gosave")
    public String save(Car car,Model model){
            if(car.getId()!=null){
                 carservice.update(car);
            }else {
                carservice.add(car);
            }
        return "forward:/F/f";
    }
    @RequestMapping("/one")
    public String  findone(Integer id,Model model){
        Car car=carservice.findone(id);
        model.addAttribute("pp",car);
        return "forward:/save.jsp";
    }
    @RequestMapping("/d")
    public String delete(Integer id){
        carservice.delete(id);
        return "forward:/F/f";
    }


}
