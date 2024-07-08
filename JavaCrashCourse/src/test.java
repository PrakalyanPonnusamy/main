import java.lang.reflect.Array;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub[13422]
		int jana[] = {1,3,4,0,3};
		int len = jana.length;
		for (int i=0;i<len;i++) {
			for (int j=i+1;j<len;j++) {
				if(jana[i]==jana[j]) {
					System.out.println("This is the duplicate " + jana[j]);}}}}}

