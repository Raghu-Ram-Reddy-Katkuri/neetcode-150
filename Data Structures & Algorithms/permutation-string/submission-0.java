class Solution {

    private boolean check(int[] arr1, int[] arr2)
    {
        for(int i=0;i<26;i++)
        {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2)
    {
        int n1=s1.length(), n2=s2.length();

        int[] arr1=new int[26];
        int[] arr2=new int[26];
        if(n1>n2) return false;

        for(char s:s1.toCharArray())
        {
            arr1[s-'a']++;
        }

        int l=0;
        for(int r=0;r<n2;r++)
        {
            arr2[s2.charAt(r)-'a']++;
            if(check(arr1, arr2)) return true;
            if(l<=r-(n1-1))
            {
                arr2[s2.charAt(l)-'a']--;
                l++;
            }
        }
        return false;
        
    }
}
