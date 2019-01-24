package dac.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "[Participants]")
public class Participants {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private long conversation_id;
	
	private long user_id;
	
	private int type;
	
	private int is_active;

	public Participants() {
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

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	@Override
	public String toString() {
		return "Participants [id=" + id + ", conversation_id=" + conversation_id + ", user_id=" + user_id + ", type="
				+ type + ", is_active=" + is_active + "]";
	}
	
	
		
}
