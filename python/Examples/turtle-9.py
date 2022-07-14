from turtle import *

from random import randint

speed(0)

pensize(10)

colormode(255)

while True:
    color(randint(0,255), randint(0,255), randint(0,255))

    begin_fill()
    circle(20)
    end_fill()
    penup()
    goto(randint(-500,500), randint(-300,270))
    pendown()