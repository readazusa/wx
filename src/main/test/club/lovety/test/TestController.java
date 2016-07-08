package club.lovety.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 念梓  on 2016/7/7.
 * Email:sunmch@163.com
 * TEL:13913534135
 * author: 念梓
 * des:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/mysql/applicationContext_database.xml","classpath:spring/applicationContext_mvc.xml","classpath:spring/applicationContext_base.xml","classpath:spring/redis/applicationContext_redis.xml"})
public class TestController {

        @Before
        public void testBefore(){
            System.out.println("1232");
        }


}
