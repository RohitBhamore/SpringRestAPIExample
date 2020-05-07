package com.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.bean.Student;
import com.restapi.bean.StudentNotFount;

/* import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.restapi.bean.StudentResponse;

*/

@RestController
@RequestMapping("/test")
public class MyController {

	List<Student> list;

	MyController() {

		list = new ArrayList<Student>();

		Student theStudent = new Student(1, "Rohit", "Sharma");
		Student theStudent1 = new Student(2, "Virat", "Kohli");
		Student theStudent2 = new Student(3, "Devid", "Warner");
		Student theStudent3 = new Student(4, "KL", "Rahul");

		list.add(theStudent);
		list.add(theStudent1);
		list.add(theStudent2);
		list.add(theStudent3);

	}

	/*
	 * HTTP : GET METHOD : Used for read the list of student data.
	 * 
	 * @return : list of student data.
	 * 
	 */

	@GetMapping("/students")
	public List<Student> getStudents() {

		System.out.println(list);

		return list;
	}

	/*
	 * HTTP : GET METHOD : Used for read the single student data.
	 * 
	 * @input : Student Id
	 * 
	 * @return : Single Student data.
	 * 
	 */

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		if (studentId < 0 || studentId > list.size()) {
			throw new StudentNotFount("SudentId can not be avialable:" + studentId);
		}

		Student theStudent = list.get(studentId);

		System.out.println(list);

		return theStudent;
	}

	/*
	 * HTTP : POST METHOD : Used for creating new Student.
	 * 
	 * @input : the Student information in json format. jackson convert this to the
	 * student object
	 * 
	 * @return : Created new student.
	 * 
	 */

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student theStudent) {

		int size = list.size();

		Student addstudent = theStudent;
		addstudent.setRollNo(size++);

		list.add(addstudent);

		System.out.println(list);

		return addstudent;
	}

	/*
	 * HTTP : PUT METHOD : Used for update Exiting Student.
	 * 
	 * @input : the Student information which want to update in json format. jackson
	 * convert this to the student object.
	 * 
	 * @return : list of student.
	 * 
	 */

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student theStudent) {

		int sId = theStudent.getRollNo();
		Student tempStudent = list.get(sId);

		tempStudent.setFirstName(theStudent.getFirstName());
		tempStudent.setLastName(theStudent.getLastName());

		list.set(sId, tempStudent);

		System.out.println(list);

		return tempStudent;
	}

	/*
	 * HTTP : DELETE METHOD : Used for deleting exiting student object.
	 * 
	 * @input : Student Id
	 * 
	 * @return : void.
	 * 
	 */

	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {

		list.remove(studentId);

		System.out.println(list);

	}

	/*
	 * If ExceptionHandling code place here so this available only current
	 * controller. Suppose we have lot of controller so separately write in each
	 * controller. So best place create a Class with @ControllerAdvice Annotation.
	 * Exception handling code place in this class so this available to the all
	 * controller by default.
	 * 
	 * @ControllerAdvice Work as AOP(Aspect Oriented Programming)
	 * 
	 * Reference: GlobalExceptionHandler.java
	 * 
	 * -----------------------------------------------------------------------------
	 */

	/*
	 * @ExceptionHandler public ResponseEntity<StudentResponse>
	 * handlerException(StudentNotFount ex){
	 * 
	 * StudentResponse error = new StudentResponse();
	 * error.setStatusCode(HttpStatus.NOT_FOUND.value());
	 * error.setMessage(ex.getMessage());
	 * error.setTimeStamp(System.currentTimeMillis());
	 * 
	 * return new ResponseEntity<StudentResponse>(error,HttpStatus.NOT_FOUND);
	 * 
	 * }
	 * 
	 * 
	 * @ExceptionHandler public ResponseEntity<StudentResponse>
	 * handlerException(Exception ex){
	 * 
	 * StudentResponse error = new StudentResponse();
	 * error.setStatusCode(HttpStatus.BAD_REQUEST.value());
	 * error.setMessage(ex.getMessage());
	 * error.setTimeStamp(System.currentTimeMillis());
	 * 
	 * return new ResponseEntity<StudentResponse>(error,HttpStatus.BAD_REQUEST);
	 * 
	 * }
	 * 
	 */
}
