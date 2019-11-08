package com.bawei.service;

import java.util.List;

import com.bawei.bean.Job;

/**
 * @author ccw
 *
 * 2019年11月8日
 */
public interface JobService {

	List<Job> getJobList(Job job);

}
