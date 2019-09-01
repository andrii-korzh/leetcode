class Solution {
    public void reverseWords(char[] str) {
        int l = 0;
        int h = str.length - 1;
        while (l < h) swap(str, l++, h--);
        l = 0;
        while (l < str.length) {
            int next = next(str, l);
            h = next;
            while (l < h) swap(str, l++, h--);
            l = next + 2;
        }
    }

    void swap(char[] ar, int i, int j) {
        char x = ar[i];
        ar[i] = ar[j];
        ar[j] = x;
    }

    int next(char[] ar, int s) {
        while (s < ar.length && ar[s] != ' ') s++;
        s--;
        return s;
    }
}