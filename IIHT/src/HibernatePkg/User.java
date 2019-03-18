package HibernatePkg;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

public class User {

	@Id
	@Column(name = "Userid")
	@Embedded
	private int UserId;
	@AttributeOverrides({ @AttributeOverride(name = "BookDate", column = @Column(name = "ReturnDate")) })
	private Books Books;
	public User(int BookId,Books Books){
		
		
	}
	
	public Books getBooks() {
		return Books;
	}

	public void setBooks(Books books) {
		this.Books = books;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

}
