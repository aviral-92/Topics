package com.topic.mysqlDb;

import java.sql.SQLException;
import java.util.List;

import com.topic.pojo.Topics;

public interface MysqlDbService {

	public String addTopics(Topics topic) throws SQLException;

	public List<Topics> getTopic() throws SQLException;

	public Topics getTopicByName(String name) throws SQLException;

	public Topics modifyByTopicName(String oldName, String newName) throws SQLException;
}
