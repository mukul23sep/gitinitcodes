stackarr=[]
queuearr=[]
arr=[2,4,2,6,5]
stackarr.append(arr[0])
for i in range  (1,len(arr)):
    x=len(stackarr)
    for j in range(x):
        queuearr.insert(0,stackarr.pop())
    stackarr.append(arr[i])
    x=len(queuearr)
    for j in range(x):
        stackarr.append(queuearr.pop())

stackarr.reverse()
print(stackarr)