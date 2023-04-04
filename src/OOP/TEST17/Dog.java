package OOP.TEST17;

public class Dog extends Animal{

    String breed;
    int HumanYears;
    public Dog(String name,int age,String breed){
        super(name,age);

        this.breed=breed;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public int getAgeInHumanYears() {
        if (age<=2){
            return age*11;
        }else {
            return 22+((age-2)*5);
        }
    }

    public boolean equals(Dog first){
        return this.age==first.age&&
                this.name.equals(first.name)&&
                this.breed.equals(first.breed);

    }
    @Override
    public String toString() {
        return
                "Name: "+name+'\n'+
                        "Breed: "+breed+'\n'+
                        "Age in calendar years: "+age+'\n'+
                        "Age in human years; "+this.getAgeInHumanYears();
    }
}
