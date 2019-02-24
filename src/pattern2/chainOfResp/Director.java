package pattern2.chainOfResp;

/**
 * @author �ź���
 *	����
 */
public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handlerRequest(LeaveRequest request) {
		if (request.getLeaveDays()<3) {
			System.out.println("Ա����"+request.getEmpName()+"��٣�������"+request.getLeaveDays()+"ԭ��"+request.getReason());
			System.out.println("���Σ�"+this.name+",����ͨ��");
		} else {
			if (this.nextLeader!=null) {
				this.nextLeader.handlerRequest(request);
			}
		}
	}


}
