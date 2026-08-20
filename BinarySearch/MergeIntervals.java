class Solution {
    public int[][] merge(int[][] intervals) {

        // 1. Sort by starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // 2. Start with the first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // 3. Check every next interval
        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Overlap
            if (nextStart <= end) {
                end = Math.max(end, nextEnd);
            }
            // No overlap
            else {
                result.add(new int[]{start, end});

                start = nextStart;
                end = nextEnd;
            }
        }

        // Add the final interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}
