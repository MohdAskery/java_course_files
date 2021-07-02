import math
a = 4.503
b = 2.377
c = 3.902
s = (a + b + c) / 2
area = math.sqrt(s * (s - a) * (s - b) * (s - c))
print(area)