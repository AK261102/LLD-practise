package Structural

import java.util.ArrayList;
import java.util.List;

-Design-Patterns.Composite_Design_Pattern.Good_Code.Concrete_Class;

public class CompositeSmartComponent implements SmartComponent{
    public List<SmartComponent> components=new ArrayList<>();
    public void addComponent(SmartComponent component)
    {
        components.add(component);
    }
    public void removeComponent(SmartComponent component)
    {
        components.remove(component);
    }
    @Override
    public void turnOn()
    {
        for(SmartComponent it:components)
        {
            it.turnOn();
        }
    }
    @Override
    public void turnOff()
    {
        for(SmartComponent it:components)
        {
            it.turnOff();
        }
    }
}
