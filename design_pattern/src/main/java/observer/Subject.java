package observer;
// Class này định nghĩa một interface Subject dùng để quản lý các Observer
public interface Subject {
    public void register(Observer obj);

    public void unregister(Observer obj);

    public void notifyObservers();

    public Object getUpdate(Observer obj);
}
