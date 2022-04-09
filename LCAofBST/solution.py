# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        node = root
        
        while node:
            if max(p.val, q.val) < node.val:
                node = node.left
            elif min(p.val, q.val) > node.val:
                node = node.right
            else:
                return node

if __name__ == '__main__':
    s = Solution()
    # test case: [6,2,8,0,4,7,9,null,null,3,5]
    root = TreeNode(6)
    p = root.left = TreeNode(2)
    q = root.right = TreeNode(8)
    left = root.left
    right = root.right
    left.left = TreeNode(0)
    left.right = TreeNode(4)
    left.right.left = TreeNode(3)
    left.right.right = TreeNode(5)
    right.left = TreeNode(7)
    right.right = TreeNode(9)

    assert(s.lowestCommonAncestor(root, p, q).val == 6)
