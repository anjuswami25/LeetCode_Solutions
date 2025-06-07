class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant=new LinkedList<>();
        Queue<Integer> dire=new LinkedList<>();
        int n=senate.length();

        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='D') dire.add(i);
            else radiant.add(i);
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int idir=dire.poll();
            int irad=radiant.poll();
            if(idir>irad) radiant.add(irad+n);
            else dire.add(idir+n);
        }
        return radiant.isEmpty()? "Dire" : "Radiant";

    }
}