package com.zzw.springboot.restservice;




import com.zzw.springboot.redis.RedisService;
import com.zzw.springboot.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author linjiazeng
 * @version 1.0
 * @date 2020/12/23 10:52
 **/
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    //测试String类型
    @GetMapping("setRedis/{key}/{name}")
    public String setReids(@PathVariable String key,@PathVariable String name ){
        redisService.setRediskv(key,name);
        return "success";
    }

    @GetMapping("getRedis/{key}")
    public String getReids(@PathVariable String key){
        String redis = redisService.getRediskv(key);
        return redis;
    }

    //测试对象类型
    @GetMapping("setRedisObj")
    public String setRedisObj(){
        User user = new User();
        user.setName("ljz");
        user.setAge(18);
        user.setSex("男");
        redisService.setRedisObj(user);
        return "success";
    }

    @GetMapping("getRedisObj")
    public User getRedisObj(){
        return redisService.getRedisObj();
    }

    //测试list类型
    @GetMapping("setRedisList")
    public String setRedisList(){
        redisService.setRedisList();
        return "success";
    }

    @GetMapping("getRedisList")
    public String getRedisList(){
        return redisService.getRedisList();
    }

    //测试hash
    @GetMapping("getRedisHash")
    public Object getRedisHash(){
        return redisService.getRedisHash();
    }

    @GetMapping("setRedisHash")
    public String setRedisHash(){
        redisService.setRedisHash();
        return  "success";
    }

//    @GetMapping("deductStock")
//    public String deductStock(){
//        return redisService.deductStock();
//    }
}

