import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {
    Student empty;
    Student studentWithOne;
    Student studentWithMany;

    @Before
    public void setUp(){
        empty= new Student(1, "none", new ArrayList<>());

        studentWithOne = new Student(2, "one", new ArrayList<>());
        studentWithOne.addGrade(80);

        studentWithMany = new Student(3, "many", new ArrayList<>());
        studentWithMany.addGrade(80);
        studentWithMany.addGrade(90);
        studentWithMany.addGrade(90);
        studentWithMany.addGrade(80);
    }

    @Test
    public void testIsEmpty(){
        assertTrue(empty.grades.isEmpty());

        assertFalse(studentWithOne.grades.isEmpty());
    }

    @Test
    public void testSize(){
        assertEquals(0, empty.grades.size());

        assertEquals(1, studentWithOne.grades.size());

        assertEquals(4, studentWithMany.grades.size());
    }

    @Test
    public void testAdd(){

        assertTrue(empty.grades.isEmpty());

        empty.grades.add(80);

        assertFalse(empty.grades.isEmpty());

        assertFalse(studentWithOne.grades.isEmpty());

        assertFalse(studentWithMany.grades.isEmpty());
    }
}
