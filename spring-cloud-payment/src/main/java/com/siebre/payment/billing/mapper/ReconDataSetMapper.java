package com.siebre.payment.billing.mapper;

import com.siebre.payment.billing.entity.ReconDataSet;
import org.springframework.stereotype.Repository;

@Repository
public interface ReconDataSetMapper {
    int deleteAll();

    int deleteByPrimaryKey(Long id);

    int insert(ReconDataSet record);

    int insertSelective(ReconDataSet record);

    ReconDataSet selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReconDataSet record);

    int updateByPrimaryKey(ReconDataSet record);
}