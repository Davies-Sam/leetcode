#include <iostream>
#include "LinkedList.hpp"
using namespace std;

LinkedList::LinkedList():head(NULL){};

// Adds a new element to the back of the list
void LinkedList::push_back(int newElement) 
{

    ListNode* newNode = new ListNode();
    newNode->val = newElement;
    newNode->next = NULL; 

    if(this->head == NULL) 
    {
        this->head = newNode;
    } 
    else 
    {
        ListNode* temp = head;
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
    }    
}

// Displays the contents of the list
void LinkedList::PrintList() 
{

    ListNode* temp = head;
    if(temp != NULL) 
    {
        cout<<"The list contains: ";
        while(temp != NULL) 
        {
            cout<<temp->val<<" ";
            temp = temp->next;
        }
        cout<<endl;
    } 
    else 
    {
        cout<<"The list is empty.\n";
    }
}

// returns the first node that contains val
ListNode* LinkedList::GetNode(int val) 
{
    if(this->head == NULL)
    {
        return NULL;
    }

    else
    {
        ListNode* temp = this->head;

        while(temp != NULL)
        {
            if(temp->val == val)
            {
                return temp;
            }

            temp = temp->next;
        }

        return NULL;
    }
}