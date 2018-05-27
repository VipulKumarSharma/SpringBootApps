package io.home.courseapidata.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Services are Singleton classes, 
 * of which Spring creates an instance (or registers the instance) 
 * & keeps in memory & will be injected to other different classes
 */

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topicsList =new ArrayList<Topic>();
		
		topicRepository.findAll()
			.forEach(topicsList :: add);
		
		return topicsList;
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	/* save() can perform both operations INSERT and UPDATE, 
	 * due to PRIMARY KEY available */
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
	
}
