package com.ccolor.web.bd;

import java.io.OutputStream;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.ccolor.mybatis.bean.tblOrderBD;
import com.ccolor.mybatis.service.tblOrderBDService;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@Controller
public class ReportController {
	@Autowired
	tblOrderBDService bd;
	@Resource
	private SqlSessionFactory sessionFactory;
	static String jasper_home="/resources/jasper";
	SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");

	@RequestMapping(value = "/Report", method = RequestMethod.GET)
	public String ViewReport(HttpServletRequest request,Locale locale, Model model) {
		
		return "orderBD/s_report";
	}

	@RequestMapping(value = "/selectReport", method = RequestMethod.POST)
	public String selectReport(WebRequest webRequest, Locale locale, Model model) {
		List<tblOrderBD> list = null;
		try {
			Date s_time = sdFormat.parse(webRequest.getParameter("s_date"));
			Date e_time = sdFormat.parse(webRequest.getParameter("e_date"));
			list = bd.selectData(s_time, e_time);
			List<tblOrderBD> sum_l = bd.selectReport(s_time, e_time);
			for (tblOrderBD obj : list) {
				obj.setTemp1(sdFormat.format(obj.getDate()));
			}
			setSUMModel(sum_l, model);
			model.addAttribute("data", list);
		} catch (ParseException e) {
			e.printStackTrace();
			return "error";
		}catch (NumberFormatException e) {
			model.addAttribute("data", null);;
		}
		return "orderBD/s_report_table";
	}

	private void setSUMModel(List<tblOrderBD> list, Model model) {
		tblOrderBD lunch = null;
		tblOrderBD dinner = null;
		for (tblOrderBD obj : list) {
			if (obj.getType().equals("午")) {
				lunch = obj;
			}
			if (obj.getType().equals("晚")) {
				dinner = obj;
			}
		}
		int l_ccom = Integer.parseInt(lunch.getcCom());
		int l_cself = Integer.parseInt(lunch.getcSelf());
		int l_self = Integer.parseInt(lunch.getSelf());
		int l_scom = Integer.parseInt(lunch.getsCom());
		int l_totle = l_ccom + l_cself + l_self + l_scom;
		int n_ccom = Integer.parseInt(dinner.getcCom());
		int n_cself = Integer.parseInt(dinner.getcSelf());
		int n_self = Integer.parseInt(dinner.getSelf());
		int n_scom = Integer.parseInt(dinner.getsCom());
		int n_totle = n_ccom + n_cself + n_self + n_scom;
		model.addAttribute("totle", (l_totle + n_totle) + "\t [午:" + l_totle + "晚:" + n_totle + "]\r\n");
		model.addAttribute("c_self", (l_cself + n_cself) + "\t [午:" + l_cself + "晚:" + n_cself + "]\r\n");
		model.addAttribute("c_com", (l_ccom + n_ccom) + "\t [午:" + l_ccom + "晚:" + n_ccom + "]\r\n");
		model.addAttribute("s_self", (l_self + n_self) + "\t [午:" + l_self + "晚:" + n_self + "]\r\n");
		model.addAttribute("com", (l_scom + n_scom) + "\t [午:" + l_scom + "晚:" + n_scom + "]\r\n");
	}

	@RequestMapping(value = "/getDtlReport", method = RequestMethod.GET)
	@ResponseBody
	public void getDtlReport(WebRequest webRequest, HttpServletResponse response, HttpServletRequest req) {
		ServletContext ctx = req.getSession().getServletContext();
		String path = ctx.getRealPath(jasper_home);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("s_date", webRequest.getParameter("s_date"));
		params.put("e_date", webRequest.getParameter("e_date"));
		params.put("time", sdFormat.format(new Date()));
		params.put("pic_path", path + "/logo_b.png");
		String jasper_file =path +"/"+ "orderList.jasper";
		pdfCreator(response,jasper_file,params);
	}
	@RequestMapping(value = "/getSUMReport", method = RequestMethod.GET)
	@ResponseBody
	public void getSUMReport(WebRequest webRequest, HttpServletResponse response, HttpServletRequest req) {
		ServletContext ctx = req.getSession().getServletContext();
		String path = ctx.getRealPath(jasper_home);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("s_date", webRequest.getParameter("s_date"));
		params.put("e_date", webRequest.getParameter("e_date"));
		params.put("time", sdFormat.format(new Date()));
		params.put("pic_path", path + "/logo_b.png");
		String jasper_file =path +"/"+ "main_report.jasper";
		pdfCreator(response,jasper_file,params);
	}

	private void pdfCreator(HttpServletResponse response,String file_path,Map params) {
		response.setContentType("application/pdf;");
		response.setHeader("Content-disposition", "inline; filename=Report.pdf");
		OutputStream outputStream = null;
		try {
			SqlSession session = sessionFactory.openSession();
			Connection con = session.getConnection();
			JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file_path);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, con);
			outputStream = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(outputStream);
		}
	}
}
