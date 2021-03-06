package com.zzw.springboot.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zzw.springboot.sys.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangzw
 * @since 2021-04-15
 */
public interface ITUserService extends IService<TUser> {
    IPage<TUser> findAllByPage(int pageNum, int offset);
}
