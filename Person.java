
// PropertyChange - person.java

// import java.beans.BeanProperty;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private PropertyChangeSupport psc = new PropertyChangeSupport(this);

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    // public Person(int age){

    // }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        psc.firePropertyChange("name", oldName, name);
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        psc.firePropertyChange("age", oldAge, age);

    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        psc.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        Person person = new Person("Sujan",12);

        person.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                System.out.println(" Property " + e.getPropertyName() + " Changed from " + e.getOldValue() + " to "
                        + e.getNewValue());
                // System.out.println(" Property " + e.getPropertyName() + " Changed from " +
                // e.getOldValue() + " to "
                // + e.getNewValue());
            }

        });
        // changed properties
        person.setName("Raju");
        person.setAge(14);

    }
}

// public class Boundproperty {
// Person p = new Person("Ram");p.addPropertyChangeListener(new
// PropertyChangeListener(){

// @Override
// public void propertyChange(PropertyChangeEvent e){
// System.out.println("Property"+e.getPropertyName()+"Change
// from"+e.getOldValue()+"to"+e.getNewValue());
// },
// },),

// }
