#include "TreeNode.hpp"

// Default constructor
TreeNode::TreeNode() : val(0), left(nullptr), right(nullptr) {}

// Constructor with a value
TreeNode::TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

// Constructor with value, left and right children
TreeNode::TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}

// Function to delete the entire tree recursively
void TreeNode::deleteTree(TreeNode* root) {
    if (root != nullptr) {
        deleteTree(root->left);
        deleteTree(root->right);
        delete root;
    }
}
