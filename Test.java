
public class Test {
	public static void main(String args[]){

		String x="abcdeedcbfgf";
		String y="aabccccdee";

		System.out.println(bomb(y));
	//	System.out.println(bomb2(y));
		System.out.println(bomb3(y));

	}


	public static  String bomb(String in){
		String out ="";

		for(int i=0; i<in.length();i++){
			String tempout="";

			if(out.endsWith(in.charAt(i)+"")){




				for(int j=0;j<out.length()-1;j++){
					tempout=tempout+out.charAt(j);		
				}
				out=tempout;
				continue;
			}
			out= out+in.charAt(i);
		}
		return out;
	}

	public static  String bomb2(String in){
		String out ="";
		for(int i=0; i<in.length();i++){
			int si=i;
			int ei=i;
			for(int j=i+1;j<in.length();j++){
				if((in.charAt(i)+"").equals((in.charAt(j)+""))){
					ei=j;
					continue;
				}
				else break;
			}
			System.out.println(si+" "+ei);
			if(si!= ei){
				System.out.println(in.substring(si, ei+1 ));
				out= bomb2(in.replace(in.substring(si, ei ),""));

			}



		}


		return out;
	}

public static String bomb3(String n){
	boolean exit=false;
	while(true){
		for(int i=0;i<n.length();i++){
			int si=i;
			int ei=i;
			for(int j=i+1;j<n.length();j++){
				if((n.charAt(i)+"").equals((n.charAt(j)+""))){
					ei=j;
					continue;
			
			}
				else break;
		}
			if(si!=ei){
				n=n.replace(n.substring(si, ei+1 ),"");
				break;
			}
			
			if(si==n.length()-1){exit=true;}
	}
	if(exit) break;	
}
return n;
}
}