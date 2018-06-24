package com.ready.controller;

import com.ready.common.CommonResponse;
import com.ready.pojo.DishDict;
import com.ready.service.FoodService;
import com.ready.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: receive the request about dish
 * @create: 2018-06-24 18:19
 */
@Controller
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private FoodService foodServiceImpl;


    //获得所有菜品种类
    @RequestMapping("/getFoodKind")
    @ResponseBody
    public CommonResponse getFoodKind(){
        //获得所有菜品种类
        List<DishDict> dishDicts = foodServiceImpl.findAllKind();
        return new CommonResponse(CodeUtil.SUCCESS_CODE, dishDicts, CodeUtil.SUCCESS_MSG);
    }


    //增加菜品种类
    @RequestMapping("/addFoodKind")
    @ResponseBody
    public CommonResponse addFoodKind(@RequestBody DishDict kind){
        DishDict dishDict = foodServiceImpl.findKindByName(kind.getKindName());
        if(dishDict != null){
            return new CommonResponse(CodeUtil.FAILE_CODE, "该品种名称已存在");
        }else{
            foodServiceImpl.saveFoodKind(kind);
            return new CommonResponse(CodeUtil.SUCCESS_CODE, CodeUtil.SUCCESS_MSG);
        }
    }

    //修改菜品信息
    @RequestMapping("/updateFoodKinds")
    @ResponseBody
    public CommonResponse updateFoodKind(@RequestBody DishDict kind){
        DishDict dishDict = foodServiceImpl.findKindByName(kind.getKindName());
        if(dishDict != null && dishDict.getKindId() != kind.getKindId()){
            return new CommonResponse(CodeUtil.FAILE_CODE, "该品种名称已存在");
        }else{
            foodServiceImpl.updateFoodKind(kind);
            return new CommonResponse(CodeUtil.SUCCESS_CODE, CodeUtil.SUCCESS_MSG);
        }
    }

    //删除菜品种类
    @RequestMapping("/deleteFoodKind")
    @ResponseBody
    public CommonResponse updateFoodKind(@RequestParam(value = "kindId", required = true ) int id){
        DishDict dishDict = foodServiceImpl.findKindById(id);
        //判断该种类是否已被删除
        if(dishDict == null){
            return new CommonResponse(CodeUtil.FAILE_CODE, "该品种不存在");
        }else{
            foodServiceImpl.deleteFoodKind(id);
            return new CommonResponse(CodeUtil.SUCCESS_CODE, CodeUtil.SUCCESS_MSG);
        }
    }




}
