package com.db1.incident.payload;

import java.util.List;

public class PagedResponse<T> {

    private List<T> content;

    public PagedResponse() {

    }

    public PagedResponse(List<T> content) {
        this.content = content;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    
}
