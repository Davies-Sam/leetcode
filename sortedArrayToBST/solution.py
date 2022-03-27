from typing import List, Optional
#  Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:

        if nums : 
            point = len(nums)//2
            tree = TreeNode(nums[point])
            if nums[:point] :
                tree.left = self.sortedArrayToBST(nums[:point])
            if nums[point:] :
                tree.right = self.sortedArrayToBST(nums[point+1:])
            return tree

    def preOrderTraversal(self, root):
        if root:
            print(root.val)
            self.preOrderTraversal(root.left)
            self.preOrderTraversal(root.right)

if __name__ == "__main__":
    s = Solution()
    testCase = [-10,-3,0,5,9]
    print(f"Test Case: {testCase}")

    bstRoot = s.sortedArrayToBST(testCase)

    print(f"Resulting BST:")
    s.preOrderTraversal(bstRoot)
