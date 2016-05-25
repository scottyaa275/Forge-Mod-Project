package pureMagic;

public enum MagicType {

	Summon("The user uses objects to summon entities from other worlds."),
	Spellbook("This type of magic is similar to the Elemental magic type, they can cast spells with movement/speaking, but they need a spellbook to do so."),
	Elemental("The user can cast spells with movement/speaking, they need to learn the spell first, they are also able to learn from spellbooks."),
	Control("The user is able to control things and make them move, they can only do this to living things."),
	Transform("The user is able to transform into many different things if they know in deatil what it is."),
	Script("This type of magic is similar to the Elemental magic type, they can cast spells with movement/speaking, only words are permitted (Script - Fire Creates fire)."),
	Equip("The user uses magical weapons and armor instead of learning the magic directly."),
	;
	
	MagicType()
	{
		
	}
	
	MagicType(String description)
	{
		
	}
}
