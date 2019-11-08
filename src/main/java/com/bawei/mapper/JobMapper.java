package com.bawei.mapper;

import java.util.List;

import com.bawei.bean.Job;

/**
 * @author ccw
 *
 * 2019年11月8日
 */
public interface JobMapper {

	List<Job> getJobList(Job job);

}
