package cn.com.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ��Ԫ���ԵĻ�����
 * ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "classpath:spring/spring-dao.xml","classpath:spring/spring-mvc.xml"})
@ContextConfiguration({ "classpath:spring/spring-*.xml"})
public class BaseTest {

}
