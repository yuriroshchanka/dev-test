package lsn.task3;

import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    private InputStream stdin = System.in;
    private PrintStream stdOut = System.out;
    private ByteArrayOutputStream output;

    @BeforeEach
    void beforeAll() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void testCase21() {
        String data = "2\n" +
                "1 2\n" +
                "3 2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 1\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase21same() {
        String data = "2\n" +
                "1 2\n" +
                "2 1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 1\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase22() {
        String data = "2\n" +
                "1 2\n" +
                "3 4\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 2\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase31() {
        String data = "3\n" +
                "1 2\n" +
                "3 4\n" +
                "3 2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 1\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase33() {
        String data = "3\n" +
                "1 2\n" +
                "5 4\n" +
                "3 6\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 3\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase31same() {
        String data = "3\n" +
                "1 2\n" +
                "3 2\n" +
                "2 1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 1\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase32() {
        String data = "3\n" +
                "1 2\n" +
                "5 4\n" +
                "3 2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 2\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase51() {
        String data = "5\n" +
                "1 2\n" +
                "5 4\n" +
                "3 2\n" +
                "6 5\n" +
                "4 3";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 1\n";
        assertEquals(testResult, output.toString());
    }

    @Test
    public void testCase52() {
        String data = "5\n" +
                "1 2\n" +
                "5 4\n" +
                "3 2\n" +
                "6 7\n" +
                "4 3";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        Solution3.main(new String[0]);

        String testResult = "input graphs number: \n" +
                "result: 2\n";
        assertEquals(testResult, output.toString());
    }

    @AfterEach
    void afterAll() {
        System.setIn(stdin);
        System.setOut(stdOut);
    }
}