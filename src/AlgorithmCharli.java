import java.util.Scanner;

public class AlgorithmCharli {

    /*Пример массива ответов.(Первый элемент 0 для удобства, чтобы номер ответа в массиве совпадал с номером вопроса)
    int[] answers = {0, 1, 3, 1, 2, 4, 1, 5};*/
    int[] answers = new int[8]; // Ответы
    public String result;

    AlgorithmCharli () {

        gettingAnswers(); // Проходим тест, получаем ответы
        result = analyseAnswers(answers);

    }

    private void gettingAnswers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < answers.length; i++) { // Начинаем перечисление с 1!
            System.out.println("Введите ответ на вопрос " + i);
            answers[i] = scanner.nextInt(); // Потом надо сделать, чтобы ответы принимались из диапазона ответов
        }
    }

    private String analyseAnswers(int[] answers) {

        if (answers[1] == 1) {
            if (answers[6] == 1) {
                return "Йоркширский терьер";
            }
            if (answers[2] == 1 || answers[2] == 2 || answers[2] == 6) {
                if (answers[6] == 2) {
                    return "Бигль";
                }
            }
            if (answers[6] == 3 || answers[6] == 4) {
                return "Джек-рассел терьер";
            }
        }

        if (answers[1] == 2) {
            if (answers[2] == 1 || answers[2] == 2 || answers[2] == 6) {
                if (answers[6] == 1) {
                    return "Немецкая овчарка";
                }
            }
            if (answers[2] == 3 || answers[2] == 4) {
                if (answers[6] == 2 || answers[6] == 3) {
                    return "Золотистый ретрвивер";
                }
            }
            if (answers[6] == 4) {
                return "Сибирский хаски";
            }
        }

        if (answers[1] == 3) {
            if (answers[3] == 2 || answers[3] == 3) {
                if (answers[7] == 4 || answers[7] ==5) {
                    return "Британская короткошерстная";
                }
            }
            if (answers[4] == 1 || answers[4] == 2) {
                if (answers[6] == 3 || answers[6] == 4) {
                    return "Сиамская";
                }
            }
            return "Сибирская кошка";
        }

        if (answers[1] == 4) {
            if (answers[5] == 2 || answers[5] == 3 || answers[5] == 5) {
                if (answers[6] == 1) {
                    return "Шиншила";
                }
            }
            if (answers[2] == 2 || answers[2] == 3 || answers[2] == 4) {
                if (answers[4] == 4) {
                    return "Ёжик";
                }
            }
            if (answers[3] == 3){
                return "Хомяк";
            }
        }

        if (answers[1] == 5) {
            if (answers[2] == 1 || answers[2] == 2 || answers[2] == 6) {
                if (answers[5] == 2 || answers[5] == 3 || answers[5] == 5) {
                    return "Аквариумные рыбки";
                }
            }
            if (answers[2] != 1 && answers[2] != 6) {
                return "Королевский питон";
            }
            if (answers[6] != 4) {
                return "Лягушка";
            }
        }

        if (answers[1] == 6) {
            if (answers[2] == 1) {
                if (answers[4] == 1 || answers [4] == 3) {
                    return "Волнистый попугай";
                }
            }
            if (answers[4] == 2 || answers[4] == 4) {
                if (answers[6] == 1) {
                    return "Чиж";
                }
            }
            if (answers[3] == 3 && answers[4] == 4) {
                return "Канарейка";
            }
        }

        if (answers[1] == 7) {
            if (answers[2] == 1 || answers[2] == 2 || answers[2] == 6) {
                if (answers[6] == 1 || answers[6] == 2) {
                    return "Сверчок";
                }
            }
            if (answers[4] == 2 || answers[4] == 4) {
                return "Богомол";
            }
            if (answers[2] != 1 && answers[2] != 6) {
                return "Тарантул";
            }
        }

        return "Подходящий Вам питомец очень специфический и его нет в базе!";
    }
}
