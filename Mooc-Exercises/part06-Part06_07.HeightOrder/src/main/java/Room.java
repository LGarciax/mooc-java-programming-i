import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room(){
        persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        if(this.isEmpty()){
            return null;
        }
        Person shortestPerson = persons.get(0);

        for(Person person: persons){
            if(shortestPerson.getHeight() > person.getHeight()){
                shortestPerson = person;
            }
            
        }
        return shortestPerson;
    }

    public Person take(){
            if(this.isEmpty()){
                return null;
            }

            Person smallest = this.shortest();

            this.persons.remove(this.shortest());

            return smallest;
            
        }




       
}

