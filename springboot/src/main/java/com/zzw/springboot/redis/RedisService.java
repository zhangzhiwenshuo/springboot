package com.zzw.springboot.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zzw.springboot.user.User;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Component
public class RedisService {
    @Resource
    private StringRedisTemplate stringRedisTemplate;


//    @Autowired
//    private Redisson redisson;

    //string 类型
    /*

	新建一个 RedisService，注入 StringRedisTemplate，使用 		stringRedisTemplate.opsForValue()
可以获取 ValueOperations<String, String> 对象，通过该对象即可读写 redis 数据库了。
*/
    public void setRediskv(String key,String value){
        ValueOperations<String, String> forValue = stringRedisTemplate.opsForValue();
        forValue.set(key,value);


    }
    public String getRediskv(String key){
        String s = stringRedisTemplate.opsForValue().get(key);
        return s;
    }


    //String类型存储对象，存储前要把对象转化为json数据类型
    public void setRedisObj(User user){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        stringStringValueOperations.set("user", JSON.toJSONString(user));

    }
    public User getRedisObj(){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        String user = stringStringValueOperations.get("user");
        User user1 = JSONObject.parseObject(user, User.class);
        return user1;
    }

    //list类型
/*

使用 stringRedisTemplate.opsForList() 可以获取 ListOperations<String, String> listOperations redis 列表对象，该列表是个简单的字符串列表，可以支持从左侧添加，也可以支持
从右侧添加，一个列表最多包含 2 ^ 32 -1 个元素。

*/
    public void setRedisList(){
        ListOperations<String, String> stringStringListOperations = stringRedisTemplate.opsForList();
        stringStringListOperations.leftPush("list","ljz1");
        stringStringListOperations.leftPush("list","ljz2");
        stringStringListOperations.leftPush("list","ljz3");
        stringStringListOperations.leftPush("list","ljz4");
    }
    public String getRedisList(){
        ListOperations<String, String> stringStringListOperations = stringRedisTemplate.opsForList();
        String list = stringStringListOperations.leftPop("list");
        return list;
    }


    //hash类型
    /*
hash 类型其实原理和 string 一样的，但是有两个 key，使用 stringRedisTemplate.opsForHash()
可以获取 HashOperations<String, Object, Object> 对象。比如我们要存储订单信息，所有订单
信息都放在 order 下，针对不同用户的订单实体，可以通过用户的 id 来区分，这就相当于两个 key
了。
*/
    public void setRedisHash(){
        HashOperations<String, Object, Object> stringObjectObjectHashOperations = stringRedisTemplate.opsForHash();
        stringObjectObjectHashOperations.put("hash0","name0","ljz0");
        stringObjectObjectHashOperations.put("hash1","name1","ljz1");
        stringObjectObjectHashOperations.put("hash2","name2","ljz2");


    }
    public Object getRedisHash(){
        HashOperations<String, Object, Object> stringObjectObjectHashOperations = stringRedisTemplate.opsForHash();
        Object o = stringObjectObjectHashOperations.get("hash0", "name0");
        return o;
    }
//    public String deductStock(){
//        String lockKey = "product_01";
//        String clientId = UUID.randomUUID().toString();
//        RLock redissonLock = redisson.getLock(lockKey);
//        try {
//          /*  Boolean result = stringRedisTemplate.opsForValue().setIfAbsent(lockKey,clientId,100, TimeUnit.SECONDS);
//            if(!result){
//                return "error_code";
//            }*/
//            redissonLock.lock();
//            Integer stock = Integer.parseInt(stringRedisTemplate.opsForValue().get("stock"));
//            if(stock>0){
//                int realStock = stock -1;
//                stringRedisTemplate.opsForValue().set("stock",realStock+"");
//                System.out.println("扣减成功,剩余库存："+realStock);
//            }else{
//                System.out.println("扣减失败,库存不足");
//            }
//        } finally {
//            redissonLock.unlock();
//             /* if(clientId.equals(stringRedisTemplate.opsForValue().get(lockKey))){
//                  stringRedisTemplate.delete(lockKey);
//              }*/
//        }
//        return "end";
//    }
}

