package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lottoProb = 0.0000001235;
		int intLottoProb = (int)lottoProb;
		long population = 6973738433L;
		int intPopulation = (int)population;
		
		System.out.println( "�ζǿ� ��÷�� Ȯ�� :" +lottoProb);
		System.out.println( "�ζǿ� ��÷�� Ȯ�� int ��ȯ :" +intLottoProb);
		System.out.println( "�� ���� �α� �� :" +population);
		System.out.println( "�� ���� �α� �� int ��ȯ :" +intPopulation);

	}

}
