class Solution67 {

    public int countCollisions(String directions) {
        char[] directionChars = directions.toCharArray();
      
        int length = directionChars.length;
      
        int leftPointer = 0;
        int rightPointer = length - 1;
      
        while (leftPointer < length && directionChars[leftPointer] == 'L') {
            leftPointer++;
        }
      
        while (rightPointer >= 0 && directionChars[rightPointer] == 'R') {
            rightPointer--;
        }
      
        int collisionsCount = 0;
      
        for (int i = leftPointer; i <= rightPointer; ++i) {
            if (directionChars[i] != 'S') {
                collisionsCount++;
            }
        }
      
        return collisionsCount;
    }
}