class For_Loop {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println(" Outer " + i);

            for(int j = 0; j < 4; j++){
                System.out.println(" Inner " + j);
            }

            System.out.println("\n");
        }
    }
}
