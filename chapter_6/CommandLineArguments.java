public class CommandLineArguments{
	
	public static void main(String[] args){
		String size = "";
		int[] arrays;
		
		if(args.length > 0){
			size += args;
			arrays = new int[Integer.parseInt(size)];
		}else{
			arrays = new int[10];
		}
		
	}
	
}