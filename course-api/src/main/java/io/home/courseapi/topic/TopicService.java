package io.home.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/* Services are Singleton classes, 
 * of which Spring creates an instance (or registers the instance) 
 * & keeps in memory & will be injected to other different classes
 */

@Service
public class TopicService {

	/* Arrays.asList gives immutable Array */
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("springBoot", "Spring Boot", "Spring Boot Description"),
			new Topic("elasticSearch", "Elastic Search", "Elastic Search Description")
		));

	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream()
				.filter(t -> t.getId().equals(id))
				.findFirst()
				.get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			
			if(t.getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
	
}
