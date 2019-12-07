package com.example.retrofittt;

public class Todo {

    private  int id;
    private  int userId;
    private  String title;
    private  boolean complete;
    public Todo(int id, int userId, String title, boolean complete) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.complete = complete;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", complete=" + complete +
                '}';
    }
}
