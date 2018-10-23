package ch.newtype.harumscarum.fundament.enums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Truemmelbach
 */
public class SkillTest {

    @Test
    public void testIncrease() {
        Skill skill = Skill.DEVELOPER;
        skill = skill.increase();
        assertEquals(skill, Skill.ADVANCED);
        skill = skill.increase();
        assertEquals(skill, Skill.EXPERIENCED);
        skill = skill.increase();
        assertEquals(skill, Skill.PROFESSIONAL);
        skill = skill.increase();
        assertEquals(skill, Skill.SENIOR);
        skill = skill.increase();
        assertEquals(skill, Skill.EXPERT);
        skill = skill.increase();
        assertEquals(skill, Skill.EXPERT);
        skill = skill.increase();
        assertEquals(skill, Skill.EXPERT);
    }

    @Test
    public void testDecrease() {
        Skill skill = Skill.DEVELOPER;
        skill = skill.decrease();
        assertEquals(skill, Skill.JUNIOR);
        skill = skill.decrease();
        assertEquals(skill, Skill.BEGINNER);
        skill = skill.decrease();
        assertEquals(skill, Skill.POOR);
        skill = skill.decrease();
        assertEquals(skill, Skill.BAD);
        skill = skill.decrease();
        assertEquals(skill, Skill.NOTHING);
        skill = skill.decrease();
        assertEquals(skill, Skill.NOTHING);
        skill = skill.decrease();
        assertEquals(skill, Skill.NOTHING);
    }

    @Test
    public void testGet() {
        assertEquals(Skill.get(0), Skill.NOTHING);
        assertEquals(Skill.get(1), Skill.BAD);
        assertEquals(Skill.get(2), Skill.POOR);
        assertEquals(Skill.get(3), Skill.BEGINNER);
        assertEquals(Skill.get(4), Skill.JUNIOR);
        assertEquals(Skill.get(5), Skill.DEVELOPER);
        assertEquals(Skill.get(6), Skill.ADVANCED);
        assertEquals(Skill.get(7), Skill.EXPERIENCED);
        assertEquals(Skill.get(8), Skill.PROFESSIONAL);
        assertEquals(Skill.get(9), Skill.SENIOR);
        assertEquals(Skill.get(10), Skill.EXPERT);
    }

}