package com.tem.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tem.workorder.dto.WOResponseDTO;
import com.tem.workorder.dto.WorkOrderDTO;
import com.tem.workorder.service.WorkOrderService;

@RestController
public class WorkorderController {
	
	@Autowired
	WorkOrderService workOrderService;

	@RequestMapping(value = "/saveWorkOrder", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	WOResponseDTO saveWordOrder(@RequestBody WorkOrderDTO request) {
		return workOrderService.saveWorkOrder(request);		
	}
	
	@RequestMapping(value = "/workOrders", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	List<WorkOrderDTO> getWordOrder(@RequestBody WorkOrderDTO request) {
		return workOrderService.getWorkOrder(request);		
	}
}
