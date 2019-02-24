package pattern2.chainOfResp;

/**
 * @author �ź���
 *	����
 */
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handlerRequest(LeaveRequest request) {
		if (request.getLeaveDays()<10) {
			System.out.println("Ա����"+request.getEmpName()+"��٣�������"+request.getLeaveDays()+"ԭ��"+request.getReason());
			System.out.println("�ܾ���"+this.name+",����ͨ��");
		} else {
			if (this.nextLeader!=null) {
				this.nextLeader.handlerRequest(request);
			}
		}
	}


}
