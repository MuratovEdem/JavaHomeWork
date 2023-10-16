public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("123456789", "Алиса");
        phoneBook.add("987654321", "Иван");
        phoneBook.add("456789123", "Владимир");
        phoneBook.add("321654987", "Давид");
        phoneBook.add("123456523", "Иван");
        System.out.println(phoneBook.getPhoneNum("456789123"));
        System.out.println(phoneBook.getByName("Давид"));
        System.out.println(phoneBook.getAll());
    }
}
