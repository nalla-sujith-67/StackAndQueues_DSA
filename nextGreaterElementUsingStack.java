class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            ans.add(-1);
        }
        
        for(int i = arr.length-1;i>=0;i--){
          
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans.set(i,stack.peek());
            }    
            
            stack.add(arr[i]);
                
            // ans.add(stack.peek());
        }
        // Collections.reverse(ans);
        return ans;
    }
}
