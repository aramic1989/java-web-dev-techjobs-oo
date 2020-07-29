package org.launchcode.techjobs_oo.tests
import org.junit.Test
import org.launchcode.techjobs_oo.*
import static org.junit.Assert.*
public class JobTest {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"))
        Job test_job2 = new Job("Developer", new Employer("Twitter"), new Location("Los Angeles"), new PositionType("JuniorDeveloper"), new CoreCompetency("Python"))
        Job test_job3 = new Job("Developer", new Employer("Twitter"), new Location("Los Angeles"), new PositionType("JuniorDeveloper"), new CoreCompetency("Python"))
        Job test_job_empty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""))
        Job test_job_null = new Job()
    @Test
    public void testingSettingJobId(){
        assertNotEquals(test_job.getId(),
                test_job2.getId())
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals(test_job.getName(),"Product tester")
        assertEquals(test_job.getEmployer().getValue(),"ACME")
        assertEquals(test_job.getLocation().getValue(),"Desert")
        assertEquals(test_job.getPositionType().getValue(),"Quality control")
        assertEquals(test_job.getCoreCompetency().getValue(),"Persistence")
    }
    @Test
    public void testJobsForEquality(){
        assertNotEquals(test_job2, test_job3)
    }
    @Test
    public void testToString() {
        assertEquals("ID: " + test_job.getId() +
                        "\nName: " + test_job.getName() +
                        "\nEmployer: " + test_job.getEmployer() +
                        "\nLocation: " + test_job.getLocation() +
                        "\nPosition Type: " + test_job.getPositionType() +
                        "\nCore Competency: " + test_job.getCoreCompetency() + "\n"
                , test_job.toString());
    }
    @Test
    public void testToStringEmptyField(){
        String testString = test_job_empty.toString()
        assertTrue(testString.contains("Data not available"))
    }
    @Test
    public void testToStringHasIdOnlyMessage(){
        assertEquals("OOPS! This job does not seem to exist.", test_job_null.toString())
    }
}
