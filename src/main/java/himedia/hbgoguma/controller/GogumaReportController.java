package himedia.hbgoguma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.hbgoguma.repository.vo.GogumaReport;
import himedia.hbgoguma.service.GogumaReportService;

@RestController
@RequestMapping("/api/gogumareport")
public class GogumaReportController {
	@Autowired
	private GogumaReportService gogumaReportService;
	
//	GET : /api/gogumareport
	@GetMapping
	public ResponseEntity<List<GogumaReport>> getAllReports() {
		List<GogumaReport> reports = gogumaReportService.selectAllReports();
		return ResponseEntity.ok(reports);
	}
	
//	POST : /api/gogumareport -> 새로운 신고 항목 생성
	@PostMapping
	public ResponseEntity<GogumaReport> createReport(@RequestBody GogumaReport report) {
		GogumaReport savedReport = gogumaReportService.insertReport(report);
		return ResponseEntity.ok(savedReport);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/gogumareport/{rid} -> 기존 신고 항목 수정
	@PutMapping("/{rid}")
	public ResponseEntity<GogumaReport> updateReport(@RequestBody GogumaReport report, @PathVariable Long rid) {
		report.setRid(rid);
		GogumaReport updatedReport = gogumaReportService.updateReport(report);
		return ResponseEntity.ok(updatedReport);
	}
	
//	DELETE : /api/gogumareport/{rid} -> 기존 신고 항목 삭제
	@DeleteMapping("/{rid}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deleteReport(@PathVariable Long rid) {
		gogumaReportService.deleteReport(rid);
		return ResponseEntity.ok().<Void>build();
	}
}
