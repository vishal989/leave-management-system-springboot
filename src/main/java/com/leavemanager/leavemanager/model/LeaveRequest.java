package com.leavemanager.leavemanager.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collation = "leave_requests")
public class LeaveRequest {
    @Id
    private String id;
    private String employeeId;
    private Date startDate;
    private Date endDate;
    private LeaveStatus status;
    private String reason;
    private String managerId;
}
