package service;

import domain.Car;

import java.util.List;

public interface ICarservice {
    List<Car> findall();
    List<Car> findall(Car car);
    void add(Car car);

    Car findone(Integer id);

    void update(Car car);

    void delete(Integer id);
}
