enum Status{
    Running, Failed, Pending, Success;
}

class Demo{
    public static void main(String[] args) {
        // int i = 5;
        Status[] s = Status.values();
        for(Status ss:s)
    	{
    		// System.out.println(ss);
    		System.out.println(ss+" : "+ss.ordinal());
    	}
    }
}