import java.util.Objects;

public class History {

    private Department department;
    private String topicOfWork;
    private int mark;

    public History() {}

    public History(Department department, String topicOfWork, int mark) {
        this.department = department;
        this.topicOfWork = topicOfWork;
        this.mark = mark;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTopicOfWork() {
        return topicOfWork;
    }

    public void setTopicOfWork(String topicOfWork) {
        this.topicOfWork = topicOfWork;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return mark == history.mark &&
                Objects.equals(department, history.department) &&
                Objects.equals(topicOfWork, history.topicOfWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, topicOfWork, mark);
    }

    @Override
    public String toString() {
        return "History{" +
                "department=" + department +
                ", topicOfWork='" + topicOfWork + '\'' +
                ", mark=" + mark +
                '}';
    }
}
