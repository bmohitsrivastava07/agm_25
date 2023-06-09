package com.ArtGalleryManagement.Backend.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "messages")
@Data
public class Message {

    public Message(){}

    public Message(String title, String question) {
        this.title = title;
        this.question = question;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="message_id")
    private Long messageId;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="title")
    private String title;

    @Column(name="question")
    private String question;

    @Column(name="admin_email")
    private String adminEmail;

    @Column(name="response")
    private String response;

    @Column(name="closed")
    private boolean closed;

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
       
	@ManyToOne(fetch = FetchType.LAZY)
      @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
      private Product product;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}
    
    
}













