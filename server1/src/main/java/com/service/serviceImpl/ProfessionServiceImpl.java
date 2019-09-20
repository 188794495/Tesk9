package com.service.serviceImpl;

import com.mapper.ProfessMapper;

import com.pojo.Profess;
import com.service.ProfessionService;

import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service("ProfessionService")
public class ProfessionServiceImpl implements ProfessionService {

//    Logger logger=Logger.getLogger(ProfessionServiceImpl.class);

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(String.valueOf(ProfessionServiceImpl.class));
    @Resource
    ProfessMapper professMapper;


    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return professMapper.deleteByPrimaryKey(id);
    }


    /**
     * 插入
     *
     * @param record
     * @return
     */
    @Override
    public int insert(Profess record) {
        return professMapper.insert(record);
    }

    /**
     * 动态插入
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(Profess record) {
        return professMapper.insertSelective(record);
    }

    /**
     * 动态更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(Profess record) {
        return professMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据ID更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(Profess record) {
        return professMapper.updateByPrimaryKey(record);
    }


    /**
     * 查询全表
     *
     * @return
     */
    @Override
    public List<Profess> list() {

        return null;
    }
}
