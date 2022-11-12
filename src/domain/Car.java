package domain;

public class Car {
    private Integer id;
    private String colour;
    private String brank;

    public Car() {
    }

    public Car(Integer id, String colour, String brank) {
        this.id = id;
        this.colour = colour;
        this.brank = brank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrank() {
        return brank;
    }

    public void setBrank(String brank) {
        this.brank = brank;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", colour='" + colour + '\'' +
                ", brank='" + brank + '\'' +
                '}';
    }
}
