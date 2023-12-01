public class AddDigits {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        String temp = Integer.toString(num);
        int sum = 0;

        do {
            sum = 0;
            for (int i = 0; i < temp.length(); i++) {
                sum += Integer.parseInt(String.valueOf(temp.charAt(i)));
            }
            if (sum < 10){
                break;
            }
            temp = Integer.toString(sum);
        }
        while(sum >= 10);

        return sum;
    }
}

