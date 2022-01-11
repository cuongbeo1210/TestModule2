package Run_System;

import Manager.ManagerContact;
import Model.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class RunSystem {
    Scanner scanner = new Scanner(System.in);
    ManagerContact managerContact = new ManagerContact();
    int choice;

    public void MenuSystem() {
        do {
            System.out.println();
            System.out.println("❀______꧁☆☬CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ☬☆꧂_______❀");
            System.out.println("|                1. Xem Danh Sách                    |");
            System.out.println("|                2. Thêm Mới                         |");
            System.out.println("|                3. Cập Nhật                         |");
            System.out.println("|                4. Xóa                              |");
            System.out.println("|                5. Tìm Kiếm                         |");
            System.out.println("|                6. Ghi Vào File                     |");
            System.out.println("|                7. Đọc Từ File                      |");
            System.out.println("|                8. Thoát                            |");
            System.out.println("+----------------------------------------------------+");
            System.out.print("            Mời Nhập Lựa Chọn : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerContact.displayContacts();
                    break;
                case 2:
                    managerContact.addContact();
                    break;
                case 3:
                    System.out.print("Nhập Vào Số Điện Thoại");
                    String s = scanner.nextLine();
                    managerContact.editContact(s);
                    System.out.println(s);
                    break;
                case 4:
                    System.out.print("Nhập Số Điện Thoại : ");
                    String s1 = scanner.nextLine();
                    managerContact.deleteContact(s1);
                    System.out.println(s1);
                    break;
                case 5:
                    System.out.print("Nhập Tên Muốn Tìm : ");
                    String name = scanner.nextLine();
                    ArrayList<Contact> s2 = managerContact.searchContact(name);
                    System.out.println(s2);
                    break;
                case 6:
                    managerContact.writeFile(managerContact.getContactList(), ManagerContact.PATH_NAME);
                    break;
                case 7:
                    ArrayList<Contact> contacts = ManagerContact.readFile(ManagerContact.PATH_NAME);
                    contacts.forEach(System.out::println);
                    break;
                case 8:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
