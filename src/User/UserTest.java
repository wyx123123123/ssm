package User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext.xml")
public class UserTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void main1() throws SQLException {
        Connection conn = dataSource.getConnection();
        PreparedStatement pre = conn.prepareStatement("select * from car");
        ResultSet resultSet = pre.executeQuery();
        ArrayList<Object> objects = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String colour = resultSet.getString("colour");
            String brank = resultSet.getString("brank");
            User user = new User(id, colour, brank);
            objects.add(user);
        }
      objects.forEach(System.out::println);
    }
}