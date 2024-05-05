
class HubTea extends TeaMenu{
	/**HubTea 생성자이고 super();를사용하여 부모클래스의 생성자인 TeaMenu 생성자를 호출함*/
	HubTea() {
		super(3000); // 허브차 가격 변경 하는곳
		}
	@Override /**편하게 메서드 출력하기위해 주소값을 알려주는 toString메서드 사용*/
	public String toString() {
		return "\n허브차를 선택하셨습니다.\n";
		}
}