import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by Administrator on 2019/9/20.
 */
public class RedisPush {

    public  static Jedis init(){
        Jedis jedis =  getjedis("192.168.88.101",6379);
        jedis.auth("12345678");
        return jedis;
    }
    public static Jedis getjedis(String host, int port){
        return new Jedis(host,port);
    }

    //
    public static void push(){
        Jedis jedis = init();
        jedis.rpush("order","001","002","003");
     }
    public static void main(String [] args){
        Jedis jedis = init();
        //栈 先进后去
       List<String> orderList = jedis.blpop("order");

       //队列 先进先去
        List<String> orderList1 = jedis.brpop("order");
    }

}
