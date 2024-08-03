# stack

The stack is a linear data structure that is used to store the collection of objects. It is based on </b>Last-In-First-Out (LIFO)</b>. Java collection framework provides many interfaces and classes to store the collection of objects. One of them is the Stack class that provides different operations such as push, pop, search, etc.

# stack opration
1. Push O(1) -Add Element 
2. push O(1) -Remove Element 
3. Peek O(1)- retrive or fetched frist element in Stack (Jakana)

Push Opratin in Linked List :- 

![alt text](image.png)

pop Opratin in Linked List :-
![alt text](image-1.png)

* Collection Framework

  Stack<Integer> s=new Stack<>();


# Asked Question

1. Push at the Bottom of the Stack ?

Ans ->

* Apporch : - Use Recursion

1. Pop all element in Given stack
2. push Element 
3. push all Remove Element in stack

![alt text](image-2.png)
.
![alt text](image-3.png)

------------------------------------------------------------------***-----------------------------------------------------------------------

2. Reverse a String using a Stack ?
Ans-> Apporach

![alt text](image-4.png)

------------------------------------------------------------------***-----------------------------------------------------------------------

3. Reverse a Stack

Ans -> Use Recursion Apporch
1. Pop All element in stack
2. Push remove element at the Bottom of Stack.
3. if we are pushing element at botton position than next element is at bottom and inside element get top position.

![alt text](image-5.png)

# Stack visualizetion

![alt text](image-6.png)


------------------------------------------------------------------***-----------------------------------------------------------------------

## Most Important Question

4. Stock Span Problum
 
Ans -> 

Note :- 
    Stock :- its given in All Question.
    span :-max no of consecutive days for which price <= todays price   
    "which stock is grater or equl to of curr price as comparing with Previus Stock price calculate Diff between tham"

    Span=i(curr idx)-prevhigh idx
    100=1-0=1
        2-1=1
        3-1=2

![alt text](image-7.png)
    
------------------------------------------------------------------***-----------------------------------------------------------------------
# Important Question
5. Next Grater Element 

The next Grater Element of some element X in an Array is the Frist grater
element that is to the Right of x in the same array.

arr=[6,8,0,1,3]
next greater=[8,-1,1,3,-1]

Ans ->
1. while(s.empty()){
    stack[top]<=arr[i]
    s.pop()
}
2. if stack empty{
    nextgrater=-1
    else 
    nextgrater=s.peek();
}
3. s.push(ele)


------------------------------------------------------------------***-----------------------------------------------------------------------

6. valide Parenthsese

![alt text](image-8.png)

Ans->

Apporch

![alt text](image-9.png)


------------------------------------------------------------------***-----------------------------------------------------------------------
7. Duplicate Paaranthese

![alt text](image-10.png)

Ans ->

![alt text](image-11.png)


------------------------------------------------------------------***-----------------------------------------------------------------------
8. Max Area in Histogram

![alt text](image-12.png)