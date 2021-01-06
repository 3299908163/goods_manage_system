package cn.wares.commodity.controller;

import cn.wares.commodity.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.Controller;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Classname TokenManager
 * @Description TODO
 * @Date 2020/12/30 15:46
 * @Created by 32999
 */
@Component
public class TokenManager {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    /**
     * 生成一个令牌
     * @param userId
     * @return
     */
    public String createToken(int userId){
        //生成token
        UUID uuid = UUID.randomUUID();
        String token = userId+"_"+uuid.toString().replaceAll("-", "");
        //将token存入Redis
        String key = userId+"_token";
        redisTemplate.opsForValue().set(key,token, Constants.TOKEN_EXPIRE_HOUR, TimeUnit.HOURS);
        return token;
    }

    /**
     * 检查token是否正确
     * @param token 令牌
     * @return  true正确，false错误
     */
    public boolean checkToken(String token){
//        解析出uuid和userId
//        如果token为空，返回失败
        if(token==null || "".equals(token)){
            return false;
        }
        String[] arr1 = token.split("_");
//        如果返回的token_前的长度不为2，返回失败
        if(arr1.length !=2){
            return false;
        }
//        根据redis进行检查
        String key = arr1[0]+"_token";
        String r_token = (String)redisTemplate.opsForValue().get(key);
//        如果r_token为空，返回失败
        if(r_token==null){
            return false;
        }
//        如果token和r_token相同，返回失败
        if(!token.equals(r_token)){
            return false;
        }
//        返回检测结果，更新token时间
        redisTemplate.opsForValue().set(key,token,Constants.TOKEN_EXPIRE_HOUR,TimeUnit.HOURS);
        return true;
    }

    public boolean clearToken(String token){
        if(token==null || "".equals(token)){
            return false;
        }
        String[] arr1 = token.split("_");
        if(arr1.length != 2){
            return false;
        }
        //根据redis进行检查
        String key = arr1[0]+"_token";
        String r_token = (String)redisTemplate.opsForValue().get(key);
        if(r_token==null){
            return false;
        }
//        注销token
        redisTemplate.delete(key);
        return true;
    }

    public static void main(String[] args){
        TokenManager tokenManager = new TokenManager();
        System.out.println(tokenManager.createToken(1));
    }

}
