package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lottoProb = 0.0000001235;
		int intLottoProb = (int)lottoProb;
		long population = 6973738433L;
		int intPopulation = (int)population;
		
		System.out.println( "로또에 당첨될 확률 :" +lottoProb);
		System.out.println( "로또에 당첨될 확률 int 변환 :" +intLottoProb);
		System.out.println( "전 세계 인구 수 :" +population);
		System.out.println( "전 세계 인구 수 int 변환 :" +intPopulation);

	}

}
