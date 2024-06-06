#include "solution.hpp"

int Solution::countNodes(TreeNode* root) {
    if (root != nullptr)
    {
        return 1 + countNodes(root->left) + countNodes(root->right);
    }
    else
    {
        return 0;
    }
}