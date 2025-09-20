package TodoListApp;

import java.util.Objects;

class Task {
    private static long counter = 100;
    private long id;
    private String message;
    private String date;

    public Task(String message, String date) {
        this.id = counter++;
        this.message = message;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", message='" + message + "', date=" + date + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        return id == other.id;
    }
}