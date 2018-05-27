package io.home.courseapidata.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.home.courseapidata.topic.Topic;

/* ORM let's you map Entity Classes to DB tables
 * You don't have to do the query and mapping yourself.
 * Framework will handles it for you.
 * 
 * JPA is a way to use ORM.
 * It is an API / spec, which lets you configure your Entity classes,
 * & give it to a framework, so that the framework does the rest.
 * 
 * Spring Data JPA is a separate project, 
 * which lets you work with these ORM tools even easier
 */

@Entity
public class Course {

	@Id
	private String id;			// marked as Primary Key by using @Id
	
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() { }
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
}
