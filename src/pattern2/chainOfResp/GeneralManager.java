package pattern2.chainOfResp;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handlerRequest(LeaveRequest request) {
		if (request.getLeaveDays()<30) {
			System.out.println("Ա����"+request.getEmpName()+"��٣�������"+request.getLeaveDays()+"ԭ��"+request.getReason());
			System.out.println("�ܾ���"+this.name+",����ͨ��");
		} else {
			System.out.println("Ī�����ְ");
		}
	}


}
