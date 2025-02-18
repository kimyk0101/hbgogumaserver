package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaReport;

@Mapper
public interface GogumaReportMapper {
//	<select id="selectAllReports" resultType="GogumaReport">
	List<GogumaReport> selectAllReports();
//	<insert id="insertReport" parameterType="GogumaReport">
	int insertReport(GogumaReport item);
//	<select id="selectByRid" parameterType="Long" resultType="GogumaReport">
	GogumaReport selectByRid(Long rid);
//	<update id="updateReport" parameterType="GogumaReport">
	int updateReport(GogumaReport item);
//	<delete id="deleteReport" parameterType="Long">
	int deleteReport(Long id);
}
