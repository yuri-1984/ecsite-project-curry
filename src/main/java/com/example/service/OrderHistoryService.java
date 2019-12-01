package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Order;
import com.example.repository.OrderRepository;

/**
 * 注文履歴情報を操作するサービスクラス.
 * @author hiraokayuri
 */
@Service
@Transactional
public class OrderHistoryService {
	@Autowired
	private OrderRepository orderRepository;
	
	
	
	 	
	 	/**
	 	 * 未購入以外の注文履歴を検索する.
	 	 * @param id
	 	 * @return
	 	 */
	 	public List<Order> seachOrderList(Integer id){
	 		 List<Order> orderList = orderRepository.findByLiginUserIdNotStatusZero(id);
	 		 return orderList;
	 		
	 	}

	
	
	

}
