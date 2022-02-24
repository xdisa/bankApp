import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                "Выберете пункт меню:\n" +
                    "0. выход\n" +
                    "1. Перевод к карты на карту \n" +
                    "2. Перевод со счета на счет\n" +
                    ": "
            );
            int choice = scanner.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 2) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    Transfer transfer1 = TransferCardToCard.get(new Scanner(System.in));

                    ObjectMapper mapper = new ObjectMapper();
                    try {
                        String json = mapper.writeValueAsString(transfer1);
                        System.out.println("ResultingJSONString = " + json);

                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }

                    System.out.println("готово!");
                    while (true) {
                        System.out.println(
                            "Выберете пункт меню:\n" +
                                "0. выход\n" +
                                "1. Вывести ФИО отправителя в нижнем регистре \n" +
                                "2. Вывести ФИО отправителя в верхнем регистре\n" +
                                "3. Вывести ФИО получателя в нижнем регистре \n" +
                                "4. Вывести ФИО получателя в верхнем регистре\n" +
                                ": "
                        );
                        int choice1 = scanner.nextInt();
                        if (choice1 == 0)
                            break;
                        if (choice1 < 1 || choice1 > 4) {
                            System.out.println("выбран неправильный пункт меню, повторите ввод.");
                            continue;
                        }
                        switch (choice1) {
                            case 1:
                                System.out.println(transfer1.getSender().getFullNameLowerCase());
                                break;
                            case 2:
                                System.out.println(transfer1.getSender().getFullNameUpperCase());
                                break;
                            case 3:
                                System.out.println(transfer1.getRecipient().getFullNameLowerCase());
                                break;
                            case 4:
                                System.out.println(transfer1.getRecipient().getFullNameUpperCase());
                                break;
                        }
                    }
                    break;
                case 2:
                     Transfer transfer2 = TransferAccToAcc.get(new Scanner(System.in));
                    System.out.println("готово!");
                    ObjectMapper mapper2 = new ObjectMapper();
                    try {
                        String json = mapper2.writeValueAsString(transfer2);
                        System.out.println("ResultingJSONstring = " + json);

                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    while (true) {
                        System.out.println(
                            "Выберете пункт меню:\n" +
                                "0. выход\n" +
                                "1. Вывести ФИО отправителя в нижнем регистре \n" +
                                "2. Вывести ФИО отправителя в верхнем регистре\n" +
                                "3. Вывести ФИО получателя в нижнем регистре \n" +
                                "4. Вывести ФИО получателя в верхнем регистре\n" +
                                ": "
                        );
                        int choice2 = scanner.nextInt();
                        if (choice2 == 0)
                            break;
                        if (choice2 < 1 || choice2 > 4) {
                            System.out.println("выбран неправильный пункт меню, повторите ввод.");
                            continue;
                        }
                        switch (choice2) {
                            case 1:
                                System.out.println(transfer2.getSender().getFullNameLowerCase());
                                break;
                            case 2:
                                System.out.println(transfer2.getSender().getFullNameUpperCase());
                                break;
                            case 3:
                                System.out.println(transfer2.getRecipient().getFullNameLowerCase());
                                break;
                            case 4:
                                System.out.println(transfer2.getRecipient().getFullNameUpperCase());
                                break;
                        }
                    }
                    break;

            }
        }

    }
}
