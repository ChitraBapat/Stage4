public class FreqDig {
	public static void main(String[] args) {
		//System.out.println("Enter a number" );
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0;
		int number=44514621;
		System.out.print(number);
		System.out.print("\n");
		int no;
		no=number;
		while(number!=0)
		{
			int freq=number%10;
			number=number/10;
			
			switch(freq) {
			case 1:
				a++;
			    break;
			case 2:
				b++;
			    break;
			case 3:
				c++;
				break;
			case 4:
				d++;
			    break;
			case 5:
				e++;
			    break;
			case 6:
				f++;
				break;
			case 7:
				f++;
			    break;
			case 8:
				g++;
				break;
			default:
				break;			
			}
		}System.out.print("1  " +a);
		System.out.print("\n ");
		System.out.print("2  " +b);
		System.out.print("\n ");
		System.out.print("3  " +c);
		System.out.print("\n ");
		System.out.print("4  " +d);
		System.out.print("\n ");
		System.out.print("5  " +e);
		System.out.print("\n ");
		System.out.print("6  " +f);
		System.out.print("\n ");
		System.out.print("7  " +g);
		System.out.print("\n ");
		System.out.print("8  " +h);
		System.out.print("\n ");
	}
}
