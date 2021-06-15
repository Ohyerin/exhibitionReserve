package exhibition.service;
import java.util.ArrayList;
import exhibition.dao.ExhibitionDao;
import exhibition.vo.Exhibition;

public class ExhibitionService {
	private static ExhibitionService service = new ExhibitionService();
	private ExhibitionService() {}
	private ExhibitionDao dao = ExhibitionDao.getInstance(); //DB처리하는 객체 dao가져옴.
	public static ExhibitionService getInstance()
	{
		return service;
	}
	public ArrayList<Exhibition> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	public ArrayList<Exhibition> getDetail(int eid) {
		// TODO Auto-generated method stub
		return dao.getDetail(eid);
	}


	





}
