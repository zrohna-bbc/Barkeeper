package ch.bbcag.barkeeper.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String text;
	private int idAuthor;
	private int idPost;
	private int repliesToID;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}
	public int getIdPost() {
		return idPost;
	}
	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}
	public int getRepliesToID() {
		return repliesToID;
	}
	public void setRepliesToID(int repliesToID) {
		this.repliesToID = repliesToID;
	}
	public Comment() {
		super();
	}
   
}
