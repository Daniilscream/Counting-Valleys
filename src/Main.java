
// Complete the countingValleys function below.
static int countingValleys(int n, String s) {
        char [] ch = s.toCharArray ();
        int down = 0;
        int res=0;
        for (int i = 0; i <n ; i++) {
        if(ch[i]=='U'){
        down++;
        }
        if (ch[i]=='D'){
        down--;
        }
        if(down==0&&ch[i]=='U'){
        ++res;
        }
        }
        return res;
        }
