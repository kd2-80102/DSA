public class TestGenralStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenStack gst=new GenStack<>(2);
		gst.push(10);
		gst.push(20);
		System.out.println(gst.pop());
		System.out.println(gst.pop());


	}

}