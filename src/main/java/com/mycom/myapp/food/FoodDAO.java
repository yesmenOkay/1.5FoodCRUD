package com.mycom.myapp.food;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodDAO {
	@Autowired
	SqlSession sqlSession;
	public int insertFood(FoodVO vo){
		int result = sqlSession.insert("Food.insertFood",vo);
		return result;
		}
	public int deleteFood(int seq){
		int result = sqlSession.delete("Food.deleteFood", seq);
		return result;
	}
	public int updateFood(FoodVO vo){
		int result = sqlSession.update("Food.updateFood", vo);
		return result;
	}

		public FoodVO getFood(int seq){
			FoodVO one = sqlSession.selectOne("Food.getFood", seq);
			return one;
		}
		public List<FoodVO> getFoodList(){
		List<FoodVO> list = sqlSession.selectList("Food.getFoodList");
		return list;
		}

}

