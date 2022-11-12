package User;

public class User {
    private Integer id;
    private String colour;
    private String brank;

    public User() {
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

    public User(Integer id, String colour, String brank) {
        this.id = id;
        this.colour = colour;
        this.brank = brank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", colour='" + colour + '\'' +
                ", brank='" + brank + '\'' +
                '}';
    }
}
