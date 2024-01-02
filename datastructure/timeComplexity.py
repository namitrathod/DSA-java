print("hello world")

def multiply_number(n):
    return n*n

print(multiply_number(100))   # O(1)

def print_items(n):
    for i in range (n):
        print(i)
        
print_items(10)    # O(n)     

def print_item(n):
    for i in range (n):
        print(i)
    for j in range (n):
        print(j)
        
print_item(10)         #O(n)  drop the constant

def print_itemss(n): 
    for i in range(n):       #o(n)  
        for j in range(n):   #o(n)
            print(i,j)
            
print_itemss(10)           #O(n^2)

def print_itemsss(n):
    for i in range (n):
        for j in range(n):
            print(i,j)          #O(n^2)
    
    for k in range (n):
                print(k)        #O(n)
                
print_itemsss(10)      #O(n^2)  #O(n^2 + n)  but we can drop the non dominant terms therefore time complexity will be O(n^2)

