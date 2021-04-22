package com.dolbunmark.dto;


import com.dolbunmark.domain.Category;
import com.dolbunmark.enums.State;
import com.dolbunmark.enums.Urgency;


import java.sql.Date;

public class TicketDto {
    private int id;
    private String name;
    private String description;
    private Date created_on;
    private Date desired_resolution_date;
    private UserDto assignee;
    private UserDto owner;
    private State state;
    private Category category;
    private Urgency urgency;
    private UserDto approver;

    public TicketDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Date getDesired_resolution_date() {
        return desired_resolution_date;
    }

    public void setDesired_resolution_date(Date desired_resolution_date) {
        this.desired_resolution_date = desired_resolution_date;
    }

    public UserDto getAssignee() {
        return assignee;
    }

    public void setAssignee(UserDto assignee) {
        this.assignee = assignee;
    }

    public UserDto getOwner() {
        return owner;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency(Urgency urgency) {
        this.urgency = urgency;
    }

    public UserDto getApprover() {
        return approver;
    }

    public void setApprover(UserDto approver) {
        this.approver = approver;
    }
}
