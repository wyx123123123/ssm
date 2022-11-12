package service;

import domain.Car;
import mapper.Carmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Carservice implements ICarservice{
    //查询所有
    @Autowired private Carmapper carmapper;
    @Override
    public List<Car> findall() {
            return   carmapper.findall();
    }
//条件查询
    @Override
    public List<Car> findall(Car car) {
        return carmapper.findall(car);
    }

    @Override
    public void add(Car car) {
        carmapper.add(car);
    }

    @Override
    public Car findone(Integer id) {
      Car car=carmapper.findone(id);
      return car;
    }

    @Override
    public void update(Car car) {
        carmapper.update(car);
    }

    @Override
    public void delete(Integer id) {
        carmapper.delete(id);
    }

}
