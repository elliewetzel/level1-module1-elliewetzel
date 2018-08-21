
public class SeaCreatureRunner {
public static void main(String[] args) {
	// 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
	SeaCreature spongebob = new SeaCreature("spongebob");
	spongebob.getName();
	spongebob.eat();
	spongebob.laugh();
	// 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	SeaCreature patrick = new SeaCreature("patrick");
	patrick.getName();
	patrick.eat();
	patrick.laugh();
	SeaCreature squidward = new SeaCreature("squidward");
	squidward.getName();
	squidward.eat();
	squidward.laugh();
}
}
