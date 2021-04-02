import com.neuedu.dao.GoodsDAO;
import com.neuedu.pojo.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config.xml")
public class GoodsTest {
    /*public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Goods goods=(Goods) context.getBean("goods");
        goods.setName("羽绒服");
        System.out.println(goods.getName());
    }*/
/*自动匹配，根据类型匹配，如果类型匹配不成功，根据名字进行匹配*/
    @Autowired
    private  Goods goods;

    @Autowired
    private GoodsDAO goodsDAO;

    @Test
    public void getgoods(){
        goods.setName("羽绒服");
        System.out.println(goods.getName());
    }

    @Test
    public void aoptest(){
        goodsDAO.add();
    }

}
