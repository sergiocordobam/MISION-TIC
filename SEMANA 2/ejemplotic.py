def parImpar(num):
    if num % 2 == 0:
        return "{} es par".format(num)
    else:
        return "{} es impar".format(num)
print(parImpar(2))