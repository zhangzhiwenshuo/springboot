package com.zzw.springboot.sys.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzw.springboot.sys.entity.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangzw
 * @since 2021-04-15
 */
@Mapper
public interface TUserMapper extends BaseMapper<TUser> {

    IPage<TUser> findAllByPage(Page<TUser> page);

}
