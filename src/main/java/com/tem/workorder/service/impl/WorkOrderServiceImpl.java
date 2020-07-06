package com.tem.workorder.service.impl;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tem.workorder.dto.BusinessDTO;
import com.tem.workorder.dto.GTImagesDTO;
import com.tem.workorder.dto.UCODTO;
import com.tem.workorder.dto.WorkOrderDTO;
import com.tem.workorder.entity.Business;
import com.tem.workorder.entity.GTImages;
import com.tem.workorder.entity.UCO;
import com.tem.workorder.entity.WorkOrder;
import com.tem.workorder.repository.WorkOrderRepository;
import com.tem.workorder.service.WorkOrderService;

@Service("workOrderService")
public class WorkOrderServiceImpl implements WorkOrderService {

	@Autowired
	WorkOrderRepository WorkOrderRepository;

	@Transactional
	@Override
	public WorkOrderDTO saveWorkOrder(WorkOrderDTO workOrderDto) {

		WorkOrder workOrder = new WorkOrder();
		BeanUtils.copyProperties(workOrderDto, workOrder);
		if (null != workOrderDto.getBusiness()) {
			Business business = new Business();
			BeanUtils.copyProperties(workOrderDto.getBusiness(), business);
			// bi directional mapping
			business.setWorkorders(workOrder);
//			if (workOrderDto.getWorkorderId() != null) {
//				WorkOrder order = new WorkOrder();
//				order.setWorkorderId(workOrderDto.getWorkorderId());
//				business.setWorkorders(order);
//			}
			workOrder.setBusiness(business);
		}

		if (null != workOrderDto.getUco()) {
			UCO uco = new UCO();
			BeanUtils.copyProperties(workOrderDto.getUco(), uco);
			// directional mapping
			uco.setWorkorders(workOrder);
//			if (workOrderDto.getWorkorderId() != null) {
//				WorkOrder order = new WorkOrder();
//				order.setWorkorderId(workOrderDto.getWorkorderId());
//				uco.setWorkorders(order);
//			}
			workOrder.setUco(uco);
		}

		if (null != workOrderDto.getGtImages()) {
			List<GTImages> gtImages = new ArrayList<>();

			for (GTImagesDTO gtImagesDTO : workOrderDto.getGtImages()) {
				GTImages gtImage = new GTImages();

				BeanUtils.copyProperties(gtImagesDTO, gtImages);
				// bidirectional mapping
				gtImage.setImageData(gtImagesDTO.getImageData().getBytes());
				gtImage.setWorkorders(workOrder);
//				if (workOrderDto.getWorkorderId() != null) {
//					WorkOrder order = new WorkOrder();
//					order.setWorkorderId(workOrderDto.getWorkorderId());
//					gtImage.setWorkorders(order);
//				}
				gtImages.add(gtImage);
			}
			;
			workOrder.setGtImages(gtImages);

		}

		workOrder = WorkOrderRepository.save(workOrder);

		BeanUtils.copyProperties(workOrder, workOrderDto);

		return workOrderDto;
	}

	@Override
	public List<WorkOrderDTO> getWorkOrder(WorkOrderDTO workOrderDto) {
		List<WorkOrder> workOrder = WorkOrderRepository.findByCreatedBy(workOrderDto.getCreatedBy());

		List<WorkOrderDTO> workOrders = new ArrayList<>();
		if (workOrder != null) {
			workOrder = workOrder.stream().filter(x -> x.getBusiness() != null).collect(Collectors.toList());
		}
		workOrder.forEach(x -> {
			WorkOrderDTO dto = new WorkOrderDTO();

			List<GTImagesDTO> images = new ArrayList<>();
			x.getGtImages().forEach(item -> {
				GTImagesDTO gtImage = new GTImagesDTO();
				BeanUtils.copyProperties(item, gtImage);
				if (gtImage.getImgStatus() == null) {
					gtImage.setImgStatus(false);
				}
				if (item.getImageData() != null && item.getImageData().length > 0) {
					gtImage.setImageData(new String(item.getImageData()));
				}
				images.add(gtImage);
			});
			BeanUtils.copyProperties(x, dto);
			dto.setGtImages(images);

			BusinessDTO businessDTO = new BusinessDTO();
			if (null != x.getBusiness()) {
				BeanUtils.copyProperties(x.getBusiness(), businessDTO);
				dto.setBusiness(businessDTO);
			}
			if (null != x.getUco()) {
				UCODTO ucodto = new UCODTO();
				BeanUtils.copyProperties(x.getUco(), ucodto);
				dto.setUco(ucodto);
			}

			workOrders.add(dto);
		});
		return workOrders;
	}

}
