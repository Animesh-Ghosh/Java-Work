//program to demonstrate use of super () to give appropriate name to a thread

class Vehicle { 
    int maxSpeed = 120; 
} 
class Car extends Vehicle { 
    int maxSpeed = 180; 
    void display() { 
        System.out.println("Maximum Speed: " + super.maxSpeed); 
    } 
} 
class Question51 { 
    public static void main(String[] args) { 
        Car small = new Car(); 
        small.display(); 
    } 
} 