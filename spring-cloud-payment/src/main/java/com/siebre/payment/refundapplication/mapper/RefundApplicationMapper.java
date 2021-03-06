package com.siebre.payment.refundapplication.mapper;

import com.siebre.basic.query.PageInfo;
import com.siebre.payment.entity.enums.PaymentOrderRefundStatus;
import com.siebre.payment.entity.enums.RefundApplicationStatus;
import com.siebre.payment.refundapplication.entity.RefundApplication;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RefundApplicationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RefundApplication record);

    int insertSelective(RefundApplication record);

    RefundApplication selectByPrimaryKey(Long id);

    RefundApplication selectByMessageId(String messageId);

    RefundApplication selectByBusinessNumber(@Param("orderNumber") String orderNumber, @Param("refundApplicationNumber") String refundApplicationNumber);

    List<RefundApplication> selectByOrderNumberAndStatus(@Param("orderNumber") String orderNumber, @Param("status") RefundApplicationStatus status);

    List<RefundApplication> selectByPage(PageInfo pageinfo);

    List<RefundApplication> selectRefundList(@Param("orderNumber") String orderNumber, @Param("refundNumber") String refundNumber,
                                             @Param("channelCodeList") List<String> channelCodeList,
                                             @Param("startDate") Date startDate, @Param("endDate") Date endDate, PageInfo pageinfo);

    int updateByPrimaryKeySelective(RefundApplication record);

    int updateByPrimaryKey(RefundApplication record);
}