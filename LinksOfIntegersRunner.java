
public class LinksOfIntegersRunner
{
	public static void main ( String[] args )
	{
		LinksOfIntegers test = new LinksOfIntegers(new int[]{4,5,6,7,8,9,10,11,12,13});
		System.out.println(test);

		test = new LinksOfIntegers(new int[]{24,75,86,37,82,94,111,82,43});
		System.out.println(test);

		test = new LinksOfIntegers(new int[]{0,4,5,2,1,4,6});
		System.out.println(test);
	}
}