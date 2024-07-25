import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

class Person implements Serializable{
    private String name;
    public Person(){

    }
    private PropertyChangeSupport psc = new PropertyChangeSupport(this);
    public Person(String name){
        this.name=name;
    }
    public void setName(String name){
        String oldName=this.name;
        this.name=name;
        psc.firePropertyChange("name", oldName, name);
    }
    public void addPropertyChangeListener(PropertyChangeListener listener){
        psc.addPropertyChangeListener(listener);
    }
}
public class Boundproperty {
    Person p = new Person("Ram");
    p.addPropertyChangeListener(new PropertyChangeListener(){
        @Override
        public void propertyChange(PropertyChangeEvent e){
            System.out.println("Property"+e.getPropertyName()+"Change from"+e.getOldValue()+"to"+e.getNewValue());
        },
    },),
    
}
