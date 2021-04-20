package com.zzw.springboot.sys.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzw.springboot.sys.entity.TUser;
import com.zzw.springboot.sys.mapper.TUserMapper;
import com.zzw.springboot.sys.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangzw
 * @since 2021-04-15
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {


    @Override
    public IPage<TUser> findAllByPage(int pageNum, int offset) {
        Page<TUser> page = new Page<>(pageNum,offset);
        return baseMapper.findAllByPage(page);
    }
}
