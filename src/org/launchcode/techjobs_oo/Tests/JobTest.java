package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job_test;
    Job job_test2;

    @Before
    public void createJobObject(){
       job_test = new Job("Web Dev", new Employer("BoBo"), new Location("NC"),
                  new PositionType("Jr Dev"), new CoreCompetency("Persistence"));

       job_test2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                   new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @After
    public void deleteJobObject(){
        job_test =  new Job("null", new Employer("null"), new Location("null"),
                new PositionType("null"), new CoreCompetency("null"));

        job_test2 =  new Job("null", new Employer("null"), new Location("null"),
                new PositionType("null"), new CoreCompetency("null"));
    }
    @Test
    public void testSettingJobId() {

        assertTrue(job_test.getId() != job_test2.getId() );
    }

    @Test
    public void testJobConstructorSetsAllFields() {
     Job job = job_test;
     String name = job.getName();
     Employer employer = job.getEmployer();
     Location location = job.getLocation();
     PositionType positionType = job.getPositionType();
     CoreCompetency coreCompetency = job.getCoreCompetency();
        assertEquals(job.getName() , name);
        assertEquals(job.getEmployer(),employer );
        assertEquals(job.getLocation(), location);
        assertEquals(job.getPositionType(), positionType);
        assertEquals(job.getCoreCompetency(), coreCompetency);

    }

    @Test
    public void testJobConstructorCorrectlyAssignsClass(){
        assertTrue(job_test instanceof Job);
    }



    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Web Dev", new Employer("BoBo"), new Location("NC"),
                new PositionType("Jr Dev"), new CoreCompetency("Persistence"));

        Job job2 = new Job("Web Dev", new Employer("BoBo"), new Location("NC"),
                new PositionType("Jr Dev"), new CoreCompetency("Persistence"));

      assertFalse(job1.equals(job2));
    }
    @Test
    public void testToStringReturnsBlankLineBeforeAndAfter (){
       String job =  job_test.toString();
        String expectedJob = "\n"+ job_test + "\n";
        assertEquals(expectedJob, job);

    }
    @Test
    public void testStringShouldContainLabelForEachField(){
       String job = job_test.toString();
       String expectedJob = "\nID: "+ job_test.getId()+"\nName: " +
               job_test.getName()+"\nEmployer: "+ job_test.getEmployer()+ "\nLocation: "+
               job_test.getLocation()+ "\nPosition Type: "+ job_test.getPositionType()+ "\nCore Competency: "+
               job_test.getCoreCompetency()+ "\n";

       assertEquals(expectedJob, job);

    }




}
