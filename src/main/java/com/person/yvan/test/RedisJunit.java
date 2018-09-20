package com.person.yvan.test;

import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-redis.xml"})
class RedisJunit {

    @Resource(name = "redisTemplate")
    private RedisTemplate redisTemplate;

    JedisPool jedisPool;

    Jedis jedis;

   /* @Before("testGet")
    public void setUp(){
        JedisPoolConfig config = new JedisPoolConfig();
        jedisPool = new JedisPool(config,"localhost");
        jedis = jedisPool.getResource();
    }*/


    @Test
    public void testGet(){
        redisTemplate.opsForValue().set("name","tom");
        System.out.print(redisTemplate.opsForValue().get("name"));
    }
       @Test
       public void testBasicString(){
                     //-----添加数据----------
                     jedis.set("name","minxr");//向key-->name中放入了value-->minxr
                     System.out.println(jedis.get("name"));//执行结果：minxr

                     //-----修改数据-----------
                     //1、在原来基础上修改
                     jedis.append("name","jarorwar");   //很直观，类似map 将jarorwar append到已经有的value之后
                     System.out.println(jedis.get("name"));//执行结果:minxrjarorwar

                     //2、直接覆盖原来的数据
                     jedis.set("name","闵晓荣");
                     System.out.println(jedis.get("name"));//执行结果：闵晓荣

                     //删除key对应的记录
                    jedis.del("name");
                     System.out.println(jedis.get("name"));//执行结果：null

                     /**
                      * mset相当于
                      * jedis.set("name","minxr");
                      * jedis.set("jarorwar","闵晓荣");
                      */
                    jedis.mset("name","minxr","jarorwar","闵晓荣");
                     System.out.println(jedis.mget("name","jarorwar"));

                 }



}
