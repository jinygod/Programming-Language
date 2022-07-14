# Turtle

import turtle

t = turtle.Pen()

n = 100

for x in range(n):
    for y in range(10):
        t.forward(n * 2)
        t.left(360/5)
    t.left(10)
    
input("press any key")