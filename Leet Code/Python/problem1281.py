def subtractProductSum(num):
    sum = 0
    product = 1

    while (num > 0):
        sum += (num % 10)
        product *= (num % 10)
        num = num // 10
    
    return product - sum

myNum = int(input("Enter an Integer: "))
result = subtractProductSum(myNum)
print("Result is ", result)