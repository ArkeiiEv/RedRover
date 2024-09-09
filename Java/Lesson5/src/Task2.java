public class Task2 {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        printLetterO(s);

        String s1 = "Перевыборы выбранного президента";
        countLetterE(s1);

        String s2 = "Посмотрите как Рите нравится ритм";
        printIndexString(s2);

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = countStringsWithoutE(array);
        System.out.println("Количество строк без 'е': " + count);
    }

    public static void printLetterO(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'о') {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
    }

    public static void countLetterE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println("Количество 'е': " + count);
    }

    public static void printIndexString(String str) {
        str = str.toLowerCase();
        String subString = "рит";
        for (int i = 0; i <= str.length() - subString.length(); i++) {
            if (str.startsWith(subString, i)) {
                System.out.println(i);
            }
        }
    }

    public static int countStringsWithoutE(String[][] array) {
        int count = 0;
        for (String[] strings : array)
            for (int j = 0; j < strings.length; j++) {
                if (!strings[j].contains("е")) {
                    count++;
                }
            }
        return count;
    }
}
