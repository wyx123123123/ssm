import com.fasterxml.jackson.annotation.JsonFormat;
import domain.Car;
import javassist.ClassPath;
import mapper.Carmapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.Carservice;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationcontext.xml")
public class Test1 {
    @Autowired
    private Date date;//测试spring
    @Autowired
    private DataSource dataSource;//测试连接池对象
    @Autowired
    private SqlSessionFactory factory;
    @Autowired
    private Carmapper carmapper;
    @Autowired
    private Carservice carservice;
      @Test
      public void mian1() throws SQLException {
//         System.out.println(date);
//         System.out.println(dataSource.getConnection());
//          List<Car> findall = carmapper.findall();
//          findall.forEach(System.out::println);
//          List<Car> findall = carservice.findall();
//          findall.forEach(System.out::println);
          List<Car> findall = carmapper.findall(new Car(null, "lanse", null));
          findall.forEach(System.out::println);
      }
}

