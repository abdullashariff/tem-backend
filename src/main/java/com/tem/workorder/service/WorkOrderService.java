package com.tem.workorder.service;

import java.util.List;

import com.tem.workorder.dto.WorkOrderDTO;

public interface WorkOrderService {

	WorkOrderDTO saveWorkOrder(WorkOrderDTO workOrder);

	List<WorkOrderDTO> getWorkOrder(WorkOrderDTO workOrderDto);

}
