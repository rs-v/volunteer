package edu.csust.volunteer.dao;

import java.util.List;

import edu.csust.remote.entity.Download;

public interface IdownLoadDao {

	List<Download> getDownloadInfos(String hql, int current, int number,
			Object[] params);

}
