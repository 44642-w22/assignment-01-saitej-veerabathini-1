import java.util.*;
/**
 * @author S544725
 *
 */
public class Main {
	public static void main(String[] args){
// please uncomment the problems to run individually		
		
// 		problem1();
// 		problem2();
// 		problem3();
// 		problem4();
// 		problem5();
// 		problem6();
// 		problem7();
// 		problem8();
// 		problem9();
// 		problem10();
	}
	
	public static void problem1() {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of element");
		int num = sc.nextInt();
		System.out.println("enter "+num+" numbers");
		while(num>0) {
			l1.add(sc.nextInt());
			num--;
		}
		sc.close();
		
		System.out.println(perfectNumber(l1));
}
	
	private static LinkedList<Integer> perfectNumber(LinkedList<Integer> l1) {
		LinkedList<Integer> l2 = new LinkedList<>();		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			int sum=0;
			int number = it.next();			
			for(int i=1; i<number; i++) {
				if(number % i == 0) {
					sum = sum + i;
				}
			}
			if(sum == number) {
				l2.add(number);
			}
		}		
		return l2;
	}
	
	public static void problem2() {
		LinkedList<Integer> l1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of element");
		int num = sc.nextInt();
		System.out.println("enter "+num+" numbers");
		while(num>0) {
			l1.add(sc.nextInt());
			num--;
		}
		System.out.print(pairsElement(l1));
	}
	
	private static LinkedList<LinkedList<Integer>> pairsElement(LinkedList<Integer> l1) {
		System.out.println("enter k value");
		Scanner sc = new Scanner(System.in);
		LinkedList<LinkedList<Integer>> l3 = new LinkedList<LinkedList<Integer>>();
		int k = sc.nextInt();
		sc.close();
		Iterator<Integer> it = l1.iterator();
		for(int i=0;i<l1.size()-1;i++) {
			if(l1.get(i)+l1.get(i+1) == k) {	
				LinkedList<Integer> l2 = new LinkedList<>();
				l2.add(l1.get(i));
				l2.add(l1.get(i+1));
				l3.add(l2);	
				
			}			
		}			
			return l3;	
	}
	
	public static void problem3() {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of element");
		int num = sc.nextInt();
		System.out.println("enter "+num+" numbers");
		while(num>0) {
			a1.add(sc.nextInt());
			num--;
		}
		System.out.println("Max value is " + max(a1));

	}
	
	private static int max(ArrayList<Integer> a1) {
		int max=Integer.MIN_VALUE;
		if(!a1.isEmpty()) {			
			for(int i=0; i<a1.size()-1; i++) {
				if(a1.get(i)<a1.get(i+1)) {
					max=a1.get(i+1);
				}
				else {
					max=a1.get(i);
				}
			}
			return max;
		}
		else {
			return max;
		}
	}
	
	public static void problem4() {
		ArrayList<String> a1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of element");
		int num = sc.nextInt();
		System.out.println("enter "+num+" strings");
		while(num>0) {
			a1.add(sc.next());
			num--;
		}
		System.out.println(stringSort(a1));
	}
	
	private static ArrayList<String> stringSort(ArrayList<String> a1) {
		a1.sort((first, second) -> Integer.compare(first.length(),
                second.length()));
		return a1;
	}
	
	public static void problem5() {		
		Stack<Character> d1 = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter brackets");
		String s1 = sc.next();
		int size;
		for(int i=0; i< s1.length(); i++) {
			char ch = s1.charAt(i);
			
			if(ch == '{' || ch == '[' || ch =='(') {
				d1.add(ch);
			} else if (ch == '}' || ch == ']' || ch ==')') {
				
				char char1;
			try {
				char1 = d1.peek();
			} catch (EmptyStackException e) {
				d1.add(ch);
				break;
			}

			if(char1 == '{' && ch == '}') {
				d1.pop();
			} else if(char1 == '[' && ch == ']') {
				d1.pop();
			} else if(char1 == '(' && ch == ')') {
				d1.pop();
			} else {
				d1.push(ch);
			}
			} else {
				break;
			}
		}		
		if(d1.size() == 0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}		
	}
	
	public static void problem6() {
		Stack<Integer> stk = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of element");
		int num = sc.nextInt();
		System.out.println("enter "+num+" numbers");
		while(num>0) {
			stk.add(sc.nextInt());
			num--;
		}
		System.out.println(halfElement(stk));
		
	}
	
	private static ArrayList<Integer> halfElement(Stack<Integer> stk) {
		ArrayList<Integer> al = new ArrayList<>();
    	int size = stk.size() / 2;
    	for(int i = 0; i < size ; i++) 
    	{
    		al.add(stk.pop());
    	}
    	stk.sort(Collections.reverseOrder());
    	for(int i = 0; i < size ; i++) 
    	{	
    		al.add(stk.pop());
    	}
    	
    	return al;
	}
	
	public static void problem7() {
		Queue<String> q1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of binary elements");
		int num = sc.nextInt();
		System.out.println("enter "+num+" numbers");
		while(num>0) {
			q1.add(sc.next());
			num--;
		}
		System.out.println(binary(q1));		
	}
	
	private static int binary(Queue<String> q) {
		String empty = "";
		for (String item: q) {
    		empty += item;
        }    	
    	return Integer.parseInt(empty,2);
	}
	
	public static void problem8() {
		Deque<Integer> dq = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of elements");
		int num = sc.nextInt();
		System.out.println("enter "+num+" numbers");
		while(num>0) {
			dq.add(sc.nextInt());
			num--;
		}
		System.out.println(alternativeSequence(dq));
	}
	
	private static List<Integer> alternativeSequence(Deque<Integer> dq){
		List<Integer> list = new ArrayList<>();
		while (!dq.isEmpty()) {
			list.add(dq.pollLast());
			if (!dq.isEmpty())
				list.add(dq.pollFirst());

		}
		return list;
	}
	
	public static void problem9() 
	{
		Scanner scan = new Scanner(System.in);
		
		Queue<Integer> adq = new ArrayDeque<>();
		System.out.println("Enter number of elements:");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			int ele = scan.nextInt();
			adq.add(ele);
		}
		
		System.out.println(Evenodd(adq));
	}

	private static List<Integer> Evenodd(Queue<Integer> q1) {
		Queue<Integer> eL = new LinkedList<>();
		Queue<Integer> oL = new LinkedList<>();
		while (!q1.isEmpty()) {
			int l1 = q1.poll();
			if (l1 % 2 == 0) {
				eL.add(l1);
			} else {
				oL.add(l1);
			}

		}
		
		List<Integer> arrayList = new ArrayList<>();
		while (!eL.isEmpty() || !oL.isEmpty()) {
			if (!eL.isEmpty()) {
				arrayList.add(eL.poll());
			}
			if (!oL.isEmpty()) {
				arrayList.add(oL.poll());
			}
		}
		return arrayList;
	}
	
	public static void problem10() {
		Scanner sc=new Scanner(System.in);
		Deque<Character> dq=new LinkedList<>();
		System.out.println("Enter number of characters");
		int n=sc.nextInt();
		System.out.println("Enter  values for characters");
		for(int j=0;j<n;j++)
		{
			dq.addFirst(sc.next().charAt(0));
		}
		System.out.println("Enter number of binary numbers");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter binary numbers");
		for(int i=0;i<num;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		delChar(dq,a);
	}
	
public static void delChar(Deque<Character> dq,int[] a) {
		
		char c = 0;
		String strg="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				c=dq.removeLast();
			}
			if(a[i]==0)
			{
				if(c!=0)
				{
				dq.addLast(c);
				c=0;
				}
				
			}
		}
		int size=dq.size();
		for(int i=0;i<size;i++)
		{
			strg+=dq.removeLast();
		}
		System.out.println(strg);
	}

}


