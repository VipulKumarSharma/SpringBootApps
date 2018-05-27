package io.home.courseapidata.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Services are Singleton classes, 
 * of which Spring creates an instance (or registers the instance) 
 * & keeps in memory & will be injected to other different classes
 */

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	
	public List<Course> getAllCourses(String topicId) {
		List<Course> coursesList = new ArrayList<Course>();
		
		courseRepository.findByTopicId(topicId)
			.forEach(coursesList :: add);
		
		return coursesList;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	/* save() can perform both operations INSERT and UPDATE, 
	 * due to PRIMARY KEY available */
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	
}
