

/**
 *
 * @author kalsara
 */

public class person {
    
    @XmlRootElement(name="person")
@XmlType(propOrder={"id","fullName","age"})
public class person {
    
    private int id;
    private String fullName;
    private int age;
@XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@XmlElement

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
@XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
