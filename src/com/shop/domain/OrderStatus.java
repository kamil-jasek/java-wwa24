package com.shop.domain;

/**
 * Order statuses
 *
 * @author kamil.jasek@gmail.com
 * @since 2019-11-24
 */
public enum OrderStatus {
    IN_PROGRESS("in progress"),
    SENT("sent");

    private String statusName;

    OrderStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
