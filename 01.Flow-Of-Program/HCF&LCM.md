# Take two numbers as inputs and find their HCF and LCM

### Pseudocode
```
Start
input num1, num2
if num1>num2
    num=num1
    div=num2
else
    num=num2
    div=num1
end if
rem = num/div
while rem!=0
    num=div
    div=rem
    rem = num%div
end while
HCF=div
LCM=(num1*num2)/HCF
output HCF , LCM
exit
```