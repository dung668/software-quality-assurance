package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dungnd.model.UserTax;

public class datatest {
	public List<UserTax> getDatatest() throws ParseException {
		List<UserTax> test = new ArrayList<UserTax>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date f = new Date();
		f = formatter.parse("2018-03-23");
		test.add(new UserTax("001028094586","Ð?ng Van Huy?n","Giám d?c","0108763184",99040000,760000,9000000,3600000,1,27720000,f));
		f = formatter.parse("2018-03-02");
		test.add(new UserTax("001067926000","Lê Hoàng ti?n","Giám d?c","0106572109",98410000,760000,9000000,3600000,1,27499500,f));
		f = formatter.parse("2018-03-15");
		test.add(new UserTax("001071219526","Bùi Thu Nam","Giám d?c","0109694153",99900000,760000,9000000,7200000,2,26761000,f));
		f = formatter.parse("2018-03-10");
		test.add(new UserTax("001072407652","Bùi Hà Vinh","Qu?n lý","0105269214",73830000,760000,9000000,7200000,2,15957000,f));
		f = formatter.parse("2018-03-01");
		test.add(new UserTax("001053481026","Lý Hoàng Huy?n","Nhân viên","0106143274",48950000,760000,9000000,0,0,9377500,f));
		f = formatter.parse("2018-03-14");
		test.add(new UserTax("001064834278","Lê Bùi Th? Tam","Tru?ng phòng","0109697287",55020000,760000,9000000,7200000,2,9095000,f));
		f = formatter.parse("2018-03-14");
		test.add(new UserTax("001073476012","Bùi Bùi Th? Thành","Nhân viên","0106221032",43070000,760000,9000000,10800000,3,1206000,f));
		f = formatter.parse("2018-03-12");
		test.add(new UserTax("001049415926","Lê Hà Ð?t","Nhân viên","0102389960",34780000,760000,9000000,10800000,3,861000,f));
		f = formatter.parse("2018-03-05");
		test.add(new UserTax("001069608038","Tr?n Thu Sáng","Nhân viên","0107599351",37380000,760000,9000000,7200000,2,788000,f));
		f = formatter.parse("2018-03-17");
		test.add(new UserTax("001091163927","Lê Van Hi?u","Nhân viên","0107464778",20030000,760000,9000000,0,0,268500,f));
		f = formatter.parse("2018-03-16");
		test.add(new UserTax("001045567004","Tr?n Th? Trâm","Nhân viên","0105351390",14760000,760000,9000000,10800000,3,0,f));
		return test;
	}
}
