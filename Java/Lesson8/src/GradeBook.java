import java.util.*;

class GradeBook {
    private Map<String, List<Integer>> studentGrades;
    private static final int TOTAL_CLASSES = 10;

    public GradeBook(List<String> studentNames) {
        studentGrades = new HashMap<>();
        for (String name : studentNames) {
            List<Integer> grades = new ArrayList<>(Collections.nCopies(TOTAL_CLASSES, 0));
            studentGrades.put(name, grades);
        }
    }

    public void setGrade(String studentName, int classNumber, int grade) {
        if (!studentGrades.containsKey(studentName)) {
            System.out.println("Студент не найден.");
            return;
        }
        if (classNumber < 1 || classNumber > TOTAL_CLASSES) {
            System.out.println("Некорректный номер занятия.");
            return;
        }
        studentGrades.get(studentName).set(classNumber - 1, grade);
    }

    public void printGradesForClass(int classNumber) {
        if (classNumber < 1 || classNumber > TOTAL_CLASSES) {
            System.out.println("Некорректный номер занятия.");
            return;
        }

        System.out.println("Оценки за занятие №" + classNumber + ":");
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue().get(classNumber - 1);
            System.out.println(studentName + ": " + grade);
        }
    }

    public void printAllGrades() {
        System.out.println("Все оценки за весь курс:");
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Integer> grades = entry.getValue();
            System.out.println(studentName + ": " + grades);
        }
    }

    public double calculateAverageGrade(String studentName) {
        if (!studentGrades.containsKey(studentName)) {
            System.out.println("Студент не найден.");
            return -1;
        }

        List<Integer> grades = studentGrades.get(studentName);
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / TOTAL_CLASSES;
    }
}

