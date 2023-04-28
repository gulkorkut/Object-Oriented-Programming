
public class Course {
	 private String courseTitle;
	    private String courseCode;
	    private String credits;
	    private String instructorName;

	    public Course(String courseTitle, String courseCode, String credits, String instructorName) {
	        this.courseTitle = courseTitle;
	        this.courseCode = courseCode;
	        this.credits = credits;
	        this.instructorName = instructorName;
	    }

	    public Course() {
	        this.courseTitle = "Not Defined";
	        this.courseCode = "Not Defined";
	        this.credits = "Not Defined";
	        this.instructorName = "Not Defined";
	    }

	    public Course(String courseTitle, String courseCode) {
	        this.courseTitle = courseTitle;
	        this.courseCode = courseCode;
	        this.credits = "Not Defined";
	        this.instructorName = "Not Defined";
	    }
	    

	    public String getCourseTitle() {
	        return courseTitle;
	    }

	    public void setCourseTitle(String courseTitle) {
	        this.courseTitle = courseTitle;
	    }

	    public String getCourseCode() {
	        return courseCode;
	    }

	    public void setCourseCode(String courseCode) {
	        this.courseCode = courseCode;
	    }

	    public String getCredits() {
	        return credits;
	    }

	    public void setCredits(String credits) {
	        this.credits = credits;
	    }

	    public String getInstructorName() {
	        return instructorName;
	    }

	    public void setInstructorName(String instructorName) {
	        this.instructorName = instructorName;
	    }
	     public String getInfo() {
	  return "Course Title=" + courseTitle + ", Course Code=" + courseCode + ", Credits=" + credits
	    + ", Instructor Name=" + instructorName;
	 }

}
