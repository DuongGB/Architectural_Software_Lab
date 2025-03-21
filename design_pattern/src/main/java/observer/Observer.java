package observer;

// Class này định nghĩa một interface Observer dùng để cập nhật các thay đổi của Subject
public interface Observer {
    public void update();
    public void setSubject(Subject sub);
}
