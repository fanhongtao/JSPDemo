package struts;

public class Form extends DefaultSupport {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws Exception {
        if (name == null) {
            return INPUT;
        }
        return SUCCESS;
    }
}
