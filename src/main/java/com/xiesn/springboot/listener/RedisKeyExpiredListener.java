package com.xiesn.springboot.listener;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import net.dreamlu.mica.core.utils.StringPool;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.core.RedisKeyExpiredEvent;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RedisKeyExpiredListener {

    /**
     * redis key 超时事件（监听）
     * @param event
     */
    @Async
    @EventListener(RedisKeyExpiredEvent.class)
    public void redisKeyExpiredEvent(RedisKeyExpiredEvent<Object> event) {
        String redisKey = new String(event.getId());
        String keyspace = event.getKeyspace();
        String cacheKey = StrUtil.join(StringPool.COLON,keyspace, redisKey);
        log.info(cacheKey);

    }
}
