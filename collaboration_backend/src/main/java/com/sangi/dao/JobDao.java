package com.sangi.dao;


import java.util.List;

import com.sangi.model.Job;

public interface JobDao {
void addJob(Job job);
List<Job> getAllJobs();// select * from job_s180233
Job getJob(int id);
}


