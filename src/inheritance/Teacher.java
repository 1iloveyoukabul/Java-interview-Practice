package inheritance;

public class Teacher extends person {
	
	private String subject;
	private String title;
	
	public Teacher() {
		super();
		this.subject = "";
		this.title = "";
	}
		public Teacher(String subject, String title) {
			super();
		this.subject = subject;
		this.title = title;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Override
		public String toString() {
			return "Teacher [subject="+super.toString() + subject + ", title=" + title + "]";
		}
		
	}
	