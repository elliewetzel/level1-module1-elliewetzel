
public class Person {
private String name;
private String superpower;


String getName() {
	return name;
}
void setName(String name) {
	this.name = name;
}

String getSuperpower() {
	return superpower;
}
void setSuperpower(String superpower) {
	this.superpower = superpower;
}
public String toString() {
	System.out.println(name + " has mad " + superpower + " skills.");
	return name;
}
}
