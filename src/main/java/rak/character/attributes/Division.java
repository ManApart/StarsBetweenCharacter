package rak.character.attributes;

public enum Division {
	COMMAND(Skill.NAVIGATION),
	ENGINEERING(Skill.POWER_DISTRIBUTION),
	SCIENCE(Skill.ANALYSIS),
	TACTICAL(Skill.ENERGYY_FIELDS);
	
	private Skill skill;
	
	private Division(Skill skill){
		this.skill = skill;
	}
}
