package dac.pojo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "[Conversation]")
public class Conversation {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		private String title;
		
		private long creator_id;
		
		private Date created_date;
		
		private Date deleted_date;
		
		private int is_active;

		public Conversation() {
			super();
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public long getCreator_id() {
			return creator_id;
		}

		public void setCreator_id(long creator_id) {
			this.creator_id = creator_id;
		}

		public Date getCreated_date() {
			return created_date;
		}

		public void setCreated_date(Date created_date) {
			this.created_date = created_date;
		}

		public Date getDeleted_date() {
			return deleted_date;
		}

		public void setDeleted_date(Date deleted_date) {
			this.deleted_date = deleted_date;
		}

		public int getIs_active() {
			return is_active;
		}

		public void setIs_active(int is_active) {
			this.is_active = is_active;
		}

		@Override
		public String toString() {
			return "Conversation [id=" + id + ", title=" + title + ", creator_id=" + creator_id + ", created_date="
					+ created_date + ", deleted_date=" + deleted_date + ", is_active=" + is_active + "]";
		}
		
		
		
}
