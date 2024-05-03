package com.fishman.fishmanBI.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fishman.fishmanBI.model.entity.Chart;
import com.fishman.fishmanBI.service.ChartService;
import com.fishman.fishmanBI.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author fishman
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-05-03 18:35:03
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




