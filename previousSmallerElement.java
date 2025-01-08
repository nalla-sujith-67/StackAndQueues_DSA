class Solution {
    // Function to find the next greater element for each element of the array.
    public int[] nextLargerElement(int[] arr) {
        // code here
        
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            ans.add(-1);
        }
        
        for(int i = 0;i<arr.length;i++){
          
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = arr[i];
            }    
            
            stack.push(arr[i]);
                
            // ans.add(stack.peek());
        }
        // Collections.reverse(ans);
        return ans;
    }
}
