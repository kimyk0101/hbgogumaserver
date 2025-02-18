package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaReportMapper;
import himedia.hbgoguma.repository.vo.GogumaReport;

@Service
public class GogumaReportService {
	@Autowired
	private GogumaReportMapper gogumaReportMapper;
	
	public List<GogumaReport> selectAllReports() {
		List<GogumaReport> reports = gogumaReportMapper.selectAllReports();
		
		return reports;
	}
	
	public GogumaReport insertReport(GogumaReport report) {
		gogumaReportMapper.insertReport(report);
		
		Long rid = report.getRid();
		
		return gogumaReportMapper.selectByRid(rid);
	}
	
	public GogumaReport updateReport(GogumaReport report) {
		gogumaReportMapper.updateReport(report);
		
		return report;
	}
	
	public int deleteReport(Long rid) {
		return gogumaReportMapper.deleteReport(rid);
	}
}
