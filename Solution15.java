class Solution15 {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minutes = new int[n];

        for (int i = 0; i < n; i++) {
            String t = timePoints.get(i);
            int hrs = Integer.parseInt(t.substring(0, 2));
            int mins = Integer.parseInt(t.substring(3, 5));
            minutes[i] = hrs * 60 + mins;
        }

        Arrays.sort(minutes);

        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            ans = Math.min(ans, minutes[i] - minutes[i - 1]);
        }
        ans = Math.min(ans, 1440 - minutes[n - 1] + minutes[0]);

        return ans;
    }
}