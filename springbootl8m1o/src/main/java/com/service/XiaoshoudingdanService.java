package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshoudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshoudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshoudingdanView;


/**
 * 销售订单
 *
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface XiaoshoudingdanService extends IService<XiaoshoudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoudingdanVO> selectListVO(Wrapper<XiaoshoudingdanEntity> wrapper);
   	
   	XiaoshoudingdanVO selectVO(@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);
   	
   	List<XiaoshoudingdanView> selectListView(Wrapper<XiaoshoudingdanEntity> wrapper);
   	
   	XiaoshoudingdanView selectView(@Param("ew") Wrapper<XiaoshoudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XiaoshoudingdanEntity> wrapper);
}

