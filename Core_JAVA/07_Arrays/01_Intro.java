class Intro {
    public static void main(String a[]) {
        // int nums[] = {3,7,2,4};
        float nums[] = new float[5];
        nums[0] = 1.3f;
        nums[1] = 2.2f;
        nums[2] = 3.5f;
        nums[3] = 4.1f;
        nums[4] = 5.1f;

        float sum = 0f;
        for (int i = 0; i < 5; i++) {
            // if(nums[i]%2 != 0)
            sum += nums[i];
                // System.out.print(nums[i] + " ");
        }
        System.out.println(sum);
    }
}
