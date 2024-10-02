package PhamThiThuHa23680571;

import java.time.LocalDate;

public class DanhSachHangHoa {
private static void khoitaoDS(DanhSachHangHoa ds) {
	ds.them(new HangThucPham("TP001","Sữa", 8000.0, 10, "Vinamilk", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 9, 1)));
	ds.them(new HangThucPham("TP002","Gạo", 18000.0, 10, "Sông Lam", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1)));
	ds.them(new HangThucPham("TP003","Muối", 7000.0, 10, "Nha Trang Store", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1)));
	ds.them(new HangThucPham("TP004","Đường", 21000.0, 10, "Đường Biên Hòa", LocalDate.of(2023, 10, 1), LocalDate.of(2024, 10, 1)));
	
	ds.them(new HangDienMay("DM001", "Tivi", 8_000_000.0, 10, 24, 1500.0));
	ds.them(new HangDienMay(("DM002", "Bàn ủi", 200_000.0, 10, 6, 2000.0));
}

private void them(HangDienMay hangDienMay) {
	// TODO Auto-generated method stub
	
}

private void them(HangThucPham hangThucPham) {
	// TODO Auto-generated method stub
	
}
}
