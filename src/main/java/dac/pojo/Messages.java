package dac.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "[Messages]")
public class Messages {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long conversation_id;
	
	private long sender_id;
	
	private int messageType;
	
	private String message;
	
	private Date created_date;
	
	private int is_active;

	public Messages() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getConversation_id() {
		return conversation_id;
	}

	public void setConversation_id(long conversation_id) {
		this.conversation_id = conversation_id;
	}

	public long getSender_id() {
		return sender_id;
	}

	public void setSender_id(long sender_id) {
		this.sender_id = sender_id;
	}

	public int getMessageType() {
		return messageType;
	}

	public void setMessageType(int messageType) {
		this.messageType = messageType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	@Override
	public String toString() {
		return "Messages [id=" + id + ", conversation_id=" + conversation_id + ", sender_id=" + sender_id
				+ ", messageType=" + messageType + ", message=" + message + ", created_date=" + created_date
				+ ", is_active=" + is_active + "]";
	}
	
	
}
