package com.audintel;

import com.audintel.dao.Employee;
import com.audintel.dao.Task;
import com.audintel.dao.Visit_info;
import com.audintel.repository.TaskRepository;
import com.audintel.repository.Visit_inforepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@SpringBootApplication
//@ComponentScan("com.audintel.main")
public class FfmApplication {

	public static void main(String[] args) {

		SpringApplication.run(FfmApplication.class, args);
	}

}


//@RestController
//@RequestMapping("/")
//class DistanceController {
//
//	@Autowired
//	TaskRepository taskRepository;
//	@Autowired
//	Visit_inforepository visitInfoRepository;
//
//
//	public DistanceController(TaskRepository taskRepository, Visit_inforepository visitInfoRepository) {
//		this.taskRepository = taskRepository;
//		this.visitInfoRepository = visitInfoRepository;
//	}
//
//	@GetMapping("/distance/{employeeId}")
//	public float calculateDistanceForEmployee(@PathVariable int employeeId) {
//		List<Task> tasks = taskRepository.findByAssigned_to( employeeId);
//		float totalDistance = 0;
//
//		for (Task task : tasks) {
//			List<Visit_info> visitInfos = visitInfoRepository.findByTask_Id(task.getId());
//
//			for (int i = 0; i < visitInfos.size() - 1; i++) {
//				Visit_info visitInfo = visitInfos.get(i);
//				totalDistance +=calculatedistance(visitInfo.getFrom_latitude(),visitInfo.getFrom_longitude(),visitInfo.getTo_latitude(),visitInfo.getTo_longitude());
//
//
//
//			}
//		}
//
//
//		return totalDistance;
//	}
//
//		public float calculatedistance(float fromlatitude,float fromlongitude,float tolatitude,float tolongitude){
//			int earthRadius = 6371;
//
//			float dLat = (float) Math.toRadians(tolatitude - fromlatitude);
//			float dLon = (float) Math.toRadians(tolongitude - fromlongitude);
//
//			float a = (float) (Math.sin(dLat / 2) * Math.sin(dLat / 2) +
//					Math.cos(Math.toRadians(fromlatitude)) * Math.cos(Math.toRadians(tolatitude)) *
//							Math.sin(dLon / 2) * Math.sin(dLon / 2));
//
//			float c = 2 * (float) Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
//
//			return earthRadius * c;
//		}
//}


