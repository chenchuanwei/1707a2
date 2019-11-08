package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.bean.Job;
import com.bawei.service.JobService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author ccw
 *
 * 2019年11月8日
 */
@Controller
public class JobController {

	@Resource
	private JobService ser;
	
	@RequestMapping("getJobList")
	public String getJobList (Model model,Job job,@RequestParam(defaultValue="1")Integer pageNum,@RequestParam(defaultValue="5")Integer pageSize){
		
		PageHelper.startPage(pageNum, pageSize);
		List<Job> list=ser.getJobList(job);
		
		PageInfo<Job> page=new PageInfo<Job>(list);
		
		model.addAttribute("page", page);
		model.addAttribute("j", job);
		
		return "JobList";
	}
}
