import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("Mình là cá,việc của mình là bơi", "Takeshi", 90, 3, 0.2);
        listBook[1] = new Book("Tuổi trẻ đáng giá bao nhiêu", "Đặng Nguyễn Đông Vy", 80, 2, 0.2);
        listBook[2] = new Book("Năm thứ năm sống một mình", "Naoko", 190, 1, 0.2);
        listBook[3] = new Book("Nhất định mai sẽ trở thành ngày tốt", "Taguchi", 90, 5, 0.2);
        listBook[4] = new Book("Đừng lựa chọn an nhàn khi còn trẻ", "Cảnh Thiên", 95, 1, 0.2);
        double sum = 0;
        for (int i = 0; i < listBook.length; i++) {
            sum += listBook[i].getTotalPrice();
        }
        System.out.println("Tổng số tiền của 5 tựa sách là: " + sum);
        double sum1 = 0;
        for (int i = 0; i < listBook.length; i++) {
            sum1 += listBook[i].getTotalWeight();
        }
        System.out.println("Tổng khối lượng của 5 tựa sách là: " + sum1);
        System.out.println("Mời nhập tên sách muốn tìm");
        Scanner scanner = new Scanner(System.in);
        String input_name = scanner.nextLine();
        boolean find = false;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].findBook().equals(input_name)) {
                System.out.println(listBook[i].getName() + " Tác giả: " + listBook[i].getAuthor() + " Giá: " + listBook[i].getPrice() + " Số lượng: " + listBook[i].getQuantity() + " Khối lượng: " + listBook[i].getWeight());
                find = true;
                break;
            }
        }
            if (!find) {
                System.out.println("Không tìm thấy ");
            }

        }
    }

