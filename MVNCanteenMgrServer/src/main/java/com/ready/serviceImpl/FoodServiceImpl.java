package com.ready.serviceImpl;

import com.ready.dao.DishDictMapper;
import com.ready.pojo.DishDict;
import com.ready.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: implement about the food service
 * @create: 2018-06-24 18:20
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private DishDictMapper dishDictMapper;

    //获得所有菜品种类
    @Override
    public List<DishDict> findAllKind() {
        return dishDictMapper.selectAll();
    }

    @Override
    public DishDict findKindByName(String kindName) {
        return dishDictMapper.selectByName(kindName);
    }

    //增加菜品种类
    @Override
    public void saveFoodKind(DishDict kind) {
        dishDictMapper.insert(kind);
    }

    //修改菜品种类
    @Override
    public void updateFoodKind(DishDict kind) {
        dishDictMapper.updateByPrimaryKey(kind);
    }

    //根据id查找种类
    @Override
    public DishDict findKindById(int id) {
        return dishDictMapper.selectByPrimaryKey(id);
    }

    //删除种类
    @Override
    public void deleteFoodKind(int id) {
        dishDictMapper.deleteByPrimaryKey(id);
    }
}
