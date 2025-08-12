# Lab Assignment 23

In this lab you will practice working with abstraction.

Unlike previous labs, your class has already been created for you. 

## Let's get started!

Now let's begin!

### Abstraction

**Abstraction** is an important concept of OOP, it's the process of showing only essential information to the user and non-essential information is made unavailable. An **abstract class**, is a class that cannot be instantiated. Then why declare it? Well, an abstract class is designed to be **inherited** and serve as a layout or structure.

An abstract class cannot be used to make objects.

**For Example:**
```java
abstract class Car {
	public String make;
	public String model;
}

class Main {
	
	public static void main(String[]args) {
		// ****** ERROR *********
		Car myCar = new Car(); // Cannot instanciate Abstract classes
	}
}
```

It's designed to serve as a structure or layout for sub-classes ONLY. For example, we don't want our user to make Car objects since it's too general. Instead, we want them to make Truck or Van objects.

**For Example:**
```java
abstract class Car {
	public String make;
	public String model;
}

class Truck extends Car {
	// Inherits all Car members.
}

class Van extends Car {
	// Inherits all Car members.
}

class Main {
	
	public static void main(String[]args) {

		Truck myTruck = new Truck(); // We can instantiate the sub-class
		myTruck.make = "Toyota";

		Van myVan = new Van(); // We can instantiate the sub-class
		myVan.make = "Ford";
	}
}
```

**Abstract methods** only provide the header of the method and need to be implemented in the sub-class. To do this, the abstract method must be overrided. If an abstract method is not overriden in the sub-class then it will throw an error.

**For Example:**
```java
abstract class Car {
	public String make;
	public String model;

	public abstract void about();
}

class Truck extends Car {
	// Abstract methods must be overriden to be implemented.
	@Override
	public void about() {
		System.out.print("This is a truck.");
	}
}

class Main {
	
	public static void main(String[]args) {

		Truck myTruck = new Truck(); // We can instantiate the sub-class
		myTruck.about(); // If about() is not overriden it will throw an error.
	}
}
```

To learn more about abstraction in Java visit: https://www.w3schools.com/java/java_abstract.asp and https://www.javatpoint.com/abstract-class-in-java

## Your Assignment

### Animal Classification

For this assignment you are provided with 5 classes: `Animal`, `Crocodile`, `Lion`, `Ostrich`, and `Zebra`. 

The `Animal` class has been made **abstract** to prevent the user from making such a broad/general object. 

Refactor each class by inheriting from the `Animal` class and remove any attributes that will be overriden and override any abstract methods.

Once finished, call the `about()` method from `Crocodile`, `Lion`, `Ostrich`, and `Zebra` inside the `Main` class.

After refactoring your code, run the test below to test your code.

**Test Your Code:**

```
./build.sh
./test.sh
```

## Submit your assignment

To submit your lab assignment click on the **Source Control** icon (3 circles with 2 lines) on your leftside navbar. Next, click on the **+** symbol next to **Changes** to stage your changes. Lastly, add a commit message (ex: "First commit") and click **Commit** then **Sync Changes**. And you're done!
