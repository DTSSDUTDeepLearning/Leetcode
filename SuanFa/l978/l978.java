package SuanFa.l978;

public class l978 {

    public int maxTurbulenceSize(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return 1;
        }
        if (len == 2) {
            if (arr[0] == arr[1]) {
                return 1;
            }
            else {
                return 2;
            }
        }
        int max = 2;
        int index = 0;
        while (index < len-1 && arr[index] == arr[index+1]) {
            index++;
        }
        if (index == len-1) {
            return 1;
        }
        boolean flag = (arr[index] > arr[index+1])?true:false;
        int left = index;
        index++;
        for (;index < len-1;index++) {
            if (arr[index] == arr[index+1]) {
                if (max < index-left+1) {
                    max = index-left+1;
                }
                while (index < len-1 && arr[index] == arr[index+1]) {
                    index++;
                }
                if (index == len-1) {
                    if (max < index-left+1) {
                        return index-left+1;
                    }
                }
                else {
                    left = index;
                    flag = (arr[index] > arr[index+1])?true:false;
                }
            }
            else if ((arr[index] > arr[index+1] && flag) || (arr[index] < arr[index+1] && !flag)) {
                if (max < index-left+1) {
                    max = index-left+1;
                }
                left = index;
            }
            else {
                flag = !flag;
            }
        }
        if (max < index-left+1) {
            max = index-left+1;
        }
        return max;
    }
}
