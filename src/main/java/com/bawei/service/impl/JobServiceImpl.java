package com.bawei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.bean.Job;
import com.bawei.mapper.JobMapper;
import com.bawei.service.JobService;

/**
 * @author ccw
 *
 * 2019年11月8日
 */
@Service
@Transactional
public class JobServiceImpl implements JobService{

	@Resource
	private JobMapper mapper;

	public List<Job> getJobList(Job job) {
		// TODO Auto-generated method stub
		return mapper.getJobList(job);
	}
}
