class Solution {
    public List<Integer> getRow(int rowIndex) {
          List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1);  // C(rowIndex, 0) is always 1

        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;  // Use long to prevent overflow
            row.add((int) val);
        }

        return row;
        
    }
}