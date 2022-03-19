package morgan.rayon.standard;
import javax.mail.*;

public class Mail {
	private String msg_to;
	private String msg_from;
	private String msg_subject;
	private String msg_body;
	
	public Mail()
	{
		
	}

	public String getMsg_to() {
		return msg_to;
	}

	public void setMsg_to(String msg_to) {
		this.msg_to = msg_to;
	}

	public String getMsg_from() {
		return msg_from;
	}

	public void setMsg_from(String msg_from) {
		this.msg_from = msg_from;
	}

	public String getMsg_subject() {
		return msg_subject;
	}

	public void setMsg_subject(String msg_subject) {
		this.msg_subject = msg_subject;
	}

	public String getMsg_body() {
		return msg_body;
	}

	public void setMsg_body(String msg_body) {
		this.msg_body = msg_body;
	}
	

}
