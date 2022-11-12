package mapper;

import domain.Car;

import java.util.List;

public interface Carmapper {
    List<Car> findall();
    List<Car>findall(Car car);
    void add(Car car);

    Car findone(Integer id);

    void update(Car car);

    void delete(Integer id);
}
