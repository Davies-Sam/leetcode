#include <iostream>
using namespace std;

//node structure
struct ListNode 
{
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(NULL) {}
    ListNode() : val(-1), next(NULL) {}
};

class LinkedList 
{

public:
    LinkedList();
    void push_back(int newElement);
    void PrintList();  
    ListNode* GetNode(int val);

private:
    ListNode* head;
};