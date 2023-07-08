package finalControlWork.utils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Ticket {
    private int orderId;
    private Date issueTime;

    public Ticket(int orderId, Date issueTime) {
        this.orderId = orderId;
        this.issueTime = issueTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getIssueTime() {
        return issueTime;
    }
}
