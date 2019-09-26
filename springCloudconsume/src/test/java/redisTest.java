import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/19.
 */
public class redisTest {
    public static Jedis getjedis(String host, int port){
        return new Jedis(host,port);
    }

    //生成订单
    public static void createOrder(){
        Jedis jedis =  init();
        for(int i =0;i<=3;i++){
            Map<String,String> orderMap = new HashMap<String,String>();
            orderMap.put("orderId","order"+i);
            orderMap.put("money","20");
            orderMap.put("createTime","2019-9-9");
            jedis.hmset("orderinfo"+i,orderMap);
            jedis.rpush("order","order"+i);
        }
     }


    public  static Jedis init(){
        Jedis jedis =  getjedis("192.168.88.101",6379);
        jedis.auth("12345678");
        return jedis;
    }

    //查询订单信息
    public  static void queryOrderInfo(){
        Jedis jedis =  init();
        List<String> orderList =  jedis.lrange("order",0,-1);
        for(String orderId:orderList){
            System.out.println(orderId);
           Map<String,String> orederInfoMap = jedis.hgetAll(orderId);
           System.out.println(orederInfoMap.toString());

        }
    }

    public static void main(String [] args){
        createOrder();
    }
}
