package Lecture5;
public class SingletonClass {
	
		//Creating a variable to get the instance of this class
		private static SingletonClass current_instance = null;
		
		//Make a constructor private to avoid instance of the class
		private SingletonClass() {}
		
		//Create a function to get the instance of the class (Getter)
		public static SingletonClass getInstance() {
			if(current_instance == null)
				current_instance = new SingletonClass();
			
			return current_instance;
		}
		
		public String toString() {
			return System.identityHashCode(this) + "";
		}
	}
