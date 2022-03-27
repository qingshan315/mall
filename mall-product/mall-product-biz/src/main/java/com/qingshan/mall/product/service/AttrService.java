package com.qingshan.mall.product.service;

import com.qingshan.mall.product.vo.AttrGroupRelationVo;
import com.qingshan.mall.product.vo.AttrRespVo;
import com.qingshan.mall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qingshan.common.core.utils.PageUtils;
import com.qingshan.mall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttr(AttrVo attr);

    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    List<Long> selectSearchAttrIds(List<Long> attrIds);

}

