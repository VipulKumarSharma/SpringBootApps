package io.home.courseapidata.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository 
	extends CrudRepository<Course, String> {

	/* find-By-Name is a standard JPA naming convention 
	 * find - find all courses
	 * Name - by name property
	 */
	public List<Course> findByName(String name);
	
	/* Topic is not in Courses & is an object,
	 * find all courses By Id property of Topic field
	 */ 
	public List<Course> findByTopicId(String topicId);
}
