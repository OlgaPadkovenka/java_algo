package excercises;

public class LCD {
    public static void main(String[] args) {
        String[][] numbers = {
                {
                    " __",
                    "| |",
                    "|_|",
                },
                {
                    "  |",
                    "  |",
                    "  |",
                },
                {
                    "__ ",
                    " _|",
                    "|__",
                }
        };
        StringBuilder[] sb = new StringBuilder[3];
        for (int i = 0; i < 3; i++) {
            sb[i] = new StringBuilder();
        }
        String input = "102211";
        for (int i = 0; i < input.length(); i++) {
            int x = Integer.parseInt(input.charAt(i) + "");
            for (int j = 0; j < 3; j++) {
                sb[j].append(' ').append(numbers[x][j]);
            }
        }
        for (StringBuilder s : sb) {
            System.out.println(s.toString());
        }
    }
}
